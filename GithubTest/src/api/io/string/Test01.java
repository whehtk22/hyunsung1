package api.io.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		문자열 입출력을 위해 알아야 할 내용
//		-> 문자열은 바이트와 호환이 된다.
		
		String a = "안녕 hello";
		
		byte[] b = a.getBytes("MS949");//문자열을 부셔서 MS949방식으로 한 것
		byte[] c = a.getBytes("UTF-8");//문자열을 부셔서 UTF-8방식으로 한 것
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		String d = new String(b,"MS949");//부셔진 것을 인코딩 방식으로 다시 문자열로 만드는 것
		String e = new String(c,"UTF-8");
		System.out.println("d = "+d);
		System.out.println("e = "+e);
	}

}
