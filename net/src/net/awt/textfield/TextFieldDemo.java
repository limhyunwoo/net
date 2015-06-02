package net.awt.textfield;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class TextFieldDemo {
	public static void main(String[] args) {
		/*
		 * [1] ������Ʈ�� ����
		 * 
		 */
		
		Frame frame = new Frame("�޸���");
		frame.setSize(500,300);
		//crtl shift o
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		//toolkit ��ü ���� new �� �ƴ� �޼ҵ� ���Ϲ������ ��ü�� ������Ŵ.
		Dimension dim = toolkit.getScreenSize(); //ȭ��ũ��
		
		
		Label labid = new Label("       ID    "  );
		labid.setBounds(50,50,30,10);  //50503010�� ���μ���
		Label labpwd = new Label("  password  ");
		labpwd.setBounds(50,65,100,10);
		
		TextField txtid = new TextField(10); //10���ڸ� �Է��� �� �ִ� ����.
		TextField txtpwd = new TextField(10);
		txtpwd.setEchoChar('*'); // ���ΰ� char Ÿ���̶� �̱����� ��..
		
		frame.setLayout(new FlowLayout());
		frame.add(labid);
		frame.add(txtid);
		frame.add(labpwd);
		frame.add(txtpwd);
		
		
		
		
		
		/*
		 * [3]������Ʈ�� ��üȭ
		 */
		frame.setLocation(dim.width/2, dim.height/2);
		/*
		 * Ư������� ���ϴ� �ͺ��� ��ó�� dim �� ����ϸ�
		 * �������� ȭ�鿡 ���� �������� ������ ȭ�鿡 ����
		 * �߾Ӻαٿ� ��ġ�ϰ� ��.
		 */
		
		//��üȭ�鿡�� ����, ������ ��ġ�� �ΰڴ�.
		frame.setVisible(true);
		
	}
}
