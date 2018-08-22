package api.swing;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Test12screenshot {
	public static void main(String[] args) throws AWTException, IOException {
		// 스크린샷 or 매크로 java.awt.Robot
		Robot robot = new Robot();
		
		Rectangle angle = new Rectangle(0, 0, 1600, 900);
		BufferedImage img = robot.createScreenCapture(angle);
		ImageIO.write(img, "png", new File("image/save.png"));

	}
}
