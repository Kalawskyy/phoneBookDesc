package Frames;

import javax.swing.*;

public class MainFrame extends FrameCore{
MainFrame(){
    super();
    frameContainer = mainFrame.getContentPane();
    MenuPanel menu = new MenuPanel();
    mainFrame.add(menu.panel);
    PersonPanel firstPerson = new PersonPanel();
    frameContainer.add(firstPerson.panel);
    mainFrame.setResizable(false);
    mainFrame.setTitle("PhoneBook");
}
}
