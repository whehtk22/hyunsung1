package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test04 {
	public static void main(String[] args) throws IOException {
//		���ڿ� ���
//		�غ� : ���� �ν��Ͻ�, ���ڿ� ���� ���
		
		File target = new File("files","string2.txt");
		FileWriter fw = new FileWriter(target);
//		fw.write("�Ϸ縸 ��Ƽ�� �ѱ� ���!"+"\n");//�⺻������ ���۰� ����Ǿ� �ִ�.
		
//		fw.flush();
//		fw.close();
//		���� ���� �߰� => ������ ũ�� ���� ����.
		BufferedWriter bw = new BufferedWriter(fw,1024);
		
//		bw.write("�Ϸ縸 ��Ƽ�� �ѱ� ���!!\n");
//		bw.close();
		
//		��� ���� ���� �߰� ����(�پ��� ������ ����� ����)
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("�Ϸ縸 ��Ƽ�� �ѱ� ���!");
		pw.println("�Ϸ縸 ��Ƽ�� �ѱ� ���!");
		pw.println("�Ϸ縸 ��Ƽ�� �ѱ� ���!");
		pw.println("�Ϸ縸 ��Ƽ�� �ѱ� ���!");
		
		pw.close();
	}
}
