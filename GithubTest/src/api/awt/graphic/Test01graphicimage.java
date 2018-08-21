package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

//Frame을 확장한 클래스
class Window01 extends Frame {
	
	//그림을 그릴 수 있는 도화지 같은 클래스
	//굳이 Canvas가 아니더라도 모든 컴포넌트에 그림을 그릴 수 있다.
	
	//그림을 그리기 위해 존재하는 내장기능 존재(재정의하여 사용)
	
	private Canvas can = new Canvas() {
		@Override
		public void paint(Graphics g) {
			//g	펜
			//this(can) 도화지(Canvas)
			g.drawLine(50, 50, 150, 50);	//선
			g.drawRect(50, 100, 100, 100);	//사각형
			g.drawOval(50, 100, 100, 100);	//원
			
			g.setColor(Color.blue);
			g.setFont(new Font("궁서",Font.BOLD,30));
			
			g.drawString("Hello Graphic!", 100, 250);
			
			//이미지
			Image img = Toolkit.getDefaultToolkit().getImage("image/pororo.jpg");
			g.drawImage(img, 50, 50, 300, 300, this);
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
	public Window01() {
		this.display();
		event();
		menu();
//		표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 400); // 폭 : 300, 높이 : 200
		setTitle("GUI 테스트");
		setResizable(false); // 크기 변경 불가

		setVisible(true); // 화면 표시
	}
}

public class Test01graphicimage {
	public static void main(String[] args) {
		Window01 a = new Window01(); // 창생성
		
	}
}
