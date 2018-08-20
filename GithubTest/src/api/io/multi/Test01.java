package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		멀티 바이트 출력
//		준비물 : 파일 인스턴스, 출력스트림, 버퍼, 분해도구
			
		File target = new File("files","multi.txt");
		
		/*FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);//보관
		DataOutputStream data = new DataOutputStream(buffer);// 분해
*/		DataOutputStream data = new DataOutputStream
		(new BufferedOutputStream(new FileOutputStream(target)));
		
//		[프로그램] -> data -> buffer -> out -> target -> [파일]

		data.write(100);//byte(헷갈리므로 사용 금지)
		data.writeByte(100);
		data.writeChar(100);
		data.writeInt(100);
		data.writeFloat(100);
		data.writeDouble(100);
		
		data.writeUTF("문자열 테스트");
		
		data.flush();//버퍼에 있는 것을 비워서 전송해 주는 것
		data.close();//자동으로 flush를 수행
	}
}
