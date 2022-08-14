package Frames;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCore{
   private Container frameContainer = new Container() ;
   private JFrame mainFrame= new JFrame();
    private Dimension dim = new Dimension(0,0);
        FrameCore(){
            mainFrame.add(frameContainer);
            mainFrame.getContentPane();
            mainFrame.setBounds(500,500,400,400);
            mainFrame.setVisible(true);
            mainFrame.setDefaultCloseOperation(3);
            frameContainer.add(testPanelBuilder(0,100,100,Color.cyan));
            frameContainer.add(createButtons(0,0,0,"Next panel"));
        }

        private JButton createButtons(int id,int posX,int posY,String name){
            Dimension DefaultDim= new Dimension(40,40);
            JButton button= new JButton(name);
            button.setSize(DefaultDim);
            button.setLocation(posX,posY);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button.getText()=="Next panel"){
                        if(frameContainer.getComponent(0).)
                        frameContainer.getComponent(0).setVisible(false);
                    }
                }
            });
            return button;
        }
        private JPanel testPanelBuilder(int id,int panelX,int panelY,Color bgColor){
            JPanel  panel = new JPanel();
            panel.setBounds(100,100,panelX,panelY);
            panel.setBackground(bgColor);
            panel.setVisible(true);
            return panel;
        }
}
