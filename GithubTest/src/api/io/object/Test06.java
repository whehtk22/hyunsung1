package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Test06 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File target = new File("files","list.txt");
		ObjectInputStream object = new ObjectInputStream
				(new BufferedInputStream(new FileInputStream(target)));
		
		@SuppressWarnings("unchecked")
		List<Integer> list = (List<Integer>)object.readObject();
		object.close();
		for(Integer value:list) {
			System.out.println("value = "+value);
		}
		System.out.println("list = "+list);
		
	}

}
