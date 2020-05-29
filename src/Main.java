import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Zadejte cislo v decimalni soustave: ");
		int decCislo = sc.nextInt();

		ArrayList<Integer> binArray = new ArrayList<>();
		binArray.addAll(Convertor.toBinary(decCislo));

		System.out.print("Cislo " + decCislo + " ma v binarni soustave hodnotu ");
		Convertor.toString(binArray);

		System.out.println("\r\n");
		System.out.println("Zadejte cislo v binarni soustave: ");
		int binCislo = sc.nextInt();

		int cislo = Convertor.toDecimal(binCislo);
		System.out.print("Cislo " + binCislo + " ma v decimalni soustave hodnotu " + cislo);
		
		sc.close();
	}

}
