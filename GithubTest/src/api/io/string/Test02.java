package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) throws IOException {
//	문자열을 바이트로 변환하여 싱글바이트 출력을 사용
		
		File target = new File("files","string.txt");
		target.createNewFile();
		FileOutputStream out = new FileOutputStream(target);

		String text = "하루만 더 있으며 휴가다!!";
		out.write(text.getBytes());//이 방식은 문자가 깨져서 나가지 않는다.
		
		out.close();
	}

}
