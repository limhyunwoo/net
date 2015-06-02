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
		 * [1] 컴포넌트의 생성
		 * 
		 */
		
		Frame frame = new Frame("메모장");
		frame.setSize(500,300);
		//crtl shift o
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		//toolkit 객체 생성 new 가 아닌 메소드 리턴방식으로 객체를 생성시킴.
		Dimension dim = toolkit.getScreenSize(); //화면크기
		
		
		Label labid = new Label("       ID    "  );
		labid.setBounds(50,50,30,10);  //50503010은 가로세로
		Label labpwd = new Label("  password  ");
		labpwd.setBounds(50,65,100,10);
		
		TextField txtid = new TextField(10); //10글자를 입력할 수 있는 공간.
		TextField txtpwd = new TextField(10);
		txtpwd.setEchoChar('*'); // 내부가 char 타입이라 싱글쿼터 줌..
		
		frame.setLayout(new FlowLayout());
		frame.add(labid);
		frame.add(txtid);
		frame.add(labpwd);
		frame.add(txtpwd);
		
		
		
		
		
		/*
		 * [3]컴포넌트의 구체화
		 */
		frame.setLocation(dim.width/2, dim.height/2);
		/*
		 * 특정사이즈를 정하는 것보다 위처럼 dim 을 사용하면
		 * 보여지는 화면에 따라 동적으로 무조건 화면에 따라
		 * 중앙부근에 위치하게 됨.
		 */
		
		//전체화면에서 절반, 절반의 위치에 두겠다.
		frame.setVisible(true);
		
	}
}
