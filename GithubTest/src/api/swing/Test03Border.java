package api.swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
/**
 * Swing���� ����ϴ� Frame : JFrame
 * @author Administrator
 *
 */
class Window03 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
	private JButton bt1 = new JButton("LinBorder");
	private JButton bt2 = new JButton("TitleBorder");
	private JButton bt3 = new JButton("EmptyBorder");
	private JButton bt4 = new JButton("CompoundBorder");
	public Window03() {	
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
		con.setLayout(new GridLayout(2,2));
		con.add(bt1);
		con.add(bt2);
		con.add(bt3);
		con.add(bt4);		
	//LineBorder ������ �� �׵θ�
//	Border lineborder = new LineBorder(Color.RED, 2, true);
	Border b1 = BorderFactory.createLineBorder(Color.DARK_GRAY, 5, true);
	Border b2 = BorderFactory.createTitledBorder(b1,"����");	
	bt1.setBorder(b1);
	bt2.setBorder(b2);
	Border b3 = BorderFactory.createEmptyBorder(20, 20, 20, 20);
	bt3.setBorder(b3);
	Border b4 = BorderFactory.createCompoundBorder(b3,b1);
	bt4.setBorder(b4);
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

public class Test03Border {

	public static void main(String[] args) {
	Window03 window = new Window03();	

	}

}
