package api.awt;

import java.awt.*;
import java.awt.event.*;


//Frame�� Ȯ���� Ŭ����
class Window02 extends Frame{
	public Window02() {
//		ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setLocation(100,200);	//x : 100, y : 200
		setSize(500, 400);		//�� : 300, ���� : 200
		setTitle("GUI �׽�Ʈ");
		setResizable(false);	//ũ�� ���� �Ұ�
		
		setVisible(true);		//ȭ�� ǥ��
	}
}


public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//â����
		
	}
}
