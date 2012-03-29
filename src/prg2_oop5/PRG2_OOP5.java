/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author ramon
 */
public class PRG2_OOP5 extends JFrame {

    int counter = 0;
    
    private JLabel      countLabel;
    private JButton     countButton;
    
    private JMenuBar    menuBar;
    private JMenu       menuFile;
    private JMenuItem   menuItemClose;
    private JMenu       menuHelp;
    private JMenuItem   menuItemAbout;
    
    public PRG2_OOP5() {
        // GUI Settings
        super("SwingGUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);
        
        // Menubar
        menuBar =           new JMenuBar();
        menuFile =          new JMenu("File");
        menuItemClose =     new JMenuItem("Close");
        
        menuHelp =          new JMenu("Help");
        menuItemAbout =     new JMenuItem("About");
       
        // MenuListener
        menuItemClose.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                   System.exit(0);
                }
            }
        );
        menuItemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"(C) by RRa","Simple Menu Example",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        // GUI
        countButton = new JButton("Count button clicks");
        countLabel = new JLabel("0");
        countLabel.setBorder(new EtchedBorder());
        
        // GUIListener
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                counter++;
                countLabel.setText(new Integer(counter).toString());
            }
        });
        
        // Add components to GUI
        menuFile.add(menuItemClose);
        menuHelp.add(menuItemAbout);
        
        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        
        setJMenuBar(menuBar);
        
        setLayout(new GridLayout(0,1));

        
        add(countButton);
        add(countLabel);
        
        // Set visible
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame myFrame = new PRG2_OOP5();
    }
}
