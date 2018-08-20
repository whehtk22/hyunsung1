package api.io.object;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Quiz01 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("files","time.txt");
		file.createNewFile();
		Test03 test03 = new Test03();
		test03.save(file);
		Test04 test04 = new Test04();
		test04.load(file);
	}

}
