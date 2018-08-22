package api.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 * Swing���� ����ϴ� Frame : JFrame
 * @author Administrator
 *
 */
class Window10 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
	private JToolBar toolbar = new JToolBar();
	private JButton a = new JButton("�˸�â");
	private JButton b = new JButton("Ȯ��â");
	private JButton c = new JButton("�Է�â");
	private JButton d = new JButton("������");
	private JButton e = new JButton("���ϼ���");
	
	public Window10() {	
		display();
		event();
		menu();
		
		setTitle("�κ���� �ڹٱ���");
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
		
		toolbar.add(a);
		toolbar.add(b);
		toolbar.add(c);
		toolbar.add(d);
		toolbar.add(e);
		
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
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//����� ���� ����
		a.addActionListener(e->{
			//[1] �˸�â : JOptionPane.showMessageDialog()
			JOptionPane.showMessageDialog(con,"�˸�â �׽�Ʈ","����",JOptionPane.QUESTION_MESSAGE);//������ ���� �� �ִ�.
			JOptionPane.showInternalMessageDialog(con, "�˸�â �׽�Ʈ","����",JOptionPane.PLAIN_MESSAGE);//������ ���� �� ����.
		});
		
		b.addActionListener(e->{
			int c = JOptionPane.showConfirmDialog(con, "Ȯ��â �׽�Ʈ","����",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
			System.out.println("c = "+c);
			if(c==0) {
				System.out.println("�� �����̳׿�.");
			}else if(c==1) {
				System.out.println("�ƴϿ� �����̳׿�.");
			}else System.out.println("�� ������");
		});
		c.addActionListener(e->{
			//[3] �Է�â : JOptionPane.showInputDialog()
			String text = JOptionPane.showInputDialog("�Է�");
			System.out.println("text = "+text);
		});
		d.addActionListener(e->{
			//[4] ������â : JColorChooser
			Color color = JColorChooser.showDialog(con, "�κ��� ����", Color.LIGHT_GRAY);
			System.out.println("color = "+color);
			if(color !=null) {
				con.setBackground(color);
			}
		});
		e.addActionListener(e->{
			//[5] ���ϼ���â : JFileChooser(�ν��Ͻ� �ʿ�)
			JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
			int c = fc.showOpenDialog(con);
			System.out.println("c = "+c);
			if(c==0) {
				System.out.println("���� �����ٱ�?");
				File f = fc.getSelectedFile();//������ ���� �ҷ����ش�.
				try {
					FileReader rf = new FileReader(f);
					BufferedReader br = new BufferedReader(rf);
					while(true) {
					String line = br.readLine();
					if(line==null)break;
					System.out.println("line ="+line);
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
	
	}
}

public class Test10joptiondialog {

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
	Window10 window = new Window10();	
	
	}

}
