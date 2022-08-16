package Frames;

public class MenuPanel extends PanelCore{
    MenuPanel(){
        super(20,20,30,30);
    }
    void addButton(){
        panel.add(createButton(60,20,20,20,"test",true));
    }
}
