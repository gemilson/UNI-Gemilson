package br.com.curso.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class T�steUnmarshal {
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Produto.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		File file =  new File("camisa.xml");
		Produto produto = (Produto) unmarshaller.unmarshal(file);
		System.out.println(produto.getNome()+" - "+ produto.getCategoria().getNome());
		
	}

}
