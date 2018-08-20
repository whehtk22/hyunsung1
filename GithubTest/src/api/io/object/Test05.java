package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test05 {
	public static void main(String[] args) throws IOException {
		//Collection을 파일에 저장	ok
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		File file = new File("files","list.txt");
		file.createNewFile();
		
		ObjectOutputStream object = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		object.writeObject(list);
		
		object.close();
	}
}
