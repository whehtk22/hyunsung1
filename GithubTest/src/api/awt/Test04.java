package api.awt;

import java.awt.*;
import java.awt.event.*;

//Frame�� Ȯ���� Ŭ����
class Window04 extends Frame {
	
	//�ʿ��� �ν��Ͻ��� ��� ������ ����
	private Button bt = new Button("��ư");

	private Label lb = new Label("�� �׽�Ʈ~", Label.RIGHT);
	
	//�۲� �ν��Ͻ�
	private Font font= new Font("����", Font.PLAIN, 20);
	
	//���� �ν��Ͻ�
	private Color color = new Color(255, 0, 0);
	private Color bcolor = new Color(88,218,208);
	
	//Ŀ�� �ν��Ͻ�
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	
	private void display() {
		add(lb);		
		//add(bt);
		lb.setFont(font);
		lb.setForeground(color);//���ڻ�
		//lb.setBackground(bcolor);//����
		
		//��� ��ü ���
		lb.setForeground(Color.darkGray);
		lb.setBackground(Color.WHITE);
		
		//Ŀ�� ����
		lb.setCursor(cursor);
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
	public Window04() {
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

public class Test04 {
	public static void main(String[] args) {
		Window04 a = new Window04(); // â����
		
	}
}
