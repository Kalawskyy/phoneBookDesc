package Frames;

import javax.swing.*;
import java.awt.*;

public class PanelCore {
    JPanel panel;
    Container panelCotainer;
    PanelCore(){
        panel= new JPanel();
        panel.setVisible(false);
        panel.setBounds(500,500,500,500);
        panel.setVisible(true);
        panelCotainer = new Container();
        panel.add(panelCotainer);
    }
}
