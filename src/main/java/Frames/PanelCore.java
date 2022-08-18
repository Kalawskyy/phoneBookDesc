package Frames;

import javax.swing.*;
import java.awt.*;

public class PanelCore {
    JPanel panel;
    Container panelCotainer;
    PanelCore(){
        panel= new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setBounds(500,500,500,500);
        panelCotainer = new Container();
        panel.add(panelCotainer);
        panelCotainer.setVisible(true);
        panel.setVisible(true);

    }
    PanelCore(int sizeX,int sizeY,int positionX,int positionY){
        panel= new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setBounds(positionX,positionY,sizeX,sizeY);
        panel.setVisible(true);

    }

    JButton createButton(int sizeX,int sizeY,int positionX,int positionY,String buttonName,boolean visible){
        JButton button= new JButton(buttonName);
        button.setSize(sizeX,sizeY);
        button.setLocation(positionX,positionY);
        button.setVisible(visible);
        return button;
    }
}
