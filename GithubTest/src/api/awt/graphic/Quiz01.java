package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;
/*
 * 확대를 누르면 가로세로 30px씩 증가
 */
//Frame을 확장한 클래스
class Window03 extends Frame {
	//일반 중첩 클래스라는 것, 여기서는 Window03에서는 CanvasEx를 편하게 불러와서 쓸 수 있다.
	//하지만 다른 클래스에서는 불러올 수 없다.
	//필요한 인스턴스는 멤버 변수로 구현
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
	private Button bigger = new Button("확대");

	private Button smaller = new Button("축소");
	private Button exit = new Button("종료");
	private BorderLayout border = new BorderLayout();
	private Panel panel = new Panel();
	private FlowLayout flow = new FlowLayout();
	
	/**
	 * 화면 배치를 처리하는 메소드
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
	 * 이벤트 처리 코드를 작성하는 메소드
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
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	public Window03() {
		this.display();
		event();
		menu();
//		표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 500); // 폭 : 300, 높이 : 200
		setTitle("GUI 테스트");
		setResizable(false); // 크기 변경 불가

		setVisible(true); // 화면 표시
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Window03 a = new Window03(); // 창생성
		
	}
}
