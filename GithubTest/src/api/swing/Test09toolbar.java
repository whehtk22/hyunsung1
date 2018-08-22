package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Swing���� ����ϴ� Frame : JFrame
 * @author Administrator
 *
 */
class Window09 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
	private JToolBar toolbar = new JToolBar();
	private JButton a = new JButton("1��");
	private JButton b = new JButton("2��");
	private JButton c = new JButton("3��");
	private JButton d = new JButton("4��");
	private JButton e = new JButton("5��");
	
	private JToolBar toolbar2 = new JToolBar();
	
	public Window09() {	
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
		con.add(toolbar,BorderLayout.NORTH);
		con.add(toolbar2, BorderLayout.SOUTH);
		toolbar.add(a);
		toolbar.add(b);
		toolbar.add(c);
		toolbar2.add(d);
		toolbar2.add(e);
		toolbar.setFloatable(false);
		toolbar2.setFloatable(false);
		JTextField field = new JTextField(20);
		toolbar2.add(field);
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
	//	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//����� ���� ����
	
		
	}
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
	
	}
}

public class Test09toolbar {

	public static void main(String[] args) {
//	��Ų ��ġ : â�� ������ ���� ����
	try {
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedLookAndFeelException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Window09 window = new Window09();	
	
	}

}
