package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) throws IOException, InterruptedException {
//	�̱� ����Ʈ�� �ѹ��� �������� �Է�(byte[])
//	-> �� �������� ������� ���� �׳� 5���� �Է¹���
//	-> buffer�� ũ�Ⱑ 5
		
//		���� �ó�����
//		-> 1ȸ�� : 5����	(5/18)
//		-> 2ȸ�� : 5����	(10/18)
//		-> 3ȸ�� : 5����	(15/18)
//		-> 5ȸ�� : 3����	(18/18)
		
		File target = new File("J:\\�ڹ�SW������\\1.�ڹٰ�������\\eclipse-java-photon-R-win32-x86_64.zip");
		File target2 = new File("J:/copy.exe");
		FileInputStream in = new FileInputStream(target);
		FileOutputStream out = new FileOutputStream(target2);
		byte[] buffer = new byte[5];
		//���� ����(1024 byte)
		byte[] buffer2 = new byte[1024000];
		
		while(true) {
			int size=in.read(buffer2);//�̰��� ��� �о������� int������ ��ȯ���ش�.
			System.out.println(size);
			if(size==-1)break;
			out.write(buffer2,0,size);//��� �д��� �� ���ڸ� ������ �ش�.
			Thread.sleep(1000L);
		}
		/*while(true) {
			int size=in.read(buffer);//�̰��� ��� �о������� int������ ��ȯ���ش�.
			if(size==-1)break;
			System.out.println(size+"/"+Arrays.toString(buffer));
			Thread.sleep(1000L);
		}*/
	out.close();
	in.close();
	}
}
