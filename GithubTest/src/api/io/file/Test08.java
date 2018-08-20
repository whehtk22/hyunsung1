package api.io.file;

import java.io.File;
import java.text.DecimalFormat;

public class Test08 {
	public static void main(String[] args) throws Exception {
		File file = new File("/J:");
		DecimalFormat f = new DecimalFormat("###,###");
		//System.out.println(f.format(file.getTotalSpace())+"바이트");
		Drive drive = new Drive("J드라이브",file);
		drive.toString();
	}
}
