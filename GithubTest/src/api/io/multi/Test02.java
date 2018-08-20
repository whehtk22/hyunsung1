package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
//		멀티 바이트 입력
//		준비물 : 파일 인스턴스, 입력스트림, 버퍼, 조립도구

		File target = new File("files", "multi.txt");
		/*
		 * FileInputStream in = new FileInputStream(target); BufferedInputStream buffer
		 * = new BufferedInputStream(in); DataInputStream data = new
		 * DataInputStream(buffer);
		 */
		
		DataInputStream data = new DataInputStream(new BufferedInputStream(new FileInputStream(target)));
		int a = data.read();// byte(쓰지 말 것)
		byte b = data.readByte();
		char c = data.readChar();
		int d = data.readInt();
		float e = data.readFloat();
		double f = data.readDouble();
		
		String g = data.readUTF();
		data.close();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
	}
}
