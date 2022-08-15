package Frames;

import javax.swing.*;
import java.awt.*;

public class PanelCore {
    JPanel panel;
    Container panelCotainer;
    PanelCore(){
        panel= new JPanel();
        panel.setVisible(true);
        panel.setBounds(500,500,500,500);
        panel.setVisible(true);
        panelCotainer = new Container();
        panel.add(panelCotainer);
    }
    PanelCore(int sizeX,int sizeY,int positionX,int positionY){
        panel= new JPanel();
        panel.setVisible(true);
        panel.setBounds(sizeX,sizeY,positionX,positionY);
        panel.setVisible(true);
        panelCotainer = new Container();
        panel.add(panelCotainer);
    }

    JButton createButton(int sizeX,int sizeY,int positionX,int positionY,String buttonName){
        JButton button= new JButton(buttonName);
        button.setSize(sizeX,sizeY);
        button.setLocation(positionX,positionY);
        return button;
    }
}
