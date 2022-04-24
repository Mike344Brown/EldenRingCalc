                                                                                                                                        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giteldenring;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author craig
 */
public class FrontEnd implements ActionListener{
    
    //This method will be called when we generate our gui display.
  
        
        //Create the frame first.
        JFrame layer_1_container = new JFrame("Elden Ring Calc");
        
        //Create instance variables for the increase/decrease buttons and the Level Output Window usng a box layout.
        JPanel inc_dec_panel_left = new JPanel();
        JPanel inc_dec_panel_center = new JPanel();
        JTextField levelWindow = new JTextField();
        JButton increase = new JButton("Increase");
        JButton decrease = new JButton("Decrease");
        
        //Build Arrays for character names.
        String [] names = {"Samurai", "Prophet", "Warrior", "Hero", "Bandit", "Astrologer", "Prisoner", "Confessor", "Wretch", "Vagabond"};
        JComboBox classes = new JComboBox(names);
        JLabel currentLevel = new JLabel("Current Level");
        JLabel selectClassToLevel = new JLabel("Select Class");
        JLabel runesRequiredForNextLevel = new JLabel("Runes Required for Next Level");
        JTextField rrOutputWindow = new JTextField();
        JLabel totalRunesSpent = new JLabel("Total Runes");
        JTextField runeTotalOutputWindow = new JTextField();
        
        
        //Create instance variables for the stat labels.
        JLabel vigorStatLabel = new JLabel("Vigor");
        JLabel mindStatLabel = new JLabel("Mind");
        JLabel enduranceStatLabel = new JLabel("Endurance");
        JLabel strengthStatLabel = new JLabel("Strength");
        JLabel dexterityStatLabel = new JLabel("Dexterity");
        JLabel intelligenceStatLabel = new JLabel("Intelligence");
        JLabel faithStatLabel = new JLabel("Faith");
        JLabel arcaneStatLabel = new JLabel("Arcane");
        
        //Create instance variables to hold the text boxes for the levels
        JTextField levelVigor = new JTextField(2);
        JTextField levelMind = new JTextField(2);
        JTextField levelEndurance = new JTextField(2);
        JTextField levelStrength = new JTextField(2);
        JTextField levelDexterity = new JTextField(2);
        JTextField levelIntelligence = new JTextField(2);
        JTextField levelFaith = new JTextField(2);
        JTextField levelArcane = new JTextField(2);

        //Create instance variables for the radio buttons, each one will select a stat to level up
        JRadioButton vigorRadio = new JRadioButton();
        JRadioButton mindRadio = new JRadioButton();
        JRadioButton enduranceRadio = new JRadioButton();
        JRadioButton strengthRadio = new JRadioButton();
        JRadioButton dexterityRadio = new JRadioButton();
        JRadioButton intelligenceRadio = new JRadioButton();
        JRadioButton faithRadio = new JRadioButton();
        JRadioButton arcaneRadio = new JRadioButton();
        
        
        //Create a panel to hold all the elements of the UI inside the frame horizontally.
        JPanel container = new JPanel();
        
        //Create a panel to hold stat level text windows. 
        JPanel statLevelContainer = new JPanel();
        
        //Create a panel to hold the radio buttons
        JPanel radioButtonContainer = new JPanel();
        
        //Create individual panels for the radio buttons, stat windows, and stat labels
        JPanel vigorStatContainer = new JPanel();
        JPanel mindStatContainer = new JPanel();
        JPanel enduranceStatContainer = new JPanel();
        JPanel strengthStatContainer = new JPanel();
        JPanel dexterityStatContainer = new JPanel();
        JPanel intelligenceStatContainer = new JPanel();
        JPanel faithStatContainer = new JPanel();
        JPanel arcaneStatContainer = new JPanel();
        
        //Constructor for boxLayout button panel
        public FrontEnd(){
            
            //Left Side Panel containing current level text window, inc dec buttons, and the combobox and cb label.
            inc_dec_panel_left.setLayout(new BoxLayout(inc_dec_panel_left,BoxLayout.PAGE_AXIS));
            inc_dec_panel_left.add(currentLevel);
            inc_dec_panel_left.add(levelWindow);
            inc_dec_panel_left.add(increase); 
            inc_dec_panel_left.add(decrease);
            inc_dec_panel_left.add(selectClassToLevel);
            inc_dec_panel_left.add(classes);
            inc_dec_panel_left.add(runesRequiredForNextLevel);
            inc_dec_panel_left.add(rrOutputWindow);
            rrOutputWindow.setEditable(false);
            inc_dec_panel_left.add(totalRunesSpent);
            inc_dec_panel_left.add(runeTotalOutputWindow);
            
            
            //Set font options
            selectClassToLevel.setFont(new Font("Courier", Font.BOLD, 14));
            currentLevel.setFont(new Font("Courier", Font.BOLD, 14));
            
            
            //Vigor stat elements panels:
            vigorStatContainer.setLayout(new BoxLayout(vigorStatContainer,BoxLayout.LINE_AXIS));
            vigorStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            vigorStatContainer.add(Box.createHorizontalGlue());
            vigorStatContainer.add(vigorStatLabel);
            vigorStatContainer.add(levelVigor);
            vigorStatContainer.add(vigorRadio);
            
            //Mind stat elements panels:
            mindStatContainer.setLayout(new BoxLayout(mindStatContainer,BoxLayout.LINE_AXIS));
            mindStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            mindStatContainer.add(mindStatLabel);
            mindStatContainer.add(Box.createHorizontalStrut(80));
            mindStatContainer.add(levelMind);
            mindStatContainer.add(mindRadio);
            
            //Endurance stat elements panels:
            enduranceStatContainer.setLayout(new BoxLayout(enduranceStatContainer,BoxLayout.LINE_AXIS));
            enduranceStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            enduranceStatContainer.add(enduranceStatLabel);
            enduranceStatContainer.add(Box.createHorizontalStrut(30));
            enduranceStatContainer.add(levelEndurance);
            enduranceStatContainer.add(enduranceRadio);
            
            //Strength stat elements panels:
            strengthStatContainer.setLayout(new BoxLayout(strengthStatContainer,BoxLayout.LINE_AXIS));
            strengthStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            strengthStatContainer.add(strengthStatLabel);
            strengthStatContainer.add(Box.createHorizontalStrut(20));
            strengthStatContainer.add(levelStrength);
            strengthStatContainer.add(strengthRadio);
            
            //Dexterity stat elements panels:
            dexterityStatContainer.setLayout(new BoxLayout(dexterityStatContainer,BoxLayout.LINE_AXIS));
            dexterityStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            dexterityStatContainer.add(dexterityStatLabel);
            dexterityStatContainer.add(Box.createHorizontalStrut(20));
            dexterityStatContainer.add(levelDexterity);
            dexterityStatContainer.add(dexterityRadio);
            
            //Intelligence stat elements panels:
            intelligenceStatContainer.setLayout(new BoxLayout(intelligenceStatContainer,BoxLayout.LINE_AXIS));
            intelligenceStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            intelligenceStatContainer.add(intelligenceStatLabel);
            intelligenceStatContainer.add(Box.createHorizontalStrut(20));
            intelligenceStatContainer.add(levelIntelligence);
            intelligenceStatContainer.add(intelligenceRadio);
            
            //Faith stat elements panels:
            faithStatContainer.setLayout(new BoxLayout(faithStatContainer,BoxLayout.LINE_AXIS));
            faithStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            faithStatContainer.add(faithStatLabel);
            faithStatContainer.add(Box.createHorizontalStrut(20));
            faithStatContainer.add(levelFaith);
            faithStatContainer.add(faithRadio);
            
            //Arcane stat elements panels:
            arcaneStatContainer.setLayout(new BoxLayout(arcaneStatContainer,BoxLayout.LINE_AXIS));
            arcaneStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            arcaneStatContainer.add(arcaneStatLabel);
            arcaneStatContainer.add(Box.createHorizontalStrut(20));
            arcaneStatContainer.add(levelArcane);
            arcaneStatContainer.add(arcaneRadio);
            
            
            
            
            //Add Stat elements to a vertically oriented container
            radioButtonContainer.setLayout(new BoxLayout(radioButtonContainer,BoxLayout.PAGE_AXIS));
            radioButtonContainer.add(Box.createVerticalStrut(10));
            radioButtonContainer.add(vigorStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(10));
            radioButtonContainer.add(mindStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(10));
            radioButtonContainer.add(enduranceStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(10));
            radioButtonContainer.add(strengthStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(10));
            radioButtonContainer.add(dexterityStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(10));
            radioButtonContainer.add(intelligenceStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(10));
            radioButtonContainer.add(faithStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(10));
            radioButtonContainer.add(arcaneStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(10));
            
            //Add panel containers to the frame
            container.add(inc_dec_panel_left, BorderLayout.WEST);
            container.add(inc_dec_panel_center, BorderLayout.CENTER);
            container.add(statLevelContainer, BorderLayout.EAST);
            
            container.add(radioButtonContainer, BorderLayout.EAST);
            
            
            //Add container to frame
            layer_1_container.add(container);
            layer_1_container.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            
            layer_1_container.pack();
            layer_1_container.setVisible(true);
            
            //Build Classes
            Classes Samurai =  new Classes("Samurai", 12, 11, 13, 12, 15, 9, 8, 8);
            Classes Prophet =  new Classes("Prophet", 10, 14, 8, 11, 10, 7, 16, 10);
            Classes Warrior =  new Classes("Warrior", 11, 12, 11, 10, 16, 10, 8, 9);
            Classes Hero =  new Classes("Hero", 14, 9, 12, 16, 9, 7, 8, 11);
            Classes Bandit =  new Classes("Bandit", 10, 11, 10, 9, 13, 9, 8, 14);
            Classes Astrologer =  new Classes("Astrologer", 9, 15, 9, 8, 12, 16, 7, 9);
            Classes Prisoner =  new Classes("Prisoner", 14, 9, 12, 16, 9, 7, 8, 11);
            Classes Confessor =  new Classes("Confessor", 10, 13, 10, 12, 12, 9, 14, 9);
            Classes Wretch =  new Classes("Wretch", 10, 10, 10, 10, 10, 10, 10, 10);
            Classes Vagabond =  new Classes("Vagabond", 15, 10, 11, 14, 13, 9, 9, 7);
            
            System.out.print("The Hero's Arcane stat is " + Hero.arcane);
            
            
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     
    }
    
    public int selectClassComboBox(String classSelected )
    {
    
    return 0;
    }   
    
    
}
