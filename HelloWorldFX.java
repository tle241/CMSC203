package edu.mc.helloworldfx;	//tên package phải tên miền domain.tên tổ chức/công ty.tên dự án
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
//Primitive data types: kiểu dữ liệu nguyên thủy không tạo mới đc, k phải class, k phải object,
			//byte	số nguyên nhỏ				1 byte		•byte inches;
			//short	số nguyên nhỏ hơn int		2 byte		•short month;
			//int	số nguyên					4 byte		•int speed;
			//long	số nguyên lớn				8 byte		•long timeStamp;
			//float	số thực (dấu phẩy động)		4 byte		•float salesCommission;
			//double	số thực chính xác cao	8 byte		•double distance;
			//char		ký tự đơn				chứa kí tự số 66 VD. Thì nó là chữ 'A' trong mã ASCII, mã UNICODE 2^16 characters 
			//boolean	true/false






