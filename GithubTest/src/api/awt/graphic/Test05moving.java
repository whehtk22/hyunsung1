package api.awt.graphic;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//Frame�� Ȯ���� Ŭ����
class Window05 extends Frame {
	
	private class CanvasEx extends Canvas{
		
		private int x=10,y=10,width=250,height=250;
		private Image img;
		
		@Override
		public void paint(Graphics g) {
			if(img!=null)g.drawImage(img, x, y, width,height,this);
		}
		
		
	}
	//�ν��Ͻ�
	private CanvasEx can = new CanvasEx();
	
	
	private void display() {
		this.add(can);
	}
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	
	private void event() {
		
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	public Window05() {
		this.display();
		event();
		menu();
//		ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 400); // �� : 300, ���� : 200
		setTitle("GUI �׽�Ʈ");
		setResizable(false); // ũ�� ���� �Ұ�
		
		setVisible(true); // ȭ�� ǥ��
		
		moving();
	}
	
	public void moving() {
		try {
			//[1] �̹����� �ҷ��´�.(run.png)
			//->BufferedImage ���·� �ҷ��;� ������ ����
			BufferedImage buf = ImageIO.read(new File("image/run.png"));
			//[2] �̹����� �߶� �迭���·� ����
			BufferedImage[]arr = new BufferedImage[9];
			int w = buf.getWidth()/9;
			int h = buf.getHeight();
			for(int i=0;i<arr.length;i++) {
			arr[i] = buf.getSubimage(i*w, 0, w, h);
			}
			
			//[3] �����ð� �������� �̹����� ���������� �ٲ㰡�� �ٽ� �׸����� ��û
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
		Window05 a = new Window05(); // â����
		
	}
}
