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
		JPanel pan_nth, pan_sth; //�г��� ����, ����
		ImageIcon icon;
		List<JButton>btns;
		
		public LottoUI(){
			init();
			/*
			 * ������ �ҽ��� �غη� ������ �޼ҵ�� ó���ؼ�
			 * ����� ��ġ�� ������� ȣ��ν� ����� �����ϵ��� �ϴ� ��
			 * :�ڹٽ�ũ��Ʈ�� ȣ�̽�Ʈ ���� ����.
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
	
	private Icon getIcon(int i){				//���־���
		String imgPath = "src/images/" + Integer.toString(i)+".gif"; //�̹��� ��α��ϴ°� ����
		
		return new ImageIcon(imgPath);
		
	}

	private void init(){
		setTitle("�ζǻ�����");
		lotto = new Lotto(); //������ ����ϴ� Ŭ������ �ζǸ� �����ڿ� �ٿ���. this ����
		btns = new ArrayList<JButton>();
		pan_nth = new JPanel();
		pan_sth = new JPanel();
		
		btn = new JButton("������");
		
		/*
		 *this �� LottoUI �� �� �� �ִ� ��� �߿���
		 *ActionListener �� �޼ҵ� �� 
		 *actionPerformed (ActionEvent e)��
		 *��ư���� �ο��ϴ� ���̴�.
		 * 
		 * 
		 */
		btn.addActionListener(this);   //�Ķ���ͷ� ���� ��(lottoUI ��ü) �߿��� �տ��� ������ Ÿ�� (action listener)�� btn�� ���϶�.
		pan_nth.add(btn);
		add(pan_nth, BorderLayout.NORTH);
		add(pan_sth, BorderLayout.SOUTH);
		setBounds(300,400,1200,300);
		setResizable(false);
		setVisible(true);
		/*
		setSize(1200, 300); //������ ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������â �ݱ� �̺�Ʈ
	
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü����
		Dimension dim = toolkit.getScreenSize(); // ȭ�� ũ��
		

		
		
		 * �г� ���� ����
		 

//		panel.setBackground(Color.YELLOW);
//		panelA.setBackground(Color.BLUE);
//		panelB.setBackground(Color.GREEN);
		
		 * �� ��ü ����. �г� A�� ���߰�
		 
		JPanel all = new JPanel();
	

*/
//		JButton button1 = new JButton("������");
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
		
		 * panelB �� button 1,2,3,4 �߰�
		 
		
		

		all.add(pan_nth);
		all.add(pan_sth);
		//panel1 �� panelA panelB �߰�

		//�����ӿ�  panel �߰�
		add(all);
//		setLocation(dim.width/2, dim.height/2);
		setVisible(true);
		all.setLayout(new BorderLayout());
		
		
		all.add(pan_nth, "North"); 
		all.add(pan_sth, "South"); 
		*/
		
		/*
		 * �����г�, �����г� �����ؼ� �����ӿ� ���̰� 
		 * ��ư���� �̺�Ʈ�� �Ҵ��ϴµ�, 
		 * btn.addActionListener(this);
		 * ���� �гο� ��ư�� ���̱�.
		 * �����гο� Border Layout ���� ���ʿ� ��ġ�ϵ��� �ϰ�
		 * �����г��� ���ʿ� ��ġ.
		 * �����ӻ������ 1200, 300 �ȼ�
		 * x,y ��ǥ���� 300, 400
		 * ������ ������� Ȯ��Ұ� �ٲ� �� ����.(����)
		 */
		
	}
	

}
