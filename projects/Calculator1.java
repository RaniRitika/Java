import java.awt.*;
import javax.swing.*;
//it give only interface and do nothing
public class Calculator1 {
    public static void main(String[] args) {
        JFrame aframe = new JFrame("Simple Calculator");
        Container contentpane = aframe.getContentPane();
        aframe.setSize(250, 100);
        JPanel leftpanel = new JPanel();
        leftpanel.setLayout(new GridLayout(3,1));
        leftpanel.add(new JLabel("Input 1: "));
        leftpanel.add(new JLabel("Input 2: "));
        leftpanel.add(new JLabel("Answer: "));

        contentpane.add(leftpanel,BorderLayout.WEST);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 1));
        JTextField input1TextField = new JTextField(10);
        JTextField input2TextField = new JTextField(10);
       
        JLabel answerLabel = new JLabel();

        centerPanel.add(input1TextField);
        centerPanel.add(input2TextField);
        centerPanel.add(answerLabel);
        contentpane.add(centerPanel,BorderLayout.CENTER);

        JPanel buttoPanel = new JPanel();
        buttoPanel.setLayout(new GridLayout(2, 1));
        JButton plusButton= new JButton("+");
        JButton minusButton = new JButton("-");
        buttoPanel.add(plusButton);
        buttoPanel.add(minusButton);
        contentpane.add(buttoPanel, BorderLayout.EAST);
        aframe.setVisible(true);

    }
}
