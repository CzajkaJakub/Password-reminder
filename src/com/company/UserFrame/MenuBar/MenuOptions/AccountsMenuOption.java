package com.company.UserFrame.MenuBar.MenuOptions;

import com.company.UserFrame.MenuBar.BarFunctions;
import com.company.UserFrame.UserDataSystem.UserData;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class AccountsMenuOption extends JMenu implements BarElementsSettings {

    private JMenuItem addAccount;
    private JMenuItem deleteAccount;
    private JMenuItem changePasswordAccount;
    private JMenuItem showAccount;


    public AccountsMenuOption() {
        createBarElements();
        barSettings();
    }


    public void createBarElements() {
        addAccount = new JMenuItem(addAccountOption);
        deleteAccount = new JMenuItem(deleteAccountOption);
        changePasswordAccount = new JMenuItem(changePassword);
        showAccount = new JMenuItem(showAllAccounts);
    }

    public void barSettings() {
        this.setText(firstBarElement);
        this.setIcon(accountsIcon);
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setForeground(SystemColors.textColor);
        this.add(addAccount);
        this.add(deleteAccount);
        this.add(changePasswordAccount);
        this.add(showAccount);
    }


    public void addListeners(UserData data) {
        addAccount.addActionListener(e-> BarFunctions.addAccount(data));
        deleteAccount.addActionListener(e-> BarFunctions.deleteAccount(data));
        changePasswordAccount.addActionListener(e-> BarFunctions.changePasswordOfYourAccounts(data));
        showAccount.addActionListener(e-> BarFunctions.showAllAccounts(data));
    }
}