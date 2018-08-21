package api.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;

//Frame�� Ȯ���� Ŭ����
class Window extends Frame {

	// �ʿ��� �ν��Ͻ��� ��� ������ ����
	private Button bt = new Button("��������");

	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(bt);
	}

	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */

	private void event() {
		// ó���ؾ� �� �޼ҵ尡 ���Ƽ� ����ϱⰡ �����ϴ�
		// ->�̷��� ��쿡�� 000Adapter Ŭ������ �������ش�.
		WindowListener w = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		};
		this.addWindowListener(w);

		MouseListener m = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked");
//				�߻��� �̺�Ʈ�� �� ������ �м�?

				System.out.println(e);
				System.out.println(e.getButton());// ��� ���콺 ��ư�� �����°�?
				System.out.println(e.getWhen());// ���� �����°�?
				SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss");
				System.out.println(sf.format(e.getWhen()));
				System.out.println(e.getClickCount());// ��� ���� Ŭ���ߴ°�?
				System.out.println(e.getSource());// �� �����°�?
				System.out.println(bt);
				System.out.println(e.getSource() == bt);

			}
		};
		bt.addMouseListener(m);
	}

	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {

	}

	public Window() {
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

public class Test03mouse {
	public static void main(String[] args) {
		Window a = new Window(); // â����

	}
}