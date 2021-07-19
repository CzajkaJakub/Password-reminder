package com.company.loginFrame.FramePanels;

import com.company.ImageLabel;
import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;
import com.company.loginFrame.LoginFrameElements;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel implements LoginFrameElements {
    public NorthPanel(){
        this.setPreferredSize(new Dimension(100, 250));
        this.add(new ImageLabel(passwordReminderImage));
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 60));
        this.setOpaque(true);
    }
}
