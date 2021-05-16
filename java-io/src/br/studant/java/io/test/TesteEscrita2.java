package br.studant.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {

		FileWriter fr = new FileWriter("texto.txt"); 
		BufferedWriter bw = new BufferedWriter(fr); 
		fr.write("Teste escrever"); 
		bw.newLine();
		bw.newLine();
		bw.newLine();
		fr.write("Mais uma linha para teste"); 
		fr.close(); 
	}

	


}
