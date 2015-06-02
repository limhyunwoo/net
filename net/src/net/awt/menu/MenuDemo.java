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
		 * [1] 컴포넌트의 생성
		 * 
		 */
		
		Frame frame = new Frame("메모장");
		frame.setSize(500,300);
		//crtl shift o
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		//toolkit 객체 생성 new 가 아닌 메소드 리턴방식으로 객체를 생성시킴.
		Dimension dim = toolkit.getScreenSize(); //화면크기
		
		
		MenuBar menuBar = new MenuBar();
		Menu menufile = new Menu("File"); //메뉴에 파일이라고 나타남
		
		MenuItem itemNew = new MenuItem("New");
		MenuItem itemopen  = new MenuItem("Open");
		Menu subMenu = new Menu("Others");
		MenuItem itemExit = new MenuItem("Exit");
		
		MenuItem subMenuPrint = new MenuItem("Print");
		MenuItem subMenuPreview = new MenuItem("Preview");
		MenuItem subMenuSetup = new MenuItem("PrintSetup");
		
		
		/*
		 * [2]컴퍼넌트 조립
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
