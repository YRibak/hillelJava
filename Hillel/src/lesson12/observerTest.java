package lesson12;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by ITHILLEL2 on 31.07.2015.
 */
public class observerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Observer test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        ActionListener actionListener = new ButtonListener();
        button.addActionListener(actionListener);
        ActionListener textChanger = new TextChanger(button);
        button.addActionListener(textChanger);

        frame.getContentPane().add(button);
        frame.setResizable(false);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
