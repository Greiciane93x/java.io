package br.studant.java.io.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
//		String nome = "Ane Assis"; 
//		

//		Cliente cliente = new Cliente();
//		cliente.setNome("Ane Assis");
//		cliente.setProfissao("Dev Java");
//		cliente.setCpf("8217389271897");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin")); 
//		oos.writeObject(cliente);
//		oos.close();
////		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin")); 
		Cliente cliente = (Cliente) ois.readObject(); 
		ois.close(); 
		System.out.println(cliente.getProfissao());
	}

}
