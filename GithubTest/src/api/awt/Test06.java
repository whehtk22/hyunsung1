package api.awt;

import java.awt.*;
import java.awt.event.*;

//Frame�� Ȯ���� Ŭ����
class Window06 extends Frame {
	
	//�ʿ��� �ν��Ͻ��� ��� ������ ����
	private Button bt = new Button("��");
	private Button bt2 = new Button("�ƴϿ�");
	private Button bt3 = new Button("���");
	
	private FlowLayout flow = new FlowLayout(FlowLayout.RIGHT,50,100);
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(flow);
		
		this.add(bt);//this(â)�� bt�� �߰��ϰڽ��ϴ�.
		this.add(bt2);
		this.add(bt3);
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
	public Window06() {
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

public class Test06 {
	public static void main(String[] args) {
		Window06 a = new Window06(); // â����
		
	}
}
