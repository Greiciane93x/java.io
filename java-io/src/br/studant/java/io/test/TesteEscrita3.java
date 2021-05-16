package br.studant.java.io.test;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita3 {
	
	
	public static void main(String[] args) throws IOException {
		//PrintStream ps = new PrintStream("texto.txt");
		PrintWriter ps = new PrintWriter("texto2.txt"); 
		
		ps.println("Ane nane assis"); 
		ps.println(); 
		ps.println("auhahah "); 
		
		ps.close(); 
		
		System.out.println();
		
	}
	 

}
