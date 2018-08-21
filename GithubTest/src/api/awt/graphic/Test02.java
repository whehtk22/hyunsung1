package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

//Frame을 확장한 클래스
class Window02 extends Frame {

	// 그림을 그릴 수 있는 도화지 같은 클래스
	// 굳이 Canvas가 아니더라도 모든 컴포넌트에 그림을 그릴 수 있다.

	// 그림을 그리기 위해 존재하는 내장기능 존재(재정의하여 사용)
	private Image image = Toolkit.getDefaultToolkit().getImage("image/pororo.jpg");
	private int x = 10,y = 10, width=200,height=250;
	private Canvas can = new Canvas() {
		@Override
		public void paint(Graphics arg0) {
			arg0.drawImage(image, x, y, width, height, this);
//			arg0.drawImage(image,10,10,200,250,this);
		}
	};

	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.add(can);

	}

	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */

	private void event() {
		
	}

	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {

	}

	public Window02() {
		this.display();
		event();
		menu();
//		표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 400); // 폭 : 300, 높이 : 200
		setTitle("GUI 테스트");
		setResizable(false); // 크기 변경 불가

		setVisible(true); // 화면 표시
		walk();
	}
	
	public void walk() {
//		이동을 구현하기 위해 해야할 작업
//		[1] 좌표를 변경 → [2] 다시 그려라 
		while(true) {
			x++;
			System.out.println("x="+x);
			if(x>can.getWidth()+10)break;
			can.repaint();//paint()를 다시 실행하세요
			try{Thread.sleep(100);}
			catch(Exception e) {}
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02(); // 창생성

	}
}
