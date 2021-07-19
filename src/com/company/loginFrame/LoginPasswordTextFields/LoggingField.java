package com.company.loginFrame.LoginPasswordTextFields;

import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class LoggingField extends JTextField {
    public LoggingField(String text){
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setPreferredSize(new Dimension(450, 70));
        this.setHorizontalAlignment(JTextField.CENTER);
        this.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.red));
        this.setText(text);
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
        this.setCaretColor(SystemColors.textColor);
    }
}
