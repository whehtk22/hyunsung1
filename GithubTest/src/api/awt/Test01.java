package api.awt;

import java.awt.Frame;

public class Test01 {
	public static void main(String[] args) {
		Frame a = new Frame();//â����
		
//		ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		a.setLocation(100,200);//x : 100, y : 200
		a.setSize(300, 200);//�� : 300, ���� : 200
		a.setTitle("GUI �׽�Ʈ");
		a.setResizable(false);
		
		a.setVisible(true);//ȭ�� ǥ��
	}
}
