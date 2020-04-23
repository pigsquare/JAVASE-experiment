package q2;

import java.awt.event.*; 
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class WindowInput extends JFrame implements ActionListener {
   JTextArea showResult;
   JButton openInput;
   
   WindowInput() {
       openInput=new JButton("�򿪶Ի���");
       showResult=new JTextArea();
       add(openInput,BorderLayout.NORTH);
       add(new JScrollPane(showResult),BorderLayout.CENTER);
       
       openInput.addActionListener(this); 
       
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void actionPerformed(ActionEvent e) { 
      String str=JOptionPane.showInputDialog(this,"���������Ϣ��������","����Ի���",
                                              JOptionPane.INFORMATION_MESSAGE);
      if(str!=null) {         
         showResult.append(str+", ");   
      }
   }
}