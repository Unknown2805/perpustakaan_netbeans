package apk.perpustakaan;

import javax.swing.*;
import java.awt.*;

public class RoundedButton extends JButton {
    
    //no argument class biar bisa ditambah jadi palete
    public RoundedButton() {
        this("Button"); // Calls the other constructor with default text
    }

    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
        setForeground(Color.WHITE); 
    }
    
    

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

        super.paintComponent(g);
    }
}