package Frames;

import java.awt.*;

public class PersonPanel extends PanelCore{
    PersonPanel(){
        super(140,400,245,0);
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        panel.add(createButton(120,20,10,15," ",true));
        panel.add(createButton(120,20,10,50," ",true));
        panel.add(createButton(120,20,10,85," ",true));

    }
    void addButton(){
        panel.add(createButton(30,30,60,60,"butoon",true));
    }
}
