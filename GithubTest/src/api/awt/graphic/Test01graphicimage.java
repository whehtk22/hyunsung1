package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

//Frame�� Ȯ���� Ŭ����
class Window01 extends Frame {
	
	//�׸��� �׸� �� �ִ� ��ȭ�� ���� Ŭ����
	//���� Canvas�� �ƴϴ��� ��� ������Ʈ�� �׸��� �׸� �� �ִ�.
	
	//�׸��� �׸��� ���� �����ϴ� ������ ����(�������Ͽ� ���)
	
	private Canvas can = new Canvas() {
		@Override
		public void paint(Graphics g) {
			//g	��
			//this(can) ��ȭ��(Canvas)
			g.drawLine(50, 50, 150, 50);	//��
			g.drawRect(50, 100, 100, 100);	//�簢��
			g.drawOval(50, 100, 100, 100);	//��
			
			g.setColor(Color.blue);
			g.setFont(new Font("�ü�",Font.BOLD,30));
			
			g.drawString("Hello Graphic!", 100, 250);
			
			//�̹���
			Image img = Toolkit.getDefaultToolkit().getImage("image/pororo.jpg");
			g.drawImage(img, 50, 50, 300, 300, this);
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
	public Window01() {
		this.display();
		event();
		menu();
//		ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 400); // �� : 300, ���� : 200
		setTitle("GUI �׽�Ʈ");
		setResizable(false); // ũ�� ���� �Ұ�

		setVisible(true); // ȭ�� ǥ��
	}
}

public class Test01graphicimage {
	public static void main(String[] args) {
		Window01 a = new Window01(); // â����
		
	}
}
