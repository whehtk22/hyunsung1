package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test08 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File target = new File("files","student.txt");
		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(target)));
		Student1 std = (Student1)in.readObject();
		in.close();
		System.out.println(std.toString());
		
	}

}
