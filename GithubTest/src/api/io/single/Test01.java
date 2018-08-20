package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {

//	싱글 바이트 출력
//	준비물 : 파일 인스턴스, 출력용 통로
		
		File target = new File("files","single.txt");
		
//		target.createNewFile();
		FileOutputStream out = new FileOutputStream(target);
		
//		[프로그램]->out->target->[single.txt]
		
		out.write(65);//A
		out.write(97);
		out.write(30000);//48(손실이 발생, byte의 범위를 초과하였기 때문에)
		out.write(9);
		out.write(104);//h
		out.write(101);//e
		out.write(108);//l
		out.write(108);//l
		out.write(111);//o
		out.write(10);//\n
		
//		통로는 무조건 폐기해야 한다.
		out.close();
	}
}
