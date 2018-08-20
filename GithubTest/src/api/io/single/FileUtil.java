package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	static CopyListener listener;
	
	
	public static CopyListener getListener() {
		return listener;
	}


	public static void setCopylistener(CopyListener copylistener) {
		FileUtil.listener = copylistener;
	}


	static void copy(File a, File b) throws IOException {
		byte[] buffer = new byte[1024];
		
		if(!a.exists()) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}else {
			if(a.isDirectory()) {//���͸��� ���� ������ �׳� mkdirs�� �̿��ϴ� ���̴�.
				b.mkdirs();
				File[] list = a.listFiles();
				if(list!=null) {
				for(File v:list) {//���� ����� �� �ȿ� �ִ� ���ϵ� Ȯ��
					File target = new File(b,v.getName());
					FileUtil.copy(v, target);//���� ���� ���ϵ� �ϳ��ϳ��� ���ؼ� ���ȣ��
				}
				}
			}
			else if(a.isFile()) {//���� ����
				FileInputStream in = new FileInputStream(a);
				FileOutputStream out = new FileOutputStream(b);//������ ��쿡�� input, outputstream�� ���� ���̴�.
				while(true) {
					int size=in.read(buffer);//�̰��� ��� �о������� int������ ��ȯ���ش�.
					System.out.println(size);
					if(size==-1)break;
					out.write(buffer,0,size);//��� �д��� �� ���ڸ� ������ �ش�.
					
				}
				in.close();
				out.close();
			}
		}
		
	}
}
