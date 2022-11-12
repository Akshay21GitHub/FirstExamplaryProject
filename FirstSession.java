import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSession implements ActionListener {
    JFrame frame;
    JTextArea area;
    JButton button;
    FirstSession(){
        frame= new JFrame("First Session"); // created frame
        frame.setBounds(250,250,300,300);    // setting bound for frame. size of frame after running the code.
        frame.getContentPane().setBackground(Color.BLACK);  // setting frame backgroun color
        area= new JTextArea("Welcome to TextArea");  // created area
        area.setBounds(50,50,200,200);  //setting bound for area
        button= new JButton("CLICK");       // created button
        button.setBounds(100,20,100,20);    //setting bound for button
        button.addActionListener(this);    // adding action for button
        frame.add(button);    // adding button in frame
        area.setBackground(Color.RED);
        frame.add(area);     // adding button in area
        frame.setLayout(null);
        frame.setVisible(true);   // visible frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //

    }
    public  static void main(String arg[]){

        FirstSession object = new FirstSession();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        area.setText("You have clicked the Button");

    }
}
