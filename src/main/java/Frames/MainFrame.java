package Frames;

import javax.swing.*;

public class MainFrame extends FrameCore{
MainFrame(){
    super();
    frameContainer = mainFrame.getContentPane();
    MenuPanel menu = new MenuPanel();
    frameContainer.add(menu.panel);
    mainFrame.setResizable(false);
    mainFrame.setTitle("PhoneBook");
}
}
