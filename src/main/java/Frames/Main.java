package Frames;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            SwingUtilities.invokeLater(MainFrame::new);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
