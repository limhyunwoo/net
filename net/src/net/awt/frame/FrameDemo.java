package net.awt.frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameDemo {
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
		
		/*
		 * [2]������Ʈ�� ��üȭ
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