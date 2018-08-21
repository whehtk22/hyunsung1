package api.awt.graphic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//이미지와 관련된 각종 기능들을 보관
public class ImageManager {
	
	
	/**
	 * 이미지를 불러오는 메소드
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
	 * 이미지를 자르는 메소드(1줄짜리 스프라이트 이미지를 자를 수 있음)
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
