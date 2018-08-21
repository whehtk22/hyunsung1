package api.awt.graphic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//�̹����� ���õ� ���� ��ɵ��� ����
public class ImageManager {
	
	
	/**
	 * �̹����� �ҷ����� �޼ҵ�
	 */
	public static BufferedImage load(String path){
		try {
			BufferedImage buf = ImageIO.read(new File(path));
			return buf;
		} catch (IOException e) {
			return null;
		}
	}
	
	/**
	 * �̹����� �ڸ��� �޼ҵ�(1��¥�� ��������Ʈ �̹����� �ڸ� �� ����)
	 * 
	 */
	public static BufferedImage[] slice(BufferedImage origin,int size) {
		int w = origin.getWidth()/9;
		int h = origin.getHeight();
		BufferedImage[]arr = new BufferedImage[size];
		for(int i=0;i<arr.length;i++) {
		arr[i] = origin.getSubimage(i*w, 0, w, h);
		}
		return arr;
	}
}
