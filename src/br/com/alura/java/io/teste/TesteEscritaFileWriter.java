package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.newLine();
		bw.write("asd asdadfadf ad adfdfdf daf adf fdf");

		bw.close();
	}

}
