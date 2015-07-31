package lesson12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ITHILLEL2 on 31.07.2015.
 */
public class TextChanger implements ActionListener{
    JButton button;

    public TextChanger(JButton button) {
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("hi");
        button.setEnabled(false);
    }
}
