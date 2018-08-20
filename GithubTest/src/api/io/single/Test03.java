package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException{
// 싱글 바이트를 한번에 여러개 내보내는 방법(byte[])
		
		File target = new File("files","single2.txt");
		
		FileOutputStream out = new FileOutputStream(target);
		
//		버퍼(buffer) 준비
		byte[] buffer = new byte[] {
//				65,66,67,68,69,
				'A','B','C','D','E','\t','h','e','l','l','o','\n','T'
		};
		
		out.write(buffer);//buffer의 모든 데이터를 내보내라
		out.write(buffer, 6, 5);//buffer의 0번 위치부터 5개만 내보내라
		out.close();
	}
}
