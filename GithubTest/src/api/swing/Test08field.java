package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Swing���� ����ϴ� Frame : JFrame
 * @author Administrator
 *
 */
class Window08 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
//	�Է�â
	private JTextField tf = new JTextField();
	private JPasswordField pf = new JPasswordField();
	private JCheckBox cb = new JCheckBox("�����մϴ�.");
	private JRadioButton r1 = new JRadioButton("����");
	private JRadioButton r2 = new JRadioButton("�̼�����");
	
	
	public Window08() {	
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
		con.setLayout(new GridLayout(5, 1));
		con.add(tf);
		con.add(pf);
		con.add(cb);
		con.add(r1);
		con.add(r2);
		
//		��ư �׷��� ���� r1,r2�� �׷����� �˷��ش�.
		r1.setSelected(true);
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
	}
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
		//awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
		//-> Swing������ �ɼ��� ���� �����ϵ��� ����
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x������ ���α׷� ����
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x������ â ����
	//	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//����� ���� ����
		cb.addItemListener(e->{
			System.out.println(e.getItem());
			System.out.println(e.getID());
			System.out.println(e.getStateChange());
	//		if(e.getStateChange()==ItemEvent.SELECTED) {//����� Ȱ��, ItemEvent.SELECTED => 1�� �ǹ�
		if(cb.isSelected()) {
			System.out.println("üũ�ϼ̽��ϴ�.");
			}else {
				System.out.println("üũ Ǯ���̳׿�.");
			}
		});
		
		
	}
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
	
	}
}

public class Test08field {

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
	Window08 window = new Window08();	
	
	}

}
