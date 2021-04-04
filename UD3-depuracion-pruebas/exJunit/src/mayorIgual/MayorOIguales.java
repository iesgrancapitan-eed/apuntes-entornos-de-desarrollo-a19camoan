package mayorIgual;

public class MayorOIguales {
	public static void main(String[] args) {
		mayorOIguales(0, 0);
		mayorOIguales(1, 0);
		mayorOIguales(0, 1);
	}

	static String mayorOIguales(int a, int b) {
		if (a == b) // 2
			return ("Iguales"); // 4
		else if (a > b)  // 3
			return ("a: " + a + " es mayor"); // 5
		else
			return ("b: " + b + " es mayor"); // 6
	}
}
