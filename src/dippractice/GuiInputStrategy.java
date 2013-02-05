package dippractice;

import javax.swing.JOptionPane;

public class GuiInputStrategy implements InputStrategy {
    
    public String inputMessage() {
        String msg = JOptionPane.showInputDialog("Enter text", "");
        return msg;
    }
}
