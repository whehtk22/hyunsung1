package api.io.string;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
//		�̱۹���Ʈ �Է��� ����Ͽ� string.txt�� ������ �о�� ���
		
		File target = new File("files","string.txt");
		FileInputStream in = new FileInputStream(target);
		
		byte[] buffer = new byte[(int)target.length()];//����Ʈ �迭�� Ÿ�� ������ ũ�⸦ ����ش�.
		
		in.read(buffer);
		in.close();
		String str = new String(buffer);
		System.out.println(str);
	}
}
