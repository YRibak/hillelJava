package lesson12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ITHILLEL2 on 31.07.2015.
 */
public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button was clicked");
    }
}
