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

//Frame을 확장한 클래스
class Window05 extends Frame {
	
	//필요한 인스턴스는 멤버 변수로 구현
	private TextArea area = new TextArea();
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.add(area);
		
		Font font = new Font("굴림",Font.PLAIN,30);
		area.setFont(font);
	}
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	
	private void event() {
		//버튼을 누르면 간다한 출력메세지 코드가 실행되도록 연결
		//area에 키보드 이벤트를 연결 설정
		//press, release는 아스키코드만 감지(기능키 감지 기능)
		//type은 유니코드를 감지(기능키 감지 불가)
		KeyListener k = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyPressed");
				//발생한 키보드 이벤트에 대한 정보를 분석
				System.out.println(e);
				System.out.println(e.getSource());//발생 컴포넌트 인스턴스
				System.out.println(e.getKeyCode());//키보드 ascii 코드값
//				System.out.println(e.getKeyChar());
				System.out.println(e.getExtendedKeyCode());
				switch(e.getKeyCode()) {
				case KeyEvent.VK_ESCAPE:
					System.out.println("ESC 감지");
					break;
				case KeyEvent.VK_ENTER:
					System.out.println("Enter 감지");
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
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	public Window05() {
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

public class Test05key {
	public static void main(String[] args) {
		Window05 a = new Window05(); // 창생성
		
	}
}
