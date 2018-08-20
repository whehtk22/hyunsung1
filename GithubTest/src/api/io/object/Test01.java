package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		객체 출력
//		준비물 : 파일 인스턴스, 출력스트림, 버퍼, 분해+직렬화 도구
		File target = new File("files","object.txt");
		
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
//		Object 인스턴스를 만들어 Object 형태로 저장
		String str = "안녕하세요 hello";
		System.out.println(str instanceof Object);
		
		object.writeObject(str);
		object.close();
		
	}
}
