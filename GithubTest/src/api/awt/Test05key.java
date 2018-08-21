package api.awt;

import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Frame�� Ȯ���� Ŭ����
class Window05 extends Frame {
	
	//�ʿ��� �ν��Ͻ��� ��� ������ ����
	private TextArea area = new TextArea();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(area);
		
		Font font = new Font("����",Font.PLAIN,30);
		area.setFont(font);
	}
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	
	private void event() {
		//��ư�� ������ ������ ��¸޼��� �ڵ尡 ����ǵ��� ����
		//area�� Ű���� �̺�Ʈ�� ���� ����
		//press, release�� �ƽ�Ű�ڵ常 ����(���Ű ���� ���)
		//type�� �����ڵ带 ����(���Ű ���� �Ұ�)
		KeyListener k = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyPressed");
				//�߻��� Ű���� �̺�Ʈ�� ���� ������ �м�
				System.out.println(e);
				System.out.println(e.getSource());//�߻� ������Ʈ �ν��Ͻ�
				System.out.println(e.getKeyCode());//Ű���� ascii �ڵ尪
//				System.out.println(e.getKeyChar());
				System.out.println(e.getExtendedKeyCode());
				switch(e.getKeyCode()) {
				case KeyEvent.VK_ESCAPE:
					System.out.println("ESC ����");
					break;
				case KeyEvent.VK_ENTER:
					System.out.println("Enter ����");
					break;
				case KeyEvent.VK_F5:
					SimpleDateFormat sf = new SimpleDateFormat("E hh:mm yyyy-MM-dd");
					Calendar cal = Calendar.getInstance();
					area.append(sf.format(cal.getTime()));
				}
			}
		};
		area.addKeyListener(k);
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

public class Test05key {
	public static void main(String[] args) {
		Window05 a = new Window05(); // â����
		
	}
}
