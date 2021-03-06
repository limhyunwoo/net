package net.awt.font;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class FontDemo {
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
		
		Label labid = new Label("hello awt "  );
		labid.setBounds(50,50,30,10);  //50503010은 가로세로
		
		Font plain = new Font("Serif", Font.PLAIN, 20);
		Font italic = new Font("Serif", Font.ITALIC, 20);
		Font bold = new Font("Serif", Font.BOLD, 20);
		Font bolditalic = new Font("Selif",Font.BOLD+Font.ITALIC, 20);
		
		/*
		 * [2]컴포넌트 조립
		 * 
		 */
		
		labid.setFont(bolditalic);
		frame.setLayout(new FlowLayout());
		frame.add(labid);
		
		
		
		
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
