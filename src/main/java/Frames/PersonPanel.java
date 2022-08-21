package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonPanel extends PanelCore{
    PersonPanel(){
        super(140,400,245,0,null);
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        addComponents();
    }
    void addComponents(){
        panel.add(createButton(120,20,10,15,"Dodaj",true));
        panel.add(createButton(120,20,10,50," ",true));
        panel.add(createButton(120,20,10,85," ",true));
    }
    JButton createButton(int sizeX,int sizeY,int positionX,int positionY,String buttonName,boolean visible){
            JButton button= new JButton(buttonName);
            button.setSize(sizeX,sizeY);
            button.setLocation(positionX,positionY);
            button.setVisible(visible);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String cmd = e.getActionCommand();
                    if(cmd.equalsIgnoreCase("Dodaj")){
                        panel.setBackground(Color.GRAY);
                    }
                }
            });
            return button;
    }
}
