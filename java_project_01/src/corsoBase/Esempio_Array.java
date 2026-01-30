package corsoBase;

public class Esempio_Array {

	public static void main(String[] args) {
		// ARRAY
		System.out.println("Array 1: ");
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}

		System.out.println();

		System.out.println("Array 2: ");
		array[2] = -66;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}

		System.out.println();

		// Array di lettere con ForEach
		System.out.println("Array lettere: ");
		char[] nome = { 'L', 'o', 'r', 'e', 'n', 'z', 'o' };
		System.out.println(nome.length);

		for (char c : nome) {
			System.out.print(c + " ");
		}
	}

}
