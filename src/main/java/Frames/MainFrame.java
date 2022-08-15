package Frames;

import javax.swing.*;

public class MainFrame extends FrameCore{
MainFrame(){
    super();
    mainFrame.add(frameContainer);
    mainFrame.getContentPane();
    MenuPanel menu = new MenuPanel();
    frameContainer.add(menu.panel);
}
}
