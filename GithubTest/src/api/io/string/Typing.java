package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Typing {
	File file = new File("J:/자바SW조현성", "Red Velvet - Power up.txt");
	Scanner sc = new Scanner(System.in);
	BufferedReader br;

	BufferedReader open() {
		FileReader fr = null;
		try {
			fr = new FileReader(this.file);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		BufferedReader br = new BufferedReader(fr);
		return br;
	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr() {
		this.br = this.open();
	}

	void type() throws IOException {
		while (true) {
			String line = this.getBr().readLine();
			if (line == null)
				break;
			this.intype(line);
		}
		br.close();
	}
	public void intype(String line) {
		System.out.println(line);
		String input = sc.nextLine();
		if(input.equals(line))System.out.println("맞습니다.");
		else {this.intype(line);
	}
}
}
