package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {

//	�̱� ����Ʈ ���
//	�غ� : ���� �ν��Ͻ�, ��¿� ���
		
		File target = new File("files","single.txt");
		
//		target.createNewFile();
		FileOutputStream out = new FileOutputStream(target);
		
//		[���α׷�]->out->target->[single.txt]
		
		out.write(65);//A
		out.write(97);
		out.write(30000);//48(�ս��� �߻�, byte�� ������ �ʰ��Ͽ��� ������)
		out.write(9);
		out.write(104);//h
		out.write(101);//e
		out.write(108);//l
		out.write(108);//l
		out.write(111);//o
		out.write(10);//\n
		
//		��δ� ������ ����ؾ� �Ѵ�.
		out.close();
	}
}
