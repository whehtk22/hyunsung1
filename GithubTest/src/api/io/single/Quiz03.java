package api.io.single;

import java.io.File;
import java.io.IOException;

public class Quiz03 {

	public static void main(String[] args) throws IOException {
		File a = new File("J:\\�ڹ�SW������");
		File b = new File("J:\\����");
		System.out.println(b.getAbsolutePath());
		//b.createNewFile();
//		�����Ȳ�� �˰� ���� ��� CopyListener�� �����ؼ� �ڵ� �ۼ� �� ����
		CopyListener listner = (origin,dest,copy,total)->{
			System.out.println("��"+total+"byte ��"+copy+"byte ���� �Ϸ�");
		};
		FileUtil.setCopylistener(listner);
		FileUtil.copy(a, b);
		

	}

}
