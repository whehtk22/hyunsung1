package api.awt;

import java.awt.*;
import java.awt.event.*;

class Dialog01 extends Dialog{

	private void display() {};
	private void event() {
		ActionListener listener = (ActionEvent e)->{
			
		};
		WindowListener window = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);//����ó��
				dispose();//���� â�� �Ҹ��Ŵ
			}
		};
		addWindowListener(window);
	};
	private void menu() {};
	
	public Dialog01(Frame arg0, String arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		display();
		event();
		menu();
		setLocation(100,200);
		setSize(300,400);
		setResizable(false);
		setVisible(true);
	}
	
}
//Frame�� Ȯ���� Ŭ����
class Window01 extends Frame {
	
	//�ʿ��� �ν��Ͻ��� ��� ������ ����
//	private Dialog sub = new Dialog(this,"Ȳ�κ�",false);//true=> ���� �Ұ���, false=> ���� ����
	
	private Dialog01 dialog = new Dialog01(this,"Ȳ�κ�",false);
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		
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

public class Test01dial {
	public static void main(String[] args) {
		Window01 a = new Window01(); // â����
		
	}
}
