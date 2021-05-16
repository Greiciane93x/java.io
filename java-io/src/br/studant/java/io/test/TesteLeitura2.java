package br.studant.java.io.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(new File("arquivo.csv")); 
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine(); 
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha); 
			linhaScanner.useLocale(Locale.US); 
			linhaScanner.useDelimiter(","); 
			
			String valor1 = linhaScanner.next(); 
			String valor2 = linhaScanner.next(); 
			String valor3 = linhaScanner.next(); 
//			String valor4 = linhaScanner.next(); 
//			String valor5 = linhaScanner.next(); 
//			String valor6 = linhaScanner.next(); 
			
			String valorFormatado = String.format(new Locale("pt", "BR") , "%s -  %s  - %s", valor1, valor2, valor3); 
			System.out.println(valorFormatado); 
			//valor4 + valor5 + valor6);
			
			linhaScanner.close();
			
//			
//			String[] valores = linha.split(","); 
//			System.out.println(valores[0]);
			// System.out.println(Arrays.toString(valores));
		}
		scanner.close();
		
	}

}
