package api.io.single;

import java.io.UnsupportedEncodingException;

public class Tet10 {
public static void main(String[] args) throws UnsupportedEncodingException {
	String str = "?���? ?��로세?���? ?��?��?�� ?�� �?분을 ?��갔으�?�?, ?��로세?���? ?��?�� ?��?��?�� ?��?��?��?�� ?�� ?��?��?��?��";
	byte[] byt = str.getBytes("ms949");
	str = new String(byt,"UTF-8");
	System.out.println(str);
	
}
}
