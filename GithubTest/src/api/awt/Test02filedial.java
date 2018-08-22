package api.awt;

import java.awt.*;
import java.awt.event.*;

//Frame�� Ȯ���� Ŭ����
class Window07 extends Frame {
	
	//�ʿ��� �ν��Ͻ��� ��� ������ ����
	//��� ���α׷����� ���������� �ʿ�� �ϴ�
	//���� ����â/ ���� ����â ���� �̸� ������� Ŭ������ ���°�?
	
	private FileDialog fwindow = 
			new FileDialog(this, "���� ����", FileDialog.LOAD);
	
	private Button open = new Button("����");
	
	private void display() {
		this.add(open);
	}
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	
	private void event() {
		WindowListener window = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);//����ó��
				dispose();//���� â�� �Ҹ��Ŵ
			}
		};
		addWindowListener(window);
		open.addActionListener(e->{
			//���� ����â�� ǥ��
			fwindow.setVisible(true);
			
			//���� ����â�� ������ ������ �۾��� �ۼ�
			// - ���⸦ ��������? �����ٸ� ���� �����ΰ���?
			String dir = fwindow.getDirectory();
			String name = fwindow.getFile();
			System.out.println("dir = "+dir);
			System.out.println("file = "+name);
			
			if(dir!=null&name!=null) {
				System.out.println("���� ���� �ڵ带 �����մϴ�.!");
			}
		});
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	public Window07() {
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

public class Test02filedial {
	public static void main(String[] args) {
		Window07 a = new Window07(); // â����
		
	}
}
