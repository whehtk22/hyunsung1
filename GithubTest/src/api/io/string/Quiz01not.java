package api.io.string;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 저장을 누르면
 * TextArea에 작성한 내용을 
 * sample.txt라는 파일에 저장
 * 
 * 열기를 누르면 
 * sample.txt에 저장된 내용을 불러와서
 * TextArea에 표시
 */
//Frame을 확장한 클래스
class Window03 extends Frame {
	
	//필요한 인스턴스는 멤버 변수로 구현
	private TextArea text = new TextArea();
	private Button save = new Button("저장");
	private Button open = new Button("열기");
	private Panel panel = new Panel();
	private BorderLayout border = new BorderLayout();
	private GridLayout grid = new GridLayout();
	private File file = new File("sample.txt");
	/**
	 * 화면 배치를 처리하는 메소드
	 * @throws FileNotFoundException 
	 */
	private void display() throws FileNotFoundException {
		setLayout(border);
		add(text,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		panel.setLayout(grid);
		panel.add(save);
		panel.add(open);
		open();
		save();
	}
	private void save() throws FileNotFoundException {
		FileOutputStream output1 = new FileOutputStream(file);
		ActionListener save = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			byte[] byt = new byte[1024];
			byt = text.getText().getBytes();
			try {
				output1.write(byt);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		};
		this.save.addActionListener(save);
	}
	
	private void open() throws FileNotFoundException {
FileInputStream input1 = new FileInputStream(file);
		
		
		
		ActionListener open = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				byte[] buffer = new byte[(int)file.length()];//바이트 배열에 타겟 정도의 크기를 잡아준다.
				
				try {
					input1.read(buffer);
					input1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String str = new String(buffer);
				text.setText(str);
			}
			
		};
		this.open.addActionListener(open);
	}
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 * @throws FileNotFoundException 
	 */
	
	private void event() throws FileNotFoundException {
		
		
		
		
		
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	public Window03() throws FileNotFoundException {
		this.display();
		menu();
//		표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 400); // 폭 : 300, 높이 : 200
		setTitle("GUI 테스트");
		setResizable(false); // 크기 변경 불가

		setVisible(true); // 화면 표시
	}
}

public class Quiz01not {
	public static void main(String[] args) throws FileNotFoundException {
		Window03 a = new Window03(); // 창생성
	}
}
