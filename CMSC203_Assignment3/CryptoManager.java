/**
 * This is a utility class that encrypts and decrypts a phrase using three
 * different approaches.
 * 
 * The first approach is called the Vigenere Cipher.Vigenere encryption is a
 * method of encrypting alphabetic text based on the letters of a keyword.
 * 
 * The second approach is Playfair Cipher. It encrypts two letters (a digraph)
 * at a time instead of just one.
 * 
 * The third approach is Caesar Cipher. It is a simple replacement cypher.
 * 
 * @author Huseyin Aygun
 * @version 8/3/2025
 */

public class CryptoManager {

	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;
	// Use 64-character matrix (8X8) for Playfair cipher
	private static final String ALPHABET64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_";

	public static boolean isStringInBounds(String plainText) {
		for (int i = 0; i < plainText.length(); i++) {
			if (!(plainText.charAt(i) >= LOWER_RANGE && plainText.charAt(i) <= UPPER_RANGE)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Vigenere Cipher is a method of encrypting alphabetic text based on the
	 * letters of a keyword. It works as below: Choose a keyword (e.g., KEY). Repeat
	 * the keyword to match the length of the plaintext. Each letter in the
	 * plaintext is shifted by the position of the corresponding letter in the
	 * keyword (A = 0, B = 1, ..., Z = 25).
	 */

	public static String vigenereEncryption(String plainText, String key) {
		// to be implemented by students
		if (!isStringInBounds(plainText)) {
			return "The selected string is not in bounds, Try again.";

		}
		String result = "";
		for (int i = 0; i < plainText.length(); i++) {
			int plainIndex = plainText.charAt(i) - LOWER_RANGE;
			int keyIndex = key.charAt(i % key.length()) - LOWER_RANGE;
			result = result + (char) ((plainIndex + keyIndex) % RANGE + LOWER_RANGE);
		}
		return result;
	}

	// Vigenere Decryption
	public static String vigenereDecryption(String encryptedText, String key) {
		// to be implemented by students
		String result = "";
		for (int i = 0; i < encryptedText.length(); i++) {
			int encIndex = encryptedText.charAt(i) - LOWER_RANGE;
			int keyIndex = key.charAt(i % key.length()) - LOWER_RANGE;
			result = result + (char) ((encIndex - keyIndex + RANGE) % RANGE + LOWER_RANGE);
		}
		return result;
	}

	/**
	 * Playfair Cipher encrypts two letters at a time instead of just one. It works
	 * as follows: A matrix (8X8 in our case) is built using a keyword Plaintext is
	 * split into letter pairs (e.g., ME ET YO UR). Encryption rules depend on the
	 * positions of the letters in the matrix: Same row: replace each letter with
	 * the one to its right. Same column: replace each with the one below.
	 * Rectangle: replace each letter with the one in its own row but in the column
	 * of the other letter in the pair.
	 */

	public static String playfairEncryption(String plainText, String key) {
		// to be implemented by students
		// same row -> right, same column -> down, rectangle -> swap column
		if (!isStringInBounds(plainText) || !isStringInBounds(key)) {
			return "The selected string is not in bounds, Try again.";

		}
		if (plainText.length() % 2 != 0) {
			plainText += "x";
		}
		char[][] matrix = buildMatrix(key);
		String result = "";

		for (int i = 0; i < plainText.length(); i += 2) {
			char a = plainText.charAt(i);
			char b = plainText.charAt(i + 1);

			int[] positionA = findPos(matrix, a);
			int[] positionB = findPos(matrix, b);

			if (positionA[0] == positionB[0]) {
				result += matrix[positionA[0]][(positionA[1] + 1) % 8];
				result += matrix[positionB[0]][(positionB[1] + 1) % 8];
			} else if (positionA[1] == positionB[1]) {
				result += matrix[(positionA[0] + 1) % 8][positionA[1]];
				result += matrix[(positionB[0] + 1) % 8][positionB[1]];
			} else {
				result += matrix[positionA[0]][positionB[1]];
				result += matrix[positionB[0]][positionA[1]];
			}
		}
		return result;

	}

	// Vigenere Decryption
	public static String playfairDecryption(String encryptedText, String key) {
		// to be implemented by students
		// Shifts each character backward by the matching key character position
		String result = "";

		for (int i = 0; i < encryptedText.length(); i++) {
			int encIndex = encryptedText.charAt(i) - LOWER_RANGE;
			int keyIndex = key.charAt(i % key.length()) - LOWER_RANGE;
			result += (char) ((encIndex - keyIndex + RANGE) % RANGE + LOWER_RANGE);
		}
		return result;
	}

	/**
	 * Caesar Cipher is a simple substitution cipher that replaces each letter in a
	 * message with a letter some fixed number of positions down the alphabet. For
	 * example, with a shift of 3, 'A' would become 'D', 'B' would become 'E', and
	 * so on.
	 */

	public static String caesarEncryption(String plainText, int key) {
		// to be implemented by students
		// Shifts each character forward by key positions
		if (!isStringInBounds(plainText))
			return "The selected string is not in bounds, Try again.";

		String result = "";
		for (int i = 0; i < plainText.length(); i++) {
			int index = (plainText.charAt(i) - LOWER_RANGE + key) % RANGE;
			result += (char) (index + LOWER_RANGE);
		}
		return result;

	}

	// Caesar Decryption
	public static String caesarDecryption(String encryptedText, int key) {
		// to be implemented by students
		// Shifts each character backward by key positions
		String result = "";
		for (int i = 0; i < encryptedText.length(); i++) {
			int index = (encryptedText.charAt(i) - LOWER_RANGE - key + RANGE) % RANGE;
			result += (char) (index + LOWER_RANGE);
		}
		return result;

	}

}
