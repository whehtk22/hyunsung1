package api.io.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		���ڿ� ������� ���� �˾ƾ� �� ����
//		-> ���ڿ��� ����Ʈ�� ȣȯ�� �ȴ�.
		
		String a = "�ȳ� hello";
		
		byte[] b = a.getBytes("MS949");//���ڿ��� �μż� MS949������� �� ��
		byte[] c = a.getBytes("UTF-8");//���ڿ��� �μż� UTF-8������� �� ��
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		String d = new String(b,"MS949");//�μ��� ���� ���ڵ� ������� �ٽ� ���ڿ��� ����� ��
		String e = new String(c,"UTF-8");
		System.out.println("d = "+d);
		System.out.println("e = "+e);
	}

}
