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

//Frame을 확장한 클래스
class Window extends Frame {

	// 필요한 인스턴스는 멤버 변수로 구현
	private Button bt = new Button("누르세요");

	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.add(bt);
	}

	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */

	private void event() {
		// 처리해야 할 메소드가 많아서 사용하기가 불편하다
		// ->이러한 경우에는 000Adapter 클래스를 지원해준다.
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
//				발생한 이벤트의 상세 정보를 분석?

				System.out.println(e);
				System.out.println(e.getButton());// 어느 마우스 버튼을 눌렀는가?
				System.out.println(e.getWhen());// 언제 눌렀는가?
				SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss");
				System.out.println(sf.format(e.getWhen()));
				System.out.println(e.getClickCount());// 몇번 연속 클릭했는가?
				System.out.println(e.getSource());// 뭘 눌렀는가?
				System.out.println(bt);
				System.out.println(e.getSource() == bt);

			}
		};
		bt.addMouseListener(m);
	}

	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {

	}

	public Window() {
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

public class Test03mouse {
	public static void main(String[] args) {
		Window a = new Window(); // 창생성

	}
}