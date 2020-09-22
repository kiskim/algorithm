package baekjoon.level7.b11654;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c;
		try{
			c = br.read();
			bw.write(Integer.toString(c));
			bw.flush();
			br.close();
			bw.close();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		
	}
}