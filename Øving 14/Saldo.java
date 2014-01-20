/**
 * Saldo.java
 *
 * Oppgave 16.13.3
 * 
 */

import java.util.*;
import java.io.*;

class Saldo {
	public static void main(String[] args) throws IOException {
		String saldoFil = "Saldo.txt";
		String transaksjonFil = "Transaksjon.txt";
		
		FileReader leseforbTilFil1 = new FileReader(saldoFil);
		BufferedReader leser1 = new BufferedReader(leseforbTilFil1);
		
		String saldo = leser1.readLine();
		double saldoLest = Double.parseDouble(saldo);
		leser1.close();
		
		FileReader leseforbTilFil2 = new FileReader(transaksjonFil);
		BufferedReader leser2 = new BufferedReader(leseforbTilFil2);
		Scanner scan = new Scanner(leser2);
		
		while (scan.hasNext()) {
			String transaksjon = leser2.readLine();
			String[] uEllerI = transaksjon.split("[ ]"); // FÅR NULLPOINTEREXCEPTION!
			if (uEllerI[0].equals("U")) {
				saldoLest -= Double.parseDouble(uEllerI[1]);
			} else if (uEllerI[0].equals("I")) {
				saldoLest += Double.parseDouble(uEllerI[1]);
			}
		}
		leser2.close();
		if (saldoLest >= 0) {
			FileWriter skriveforbTilFil = new FileWriter(saldoFil);
			PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveforbTilFil));
			skriver.print(saldoLest);
			skriver.close();
		}
	}
}