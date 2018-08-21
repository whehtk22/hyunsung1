package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

//Frame�� Ȯ���� Ŭ����
class Window02 extends Frame {

	// �׸��� �׸� �� �ִ� ��ȭ�� ���� Ŭ����
	// ���� Canvas�� �ƴϴ��� ��� ������Ʈ�� �׸��� �׸� �� �ִ�.

	// �׸��� �׸��� ���� �����ϴ� ������ ����(�������Ͽ� ���)
	private Image image = Toolkit.getDefaultToolkit().getImage("image/pororo.jpg");
	private int x = 10,y = 10, width=200,height=250;
	private Canvas can = new Canvas() {
		@Override
		public void paint(Graphics arg0) {
			arg0.drawImage(image, x, y, width, height, this);
//			arg0.drawImage(image,10,10,200,250,this);
		}
	};

	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(can);

	}

	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */

	private void event() {
		
	}

	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {

	}

	public Window02() {
		this.display();
		event();
		menu();
//		ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 400); // �� : 300, ���� : 200
		setTitle("GUI �׽�Ʈ");
		setResizable(false); // ũ�� ���� �Ұ�

		setVisible(true); // ȭ�� ǥ��
		walk();
	}
	
	public void walk() {
//		�̵��� �����ϱ� ���� �ؾ��� �۾�
//		[1] ��ǥ�� ���� �� [2] �ٽ� �׷��� 
		while(true) {
			x++;
			System.out.println("x="+x);
			if(x>can.getWidth()+10)break;
			can.repaint();//paint()�� �ٽ� �����ϼ���
			try{Thread.sleep(100);}
			catch(Exception e) {}
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02(); // â����

	}
}
