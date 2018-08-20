package api.io.single;

import java.io.File;
import java.io.IOException;

public class Quiz03 {

	public static void main(String[] args) throws IOException {
		File a = new File("J:\\자바SW조현성");
		File b = new File("J:\\제비");
		System.out.println(b.getAbsolutePath());
		//b.createNewFile();
//		진행상황을 알고 싶을 경우 CopyListener를 생성해서 코드 작성 후 설정
		CopyListener listner = (origin,dest,copy,total)->{
			System.out.println("총"+total+"byte 중"+copy+"byte 복사 완료");
		};
		FileUtil.setCopylistener(listner);
		FileUtil.copy(a, b);
		

	}

}
