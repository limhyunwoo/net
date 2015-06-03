package net.awt.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LottoUI extends JFrame implements ActionListener{

	
		Lotto lotto;
		JButton btn;
		JPanel pan_nth, pan_sth; //패널중 북쪽, 남쪽
		ImageIcon icon;
		List<JButton>btns;
		
		public LottoUI(){
			init();
			/*
			 * 복잡한 소스를 해부로 보내고 메소드로 처리해서
			 * 선언된 위치에 관계없이 호출로써 기능을 수행하도록 하는 것
			 * :자바스크립트의 호이스트 같은 개념.
			 */
			
			
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btns.size()==0){
			makeBtns();
		}
		lotto.setLotto();
		showLotto();
	}
	
	
	private void makeBtns() {
		JButton tmp = null;
		for(int i =0; i < 6; i++){
			tmp = new JButton();
			btns.add(tmp);
			pan_sth.add(tmp);
			
		}
		
		
	}

	private void showLotto() {
		int [] arr = lotto.getLotto();
		for(int i = 0; i < arr.length; i++){
			btns.get(i).setIcon(getIcon(arr[i]));
		}
		
	}
	
	private Icon getIcon(int i){				//자주쓴대
		String imgPath = "src/images/" + Integer.toString(i)+".gif"; //이미지 경로구하는것 쓰기
		
		return new ImageIcon(imgPath);
		
	}

	private void init(){
		setTitle("로또생성기");
		lotto = new Lotto(); //로직을 담당하는 클래스인 로또를 생성자에 붙였다. this 생략
		btns = new ArrayList<JButton>();
		pan_nth = new JPanel();
		pan_sth = new JPanel();
		
		btn = new JButton("생성기");
		
		/*
		 *this 는 LottoUI 가 할 수 있는 기능 중에서
		 *ActionListener 의 메소드 중 
		 *actionPerformed (ActionEvent e)를
		 *버튼에게 부여하는 것이다.
		 * 
		 * 
		 */
		btn.addActionListener(this);   //파라미터로 들어온 것(lottoUI 전체) 중에서 앞에서 규정한 타입 (action listener)를 btn에 더하라.
		pan_nth.add(btn);
		add(pan_nth, BorderLayout.NORTH);
		add(pan_sth, BorderLayout.SOUTH);
		setBounds(300,400,1200,300);
		setResizable(false);
		setVisible(true);
		/*
		setSize(1200, 300); //프레임 크기 결정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우창 닫기 이벤트
	
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체생성
		Dimension dim = toolkit.getScreenSize(); // 화면 크기
		

		
		
		 * 패널 색상 변경
		 

//		panel.setBackground(Color.YELLOW);
//		panelA.setBackground(Color.BLUE);
//		panelB.setBackground(Color.GREEN);
		
		 * 라벨 객체 생성. 패널 A에 라벨추가
		 
		JPanel all = new JPanel();
	

*/
//		JButton button1 = new JButton("생성기");
//		int[] lotto = new int[6];
//		Lotto a = new Lotto();
//		a.setLotto();
//		a.sort(lotto);
		
		
		
//		JButton button2 = new JButton("1");
//		JButton button3 = new JButton("2");
//		JButton button4 = new JButton("3");
//		JButton button5 = new JButton("4");
//		JButton button6 = new JButton("5");
//		JButton button7 = new JButton("6");
//
//		
//		pan_nth.add(button1);
//		
//		pan_sth.add(button2);
//		pan_sth.add(button3);
//		pan_sth.add(button4);
//		pan_sth.add(button5);
//		pan_sth.add(button6);
//		pan_sth.add(button7);
		/*
		
		 * panelB 에 button 1,2,3,4 추가
		 
		
		

		all.add(pan_nth);
		all.add(pan_sth);
		//panel1 에 panelA panelB 추가

		//프레임에  panel 추가
		add(all);
//		setLocation(dim.width/2, dim.height/2);
		setVisible(true);
		all.setLayout(new BorderLayout());
		
		
		all.add(pan_nth, "North"); 
		all.add(pan_sth, "South"); 
		*/
		
		/*
		 * 북쪽패널, 남쪽패널 생성해서 프레임에 붙이고 
		 * 버튼에는 이벤트를 할당하는데, 
		 * btn.addActionListener(this);
		 * 북쪽 패널에 버튼을 붙이기.
		 * 북쪽패널에 Border Layout 에서 북쪽에 배치하도록 하고
		 * 남쪽패널은 남쪽에 배치.
		 * 프레임사이즈는 1200, 300 픽셀
		 * x,y 좌표값은 300, 400
		 * 프레임 사이즈는 확장불가 바꿀 수 없게.(구글)
		 */
		
	}
	

}
