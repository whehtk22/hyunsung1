package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test07 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		���� ���� Ŭ������ �̿��Ͽ� ��ü ������� ����
		Student1 stu = new Student1("ȫ�浿", 100, "����");
		
		File target = new File("files","student.txt");
		target.createNewFile();
		
		
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(target)));
		out.writeObject(stu);
		out.close();
		
	}
}
