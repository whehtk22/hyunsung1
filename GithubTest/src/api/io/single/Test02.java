package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
//		�̱� ����Ʈ �Է�
//		�غ� : ���� �ν��Ͻ�, �Է¿� ���
//		���ǻ��� : ������ ������ ���� �Ұ�
		
		File target = new File("files","single.txt");
		
		FileInputStream in = new FileInputStream(target);
//		[���α׷�] <- in <- target <- [single.txt]
		
		//int n = in.read();
		System.out.println(in.available());
		//System.out.println(n);
		while(true) {
			if(in.read()==-1)break;
			System.out.println(in.read());
		}
	}
}
