package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	static CopyListener listener;
	
	
	public static CopyListener getListener() {
		return listener;
	}


	public static void setCopylistener(CopyListener copylistener) {
		FileUtil.listener = copylistener;
	}


	static void copy(File a, File b) throws IOException {
		byte[] buffer = new byte[1024];
		
		if(!a.exists()) {
			System.out.println("존재하지 않는 파일입니다.");
		}else {
			if(a.isDirectory()) {//디렉터리를 만들 때에는 그냥 mkdirs를 이용하는 것이다.
				b.mkdirs();
				File[] list = a.listFiles();
				if(list!=null) {
				for(File v:list) {//폴더 만들고 그 안에 있는 파일들 확인
					File target = new File(b,v.getName());
					FileUtil.copy(v, target);//폴더 안의 파일들 하나하나에 대해서 재귀호출
				}
				}
			}
			else if(a.isFile()) {//파일 쓰기
				FileInputStream in = new FileInputStream(a);
				FileOutputStream out = new FileOutputStream(b);//파일일 경우에만 input, outputstream을 쓰는 것이다.
				while(true) {
					int size=in.read(buffer);//이것은 몇개를 읽었는지를 int형으로 반환해준다.
					System.out.println(size);
					if(size==-1)break;
					out.write(buffer,0,size);//몇개를 읽는지 그 숫자를 지정해 준다.
					
				}
				in.close();
				out.close();
			}
		}
		
	}
}
