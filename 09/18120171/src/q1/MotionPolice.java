package q1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MotionPolice implements MouseMotionListener{
	JTextArea area;
	   
	   public void setJTextArea(JTextArea area) {
	      this.area=area;
	   }

	@Override
	public void mouseDragged(MouseEvent e) {
		
		if(e.getSource() instanceof JButton)
	        area.append("\n����ڰ�Ŧ�϶�,λ��:"+"("+e.getX()+","+e.getY()+")");
	    if(e.getSource() instanceof JTextField)
	        area.append("\n������ı����϶�,λ��:"+"("+e.getX()+","+e.getY()+")");
	    if(e.getSource() instanceof JFrame)
	        area.append("\n����ڴ����϶�,λ��:"+"("+e.getX()+","+e.getY()+")"); 
	}

	@Override
	public void mouseMoved(MouseEvent e) {

		if(e.getSource() instanceof JButton)
	        area.append("\n����ڰ�Ŧ�ƶ�,λ��:"+"("+e.getX()+","+e.getY()+")");
	    if(e.getSource() instanceof JTextField)
	        area.append("\n������ı����ƶ�,λ��:"+"("+e.getX()+","+e.getY()+")");
	    if(e.getSource() instanceof JFrame)
	        area.append("\n����ڴ����ƶ�,λ��:"+"("+e.getX()+","+e.getY()+")");
	}

}
