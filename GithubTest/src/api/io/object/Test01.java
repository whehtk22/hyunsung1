package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		��ü ���
//		�غ� : ���� �ν��Ͻ�, ��½�Ʈ��, ����, ����+����ȭ ����
		File target = new File("files","object.txt");
		
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
//		Object �ν��Ͻ��� ����� Object ���·� ����
		String str = "�ȳ��ϼ��� hello";
		System.out.println(str instanceof Object);
		
		object.writeObject(str);
		object.close();
		
	}
}
