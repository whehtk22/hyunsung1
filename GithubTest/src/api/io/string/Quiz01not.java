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
 * ������ ������
 * TextArea�� �ۼ��� ������ 
 * sample.txt��� ���Ͽ� ����
 * 
 * ���⸦ ������ 
 * sample.txt�� ����� ������ �ҷ��ͼ�
 * TextArea�� ǥ��
 */
//Frame�� Ȯ���� Ŭ����
class Window03 extends Frame {
	
	//�ʿ��� �ν��Ͻ��� ��� ������ ����
	private TextArea text = new TextArea();
	private Button save = new Button("����");
	private Button open = new Button("����");
	private Panel panel = new Panel();
	private BorderLayout border = new BorderLayout();
	private GridLayout grid = new GridLayout();
	private File file = new File("sample.txt");
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
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
				byte[] buffer = new byte[(int)file.length()];//����Ʈ �迭�� Ÿ�� ������ ũ�⸦ ����ش�.
				
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
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 * @throws FileNotFoundException 
	 */
	
	private void event() throws FileNotFoundException {
		
		
		
		
		
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	public Window03() throws FileNotFoundException {
		this.display();
		menu();
//		ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 400); // �� : 300, ���� : 200
		setTitle("GUI �׽�Ʈ");
		setResizable(false); // ũ�� ���� �Ұ�

		setVisible(true); // ȭ�� ǥ��
	}
}

public class Quiz01not {
	public static void main(String[] args) throws FileNotFoundException {
		Window03 a = new Window03(); // â����
	}
}
