package api.awt;

import java.awt.*;
import java.awt.event.*;

//Frame을 확장한 클래스
class Window07 extends Frame {
	
	//필요한 인스턴스는 멤버 변수로 구현
	//모든 프로그램에서 공통적으로 필요로 하는
	//파일 열기창/ 색상 선택창 등은 미리 만들어진 클래스가 없는가?
	
	private FileDialog fwindow = 
			new FileDialog(this, "파일 열기", FileDialog.LOAD);
	
	private Button open = new Button("열기");
	
	private void display() {
		this.add(open);
	}
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	
	private void event() {
		WindowListener window = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);//숨김처리
				dispose();//현재 창을 소멸시킴
			}
		};
		addWindowListener(window);
		open.addActionListener(e->{
			//파일 열기창을 표시
			fwindow.setVisible(true);
			
			//파일 열기창이 닫히고 나서의 작업을 작성
			// - 열기를 눌렀나요? 눌렀다면 무슨 파일인가요?
			String dir = fwindow.getDirectory();
			String name = fwindow.getFile();
			System.out.println("dir = "+dir);
			System.out.println("file = "+name);
			
			if(dir!=null&name!=null) {
				System.out.println("파일 열기 코드를 실행합니다.!");
			}
		});
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	public Window07() {
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

public class Test02filedial {
	public static void main(String[] args) {
		Window07 a = new Window07(); // 창생성
		
	}
}
