package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException{
// �̱� ����Ʈ�� �ѹ��� ������ �������� ���(byte[])
		
		File target = new File("files","single2.txt");
		
		FileOutputStream out = new FileOutputStream(target);
		
//		����(buffer) �غ�
		byte[] buffer = new byte[] {
//				65,66,67,68,69,
				'A','B','C','D','E','\t','h','e','l','l','o','\n','T'
		};
		
		out.write(buffer);//buffer�� ��� �����͸� ��������
		out.write(buffer, 6, 5);//buffer�� 0�� ��ġ���� 5���� ��������
		out.close();
	}
}
