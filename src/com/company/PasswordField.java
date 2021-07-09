package com.company;

import javax.swing.*;
import java.awt.*;

public class PasswordField extends JPasswordField {
    PasswordField(String text){
        this.setPreferredSize(new Dimension(250, 45));
        this.setFont(new Font("Consolas", Font.BOLD, 25));
        this.setHorizontalAlignment(JTextField.CENTER);
        this.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.red));
        this.setText(text);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setCaretColor(Color.WHITE);
        this.setEchoChar('*');

    }
}
