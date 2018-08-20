package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test02 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		°´Ã¼ ÀÔ·Â
		File target = new File("files","object.txt");
		ObjectInputStream object = new ObjectInputStream
				(new BufferedInputStream(new FileInputStream(target)));
		
		String str = (String)object.readObject();
		object.close();
		System.out.println("str = "+str);
	}

}
