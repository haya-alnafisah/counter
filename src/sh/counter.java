/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh;

   import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
public class counter {

    static JFrame frame = new JFrame("Plus/Minus Counters");          
    static JButton plus_button = new JButton("+");            
    static JButton minus_button = new JButton("-");           
    static JTextField text = new JTextField("0");                      
 
    static int counter ;                                    
 
    public static void main(String[] args) {
 
        plus_button.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("" + (++counter));               
            }
        });
 
        minus_button.addActionListener(new ActionListener() {   
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("" + (--counter));                
            }
        });
        
        
 
        frame.add(minus_button);                                
        frame.add(text);                                      
        frame.add(plus_button);                                
 
        frame.setSize(300, 90);                                 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        frame.setLayout(new FlowLayout());                      
        frame.setVisible(true); 
   
}
}
    
