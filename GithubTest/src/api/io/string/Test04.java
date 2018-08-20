package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test04 {
	public static void main(String[] args) throws IOException {
//		문자열 출력
//		준비물 : 파일 인스턴스, 문자열 전용 통로
		
		File target = new File("files","string2.txt");
		FileWriter fw = new FileWriter(target);
//		fw.write("하루만 버티면 한국 뜬다!"+"\n");//기본적으로 버퍼가 내장되어 있다.
		
//		fw.flush();
//		fw.close();
//		외장 버퍼 추가 => 버퍼의 크기 조절 가능.
		BufferedWriter bw = new BufferedWriter(fw,1024);
		
//		bw.write("하루만 버티면 한국 뜬다!!\n");
//		bw.close();
		
//		출력 전용 엔터 추가 도구(다양한 형식의 출력을 지원)
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("하루만 버티면 한국 뜬다!");
		pw.println("하루만 버티면 한국 뜬다!");
		pw.println("하루만 버티면 한국 뜬다!");
		pw.println("하루만 버티면 한국 뜬다!");
		
		pw.close();
	}
}
