package Frames;

import javax.swing.*;

public class MainFrame extends FrameCore{
MainFrame(){
    super();
    mainFrame.getContentPane().add(frameContainer);
    MenuPanel menu = new MenuPanel();
    mainFrame.add(menu.panel);
    menu.addButton();
}
}
