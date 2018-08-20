package api.io.single;

import java.io.UnsupportedEncodingException;

public class Tet10 {
public static void main(String[] args) throws UnsupportedEncodingException {
	String str = "?‹¤ë¥? ?”„ë¡œì„¸?Š¤ê°? ?ŒŒ?¼?˜ ?•œ ë¶?ë¶„ì„ ? ê°”ìœ¼ë¯?ë¡?, ?”„ë¡œì„¸?Š¤ê°? ?•´?‹¹ ?ŒŒ?¼?„ ?•¡?„¸?Š¤?•  ?ˆ˜ ?—†?Šµ?‹ˆ?‹¤";
	byte[] byt = str.getBytes("ms949");
	str = new String(byt,"UTF-8");
	System.out.println(str);
	
}
}
