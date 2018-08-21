package api.awt.graphic;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//Frame을 확장한 클래스
class Window05 extends Frame {
	
	private class CanvasEx extends Canvas{
		
		private int x=10,y=10,width=250,height=250;
		private Image img;
		
		@Override
		public void paint(Graphics g) {
			if(img!=null)g.drawImage(img, x, y, width,height,this);
		}
		
		
	}
	//인스턴스
	private CanvasEx can = new CanvasEx();
	
	
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
		
		moving();
	}
	
	public void moving() {
		try {
			//[1] 이미지를 불러온다.(run.png)
			//->BufferedImage 형태로 불러와야 편집이 가능
			BufferedImage buf = ImageIO.read(new File("image/run.png"));
			//[2] 이미지를 잘라서 배열형태로 보관
			BufferedImage[]arr = new BufferedImage[9];
			int w = buf.getWidth()/9;
			int h = buf.getHeight();
			for(int i=0;i<arr.length;i++) {
			arr[i] = buf.getSubimage(i*w, 0, w, h);
			}
			
			//[3] 일정시간 간격으로 이미지를 순차적으로 바꿔가며 다시 그리도록 요청
			int index = 0;
			while(true) {
				
				can.img=arr[index%9];
				can.repaint();
				index++;
				Thread.sleep(10);
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class Test05moving {
	public static void main(String[] args) {
		Window05 a = new Window05(); // 창생성
		
	}
}
