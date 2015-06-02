package net.awt.menu;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

public class MenuDemo {
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
		
		
		MenuBar menuBar = new MenuBar();
		Menu menufile = new Menu("File"); //�޴��� �����̶�� ��Ÿ��
		
		MenuItem itemNew = new MenuItem("New");
		MenuItem itemopen  = new MenuItem("Open");
		Menu subMenu = new Menu("Others");
		MenuItem itemExit = new MenuItem("Exit");
		
		MenuItem subMenuPrint = new MenuItem("Print");
		MenuItem subMenuPreview = new MenuItem("Preview");
		MenuItem subMenuSetup = new MenuItem("PrintSetup");
		
		
		/*
		 * [2]���۳�Ʈ ����
		 */
		
		subMenu.add(subMenuPrint);
		subMenu.add(subMenuPreview);
		subMenu.add(subMenuSetup);
		
		Menu menuEdit = new Menu("Edit");
		Menu menuView = new Menu("View");
		Menu menuHelp = new Menu("Help");
		
		menufile.add(itemNew);
		menufile.add(itemopen);
		menufile.add(subMenu);
		menufile.addSeparator();
		menufile.add(itemExit);
		
		menuBar.add(menufile);
		menuBar.add(menuEdit);
		menuBar.add(menuView);
		menuBar.setHelpMenu(menuHelp);
		
		frame.setMenuBar(menuBar);
		
		
		
		
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
