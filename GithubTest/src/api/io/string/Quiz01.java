package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 노래가사가 저장된 파일을 불러와서 타자연습을 구현
 * 
 * [1] 사용자에게 한 줄을 출력
 * [2] 사용자가 그 줄을 따라서 입력
 * [3] 다 맞으면 통과, 한글자라도 틀리면 다시 입력하도록 처리
 * [4] 다 입력하면 프로그램 종료
 * 
 */
public class Quiz01 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Typing type = new Typing();
		type.setBr();
		type.type();
		
		
	}
}
