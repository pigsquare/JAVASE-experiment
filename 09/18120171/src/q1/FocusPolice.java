package q1;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextArea;

public class FocusPolice implements FocusListener{
	JTextArea area;
	   
	public void setJTextArea(JTextArea area) {
	    this.area=area;
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		area.append("\n�ı����ý���,ID:"+"("+e.getID()+")");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		area.append("\n�ı���ʧȥ����,ID:"+"("+e.getID()+")");
	}

}
