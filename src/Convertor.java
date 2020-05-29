import java.util.ArrayList;

public class Convertor {

	public static ArrayList<Integer> toBinary(int cislo) {
		ArrayList<Integer> binArray = new ArrayList<>();

		while (cislo > 0) {
			binArray.add(cislo % 2);
			cislo = cislo / 2;
		}
		return binArray;
	}

	public static void toString(ArrayList<Integer> binArray) {
		for (int i = binArray.size() - 1; i >= 0; i--) {
			System.out.print(binArray.get(i));
		}
	}

	public static int toDecimal(int binCislo) {
		int decCislo = 0;
		int rad = 1;

		while (binCislo > 0) {
			int temp = binCislo % 10;
			binCislo = binCislo / 10;

			decCislo = decCislo + temp * rad;
			rad = rad * 2;
		}
		return decCislo;
	}
	
}
