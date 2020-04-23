package caidan;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Caidan {

	public static void main(String[] args) {
		JFrame window1 = new JFrame("典型的菜单界面");
		window1.setBounds(100, 120, 600, 400);
		window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("文件");
		JMenu menu2 = new JMenu("编辑");
		JMenu menu3 = new JMenu("视图");
		JMenu menu4 = new JMenu("帮助");
		JMenuItem item1 = new JMenuItem("新建文件");
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));
		JMenuItem item2 = new JMenuItem("打开文件");
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));
		JMenuItem item3 = new JMenuItem("关闭文件");
		item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
		JMenu item4 = new JMenu("文件格式");
		JMenuItem item5 = new JMenuItem("保存文件");
		item5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		JMenuItem item6 = new JMenuItem("文件另存为");
		JMenuItem item7 = new JMenuItem("退出");
		item7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK));
		JMenuItem item41 = new JMenuItem("Java文件");
		JMenuItem item42 = new JMenuItem("Txt文件");
		JMenuItem item43 = new JMenuItem("只读");
		JMenuItem item44 = new JMenuItem("可写");
		item4.add(item41);
		item4.add(item42);
		item4.addSeparator();
		item4.add(item43);
		item4.add(item44);
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.addSeparator();
		menu1.add(item4);
		menu1.add(item5);
		menu1.add(item6);
		menu1.addSeparator();
		menu1.add(item7);
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		menubar.add(menu4);
		window1.setJMenuBar(menubar);
		window1.setVisible(true);

	}

}
