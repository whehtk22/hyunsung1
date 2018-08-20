package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		��Ƽ ����Ʈ ���
//		�غ� : ���� �ν��Ͻ�, ��½�Ʈ��, ����, ���ص���
			
		File target = new File("files","multi.txt");
		
		/*FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);//����
		DataOutputStream data = new DataOutputStream(buffer);// ����
*/		DataOutputStream data = new DataOutputStream
		(new BufferedOutputStream(new FileOutputStream(target)));
		
//		[���α׷�] -> data -> buffer -> out -> target -> [����]

		data.write(100);//byte(�򰥸��Ƿ� ��� ����)
		data.writeByte(100);
		data.writeChar(100);
		data.writeInt(100);
		data.writeFloat(100);
		data.writeDouble(100);
		
		data.writeUTF("���ڿ� �׽�Ʈ");
		
		data.flush();//���ۿ� �ִ� ���� ����� ������ �ִ� ��
		data.close();//�ڵ����� flush�� ����
	}
}
