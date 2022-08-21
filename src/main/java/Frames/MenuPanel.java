package Frames;

import java.awt.*;

public class MenuPanel extends PanelCore{
    MenuPanel(){
        super(500,500,0,0,null);
        panel.setBackground(Color.magenta);
        addComponents();
    }
    void addComponents(){
        PersonPanel firstPerson = new PersonPanel();
        panel.add(firstPerson.panel);
    }
    void addButton(){
        panel.add(createButton(60,20,20,20,"test",true));
    }
}
