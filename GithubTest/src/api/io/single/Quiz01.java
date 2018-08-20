package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz01 {

	public static void main(String[] args) throws IOException {
		File file = new File("J:/","copy.exe");
		File file1 = new File("J:\\자바SW조현성\\1.자바관련파일","eclipse-jee-photon-R-win32-x86_64.zip");
		FileInputStream in = new FileInputStream(file1);
		FileOutputStream out = new FileOutputStream(file);
		file.createNewFile();
		long n1 = 0L;
		while(true) {
			int n = in.read();
			if(n==-1)break;
			System.out.println(n1++);
			out.write(n);
		}
		in.close();
		out.close();

	}

}
