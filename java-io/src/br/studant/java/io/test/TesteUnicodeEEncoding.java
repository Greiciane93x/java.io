package br.studant.java.io.test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) {
		String s = "C"; 
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		String sNovo = new String(bytes); 
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII); 
		System.out.println(bytes.length+ " , US-ASCII");
		
	}

}
