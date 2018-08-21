package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;
/*
 * Ȯ�븦 ������ ���μ��� 30px�� ����
 */
//Frame�� Ȯ���� Ŭ����
class Window03 extends Frame {
	//�Ϲ� ��ø Ŭ������� ��, ���⼭�� Window03������ CanvasEx�� ���ϰ� �ҷ��ͼ� �� �� �ִ�.
	//������ �ٸ� Ŭ���������� �ҷ��� �� ����.
	//�ʿ��� �ν��Ͻ��� ��� ������ ����
	private class CanvasEx extends Canvas{
		private int x=10,y=10,height=100,width=100;
		private Image img = Toolkit.getDefaultToolkit().getImage("image/pororo.jpg");
		private Canvas can = new Canvas() {
			@Override
			public void paint(Graphics arg0) {
				arg0.drawImage(img,x, y, height, width,this);
			}
		};
		public void increase() {
			if(width>can.getWidth()&&height>can.getWidth()) {}
			else {width+=30;
			height+=30;can.repaint();}
		}
		public void decrease() {
			if(width<10&&height<10) {}
			else {width-=30;
			height-=30;can.repaint();}
		}
		
	}
	
	private CanvasEx can = new CanvasEx();
	private Button bigger = new Button("Ȯ��");

	private Button smaller = new Button("���");
	private Button exit = new Button("����");
	private BorderLayout border = new BorderLayout();
	private Panel panel = new Panel();
	private FlowLayout flow = new FlowLayout();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		setLayout(border);
		add(can,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		panel.setLayout(flow);
		panel.add(bigger);
		panel.add(smaller);
		panel.add(exit);
	}
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	
	private void event() {
		ActionListener listener = (ActionEvent e)->{
			if(e.getSource()==bigger) {
				can.increase();
				
			}else if(e.getSource()==smaller) {
				can.decrease();
			
			}else if(e.getSource()==exit) {
				this.dispose();
			}
		};
		bigger.addActionListener(listener);
		smaller.addActionListener(listener);
		exit.addActionListener(listener);
		
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	public Window03() {
		this.display();
		event();
		menu();
//		ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 500); // �� : 300, ���� : 200
		setTitle("GUI �׽�Ʈ");
		setResizable(false); // ũ�� ���� �Ұ�

		setVisible(true); // ȭ�� ǥ��
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Window03 a = new Window03(); // â����
		
	}
}
