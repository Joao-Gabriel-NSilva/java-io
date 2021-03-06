package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// fluxo de entrada com arquivo
		InputStream fis = System.in; // new FileInputStream("lorem.txt"); new Socket().getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out;//new FileOutputStream("lorem2.txt"); new Socket().getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		bw.close();
		br.close();
	}

}
