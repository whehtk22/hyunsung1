package api.io.single;

import java.io.UnsupportedEncodingException;

public class Tet10 {
public static void main(String[] args) throws UnsupportedEncodingException {
	String str = "?€λ₯? ?λ‘μΈ?€κ°? ??Ό? ? λΆ?λΆμ ? κ°μΌλ―?λ‘?, ?λ‘μΈ?€κ°? ?΄?Ή ??Ό? ?‘?Έ?€?  ? ??΅??€";
	byte[] byt = str.getBytes("ms949");
	str = new String(byt,"UTF-8");
	System.out.println(str);
	
}
}
