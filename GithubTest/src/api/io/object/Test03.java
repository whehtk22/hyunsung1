package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test03 {
	void save(File file) throws FileNotFoundException, IOException {
		ObjectOutputStream object = new ObjectOutputStream
				(new BufferedOutputStream(new FileOutputStream(file)));
		Date date = new Date();
		String str = date.toString();
		object.writeObject(str);
		object.close();
		
	}
}
