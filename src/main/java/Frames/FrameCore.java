package Frames;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCore{
   protected Container frameContainer = new Container() ;
   protected JFrame mainFrame= new JFrame();
    protected Dimension dim = new Dimension(0,0);
        FrameCore(){
            mainFrame.setBounds(500,500,400,400);
            mainFrame.setVisible(true);
            mainFrame.setDefaultCloseOperation(3);
        }
    FrameCore(int sizeX,int sizeY,int positionX,int positionY){
        mainFrame.add(frameContainer);
        mainFrame.getContentPane();
        mainFrame.setBounds(sizeX,sizeY,positionX,positionY);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(3);
    }
}
