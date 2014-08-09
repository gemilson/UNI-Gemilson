package br.com.curso.jaxb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class TesteMarshal {

	public static void main(String[] args) throws JAXBException, FileNotFoundException{ 
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		produto.setNome ("camisa");
		produto.setDescricao("camisa M");
		produto.setPreco(75.2);
		Categoria categoria = new Categoria();
		categoria.setNome("vestuario");
		produto.setCategoria(categoria);
		JAXBContext context = JAXBContext.newInstance(Produto.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(produto, new FileOutputStream("camisa.xml"));

	}

}
