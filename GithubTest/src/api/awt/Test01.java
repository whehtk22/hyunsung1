package api.awt;

import java.awt.Frame;

public class Test01 {
	public static void main(String[] args) {
		Frame a = new Frame();//창생성
		
//		표시 전에 창과 관련된 다양한 처리를 먼저 수행
		a.setLocation(100,200);//x : 100, y : 200
		a.setSize(300, 200);//폭 : 300, 높이 : 200
		a.setTitle("GUI 테스트");
		a.setResizable(false);
		
		a.setVisible(true);//화면 표시
	}
}
