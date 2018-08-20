package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) throws IOException, InterruptedException {
//	싱글 바이트를 한번에 여러개씩 입력(byte[])
//	-> 몇 글자인지 고려하지 말고 그냥 5개씩 입력받자
//	-> buffer의 크기가 5
		
//		예상 시나리오
//		-> 1회차 : 5글자	(5/18)
//		-> 2회차 : 5글자	(10/18)
//		-> 3회차 : 5글자	(15/18)
//		-> 5회차 : 3글자	(18/18)
		
		File target = new File("J:\\자바SW조현성\\1.자바관련파일\\eclipse-java-photon-R-win32-x86_64.zip");
		File target2 = new File("J:/copy.exe");
		FileInputStream in = new FileInputStream(target);
		FileOutputStream out = new FileOutputStream(target2);
		byte[] buffer = new byte[5];
		//버퍼 설정(1024 byte)
		byte[] buffer2 = new byte[1024000];
		
		while(true) {
			int size=in.read(buffer2);//이것은 몇개를 읽었는지를 int형으로 반환해준다.
			System.out.println(size);
			if(size==-1)break;
			out.write(buffer2,0,size);//몇개를 읽는지 그 숫자를 지정해 준다.
			Thread.sleep(1000L);
		}
		/*while(true) {
			int size=in.read(buffer);//이것은 몇개를 읽었는지를 int형으로 반환해준다.
			if(size==-1)break;
			System.out.println(size+"/"+Arrays.toString(buffer));
			Thread.sleep(1000L);
		}*/
	out.close();
	in.close();
	}
}
