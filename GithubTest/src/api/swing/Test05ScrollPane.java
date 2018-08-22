package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Swing���� ����ϴ� Frame : JFrame
 * @author Administrator
 *
 */
class Window05 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
//	TextArea ------> JTextArea : ��ũ�ѹٰ� �����
//	Swing������ ��ũ�� ���� ��ü�� Ŭ������ ��������
	private JTextArea area = new JTextArea();
	private JScrollPane pane = new JScrollPane(area);
	
	public Window05() {	
		display();
		event();
		menu();
		
		setTitle("Swing����");
//		setLocation(100,100);
		setLocationByPlatform(true);//��ġ�� �ü���� �ñ�ڴ�.
		setSize(400,400);
		setResizable(false);
		setVisible(true);;;;;;;;;;;;;;;
	}
	/**
	 * ȭ�� ���� �޼ҵ�
	 */
	public void display() {
		setContentPane(con);//con�� Component ���� �������� ���
		con.setLayout(new BorderLayout());
		con.add(pane);
		//this���� con�� ������Ʈ�� �߰�
		
	}
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
		//awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
		//-> Swing������ �ɼ��� ���� �����ϵ��� ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x������ ���α׷� ����
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x������ â ����
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//����� ���� ����
		
		
	}
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		
	}
}

public class Test05ScrollPane {

	public static void main(String[] args) {
	Window05 window = new Window05();	

	}

}
