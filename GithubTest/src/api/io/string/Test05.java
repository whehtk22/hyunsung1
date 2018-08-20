package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) throws IOException, InterruptedException {
//		문자열 전용 입력
		
		File target = new File("files","string2.txt");
		
		FileReader fr = new FileReader(target);
		
		/*char[] buffer = new char[5];
		
		StringBuffer sb = new StringBuffer();
		while(true) {
			int size= fr.read(buffer);
			if(size==-1)break;
			sb.append(buffer,0,size);
		}*/
//		System.out.println(sb.toString());
//		fr.close();
		
//		버퍼 추가
		BufferedReader br = new BufferedReader(fr,1024);
		while(true) {
			String line = br.readLine();
			if(line==null)break;
			System.out.println("line = "+line);
			Thread.sleep(1000L);
		}
		br.close();
		
	}
}
