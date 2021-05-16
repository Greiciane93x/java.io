package br.studant.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("texto2.txt"); 
		Writer osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw); 
		
		bw.write("Teste escrever"); 
		bw.newLine(); 
		bw.newLine(); 
		bw.write("Mais uma linha para teste"); 
	
		bw.close(); 
	}

	
//	OutputStream fos = new FileOutputStream("texto2.txt"); 
//	Writer osw = new OutputStreamWriter(fos); 
//	BufferedWriter bw = new BufferedWriter(osw); 
	

}
