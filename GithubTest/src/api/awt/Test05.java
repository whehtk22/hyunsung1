package api.awt;

import java.awt.*;
import java.awt.event.*;

//Frame�� Ȯ���� Ŭ����
class Window05 extends Frame {
	
	//�ʿ��� �ν��Ͻ��� ��� ������ ����
	private Button bt = new Button("��ư");

	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(bt);//this(â)�� bt�� �߰��ϰڽ��ϴ�.
		
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
	public Window05() {
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

public class Test05 {
	public static void main(String[] args) {
		Window05 a = new Window05(); // â����
		
	}
}