package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Swing���� ����ϴ� Frame : JFrame
 * @author Administrator
 *
 */
class Window06 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
//	�޴�
//	MenuBar	---> JMenuBar
//	Menu    ---> JMenu
//	Menu	---> JMenuItem
	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("����");
	private JMenuItem exit = new JMenuItem("����");
	
	public Window06() {	
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
		setJMenuBar(bar);
		bar.add(file);
		file.add(exit);
		
//		����Ű ������ ���ؼ��� Ű���� �����ϴ� Ŭ������ �˾ƾ� �Ѵ�.(KeyStroke)
//		KeyStroke altf4 = KeyStroke.getKeyStroke
//				(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK);//f4�� alt�� ���ÿ� ������ ��
		KeyStroke esc = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
		exit.setAccelerator(esc);
	}
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
		//awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
		//-> Swing������ �ɼ��� ���� �����ϵ��� ����
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x������ ���α׷� ����
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x������ â ����
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//����� ���� ����
		exit.addActionListener(e->{
			dispose();
		});
		
	}
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		
	}
}

public class Test06KeyStroke {

	public static void main(String[] args) {
	Window06 window = new Window06();	

	}

}
