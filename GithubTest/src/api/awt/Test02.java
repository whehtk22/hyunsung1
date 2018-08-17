package api.awt;

import java.awt.*;
import java.awt.event.*;


//Frame을 확장한 클래스
class Window02 extends Frame{
	public Window02() {
//		표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setLocation(100,200);	//x : 100, y : 200
		setSize(500, 400);		//폭 : 300, 높이 : 200
		setTitle("GUI 테스트");
		setResizable(false);	//크기 변경 불가
		
		setVisible(true);		//화면 표시
	}
}


public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//창생성
		
	}
}
