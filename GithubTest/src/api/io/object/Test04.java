package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test04 {
	void load(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream object = new ObjectInputStream
				(new BufferedInputStream(new FileInputStream(file)));
		Object str = object.readObject();
		object.close();
		System.out.println((String)str);
		
	}
}
