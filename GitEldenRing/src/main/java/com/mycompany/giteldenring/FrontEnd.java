
                                                                                                                                        /*
                                                                                                                                         /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giteldenring;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.*;
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
        JTextField levelWindow = new JTextField(2);
        JButton increase = new JButton("Increase");
        JButton decrease = new JButton("Decrease");
        //Marvins Code--------------------------------------------------------------------------
        Font segoeFont20 = new Font("Segoe UI", Font.BOLD, 20);
        Font segoeFont40 = new Font("Segoe UI", Font.BOLD, 40);
        Font segoeFont50 = new Font("Segoe UI", Font.BOLD, 50);
        Font segoeFont18 = new Font("Segoe UI", Font.BOLD, 18);
        Font segoeFont16 = new Font("Segoe UI", Font.BOLD, 16);
        Font segoeItalic12 = new Font("Segoe UI Semibold Italic", Font.PLAIN, 12);
        Font segoeFont12 = new Font("Segoe UI", Font.BOLD, 12);
        Font castellar26 = new Font("Castellar", Font.BOLD, 26);
        Font stencil24 = new Font("Stencil", Font.BOLD, 20);
        Font stencil40 = new Font("Stencil", Font.BOLD, 40);
        
        //Build Arrays for character names.
        String [] names = {"", "Samurai", "Prophet", "Warrior", "Hero", "Bandit", "Astrologer", "Prisoner", "Confessor", "Wretch", "Vagabond"};
        JComboBox classes = new JComboBox(names);
        JLabel currentLevel = new JLabel("Current Level");
        JLabel selectClassToLevel = new JLabel("Select Class");
        JLabel runesRequiredForNextLevel = new JLabel("Next Level Cost");
        JTextField rrOutputWindow = new JTextField();
        JLabel totalRunesSpent = new JLabel("Total Runes");
        JTextField runeTotalOutputWindow = new JTextField();
        
        JLabel title  = new JLabel("RUNE CALCULATOR");
        //Create instance variables for the stat labels.
        JLabel vigorStatLabel = new JLabel("Vigor");
        JLabel mindStatLabel = new JLabel("Mind");
        JLabel enduranceStatLabel = new JLabel("Endurance");
        JLabel strengthStatLabel = new JLabel("Strength");
        JLabel dexterityStatLabel = new JLabel("Dexterity");
        JLabel intelligenceStatLabel = new JLabel("Intelligence");
        JLabel faithStatLabel = new JLabel("Faith");
        JLabel arcaneStatLabel = new JLabel("Arcane");
        
        
        //Marvin
        JLabel currentLevelLabel = new JLabel("Current Level");
        
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
        JRadioButton vigorRadio = new JRadioButton("Vigor");
        JRadioButton mindRadio = new JRadioButton("Mind");
        JRadioButton enduranceRadio = new JRadioButton("Endurance");
        JRadioButton strengthRadio = new JRadioButton("Strength");
        JRadioButton dexterityRadio = new JRadioButton("Dexterity");
        JRadioButton intelligenceRadio = new JRadioButton("Intelligence");
        JRadioButton faithRadio = new JRadioButton("Faith");
        JRadioButton arcaneRadio = new JRadioButton("Arcane");
        
        //Create radio button group *** Marvin***
        ButtonGroup buttonGroup = new ButtonGroup();
        ButtonGroup textGroup = new ButtonGroup();
               
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
        
        //JPanel titleContainer = new JPanel();
        JPanel levelContainer = new JPanel();
        
        public int levelInt = 12;
        
        //Instantiate new rune formula object
        RuneFormula formula = new RuneFormula(levelInt);
        
        //Constructor for boxLayout button panel
        public FrontEnd(){
            
           
            //Left Side Panel containing current level text window, inc dec buttons, and the combobox and cb label.
            inc_dec_panel_left.setLayout(new BoxLayout(inc_dec_panel_left,BoxLayout.PAGE_AXIS));
            
            //Marvins code 2 lines
//            increase.setBackground(Color.GREEN);
//            decrease.setBackground(Color.RED);
            inc_dec_panel_left.add(Box.createVerticalStrut(20));
            inc_dec_panel_left.add(levelContainer);
            inc_dec_panel_left.add(levelWindow);
            inc_dec_panel_left.add(Box.createVerticalStrut(10));
            inc_dec_panel_left.add(increase);
            inc_dec_panel_left.add(decrease);
            inc_dec_panel_left.add(Box.createVerticalStrut(10));
           
            inc_dec_panel_left.add(selectClassToLevel);
            
            inc_dec_panel_left.add(classes);
            
            //Marvins Code-------------------------------------------------------5 Lines
            inc_dec_panel_left.add(Box.createVerticalStrut(20));
            inc_dec_panel_left.add(increase); 
            inc_dec_panel_left.add(Box.createVerticalStrut(20));
            inc_dec_panel_left.add(decrease);
            inc_dec_panel_left.add(Box.createVerticalStrut(40));
            
            
            inc_dec_panel_left.add(runesRequiredForNextLevel);
            inc_dec_panel_left.add(rrOutputWindow);
            rrOutputWindow.setEditable(false);
            inc_dec_panel_left.add(Box.createVerticalStrut(20));
            inc_dec_panel_left.add(totalRunesSpent);
            inc_dec_panel_left.add(runeTotalOutputWindow);
            
            
            //Marvins Code--------------------------------------------------6 Lines
//            Alignment of Panels
//            inc_dec_panel_center.add(Box.createRigidArea(centerArea));
            currentLevelLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
            levelContainer.setLayout(new BoxLayout(levelContainer,BoxLayout.PAGE_AXIS));
            levelContainer.add(Box.createVerticalStrut(10));
            
            currentLevelLabel.setFont(stencil24);
            levelWindow.setFont(segoeFont40);
            levelContainer.add(currentLevelLabel);
            levelContainer.add(levelWindow);
            classes.setFont(segoeFont20);
            selectClassToLevel.setFont(stencil24);
            increase.setFont(stencil24);
            runesRequiredForNextLevel.setFont(stencil24);
            rrOutputWindow.setFont(segoeFont20);
            totalRunesSpent.setFont(stencil24);
            runeTotalOutputWindow.setFont(segoeFont20);
            decrease.setFont(stencil24);
            //Set font options
            //selectClassToLevel.setFont(new Font("Courier", Font.BOLD, 14));
            //currentLevel.setFont(new Font("Courier", Font.BOLD, 20));
            //MIKES CODE^^^
            
            //Marvins Code
            faithRadio.setFont(stencil24);
            arcaneRadio.setFont(stencil24);
            intelligenceRadio.setFont(stencil24);
            vigorRadio.setFont(stencil24);
            mindRadio.setFont(stencil24);
            enduranceRadio.setFont(stencil24);
            strengthRadio.setFont(stencil24);
            dexterityRadio.setFont(stencil24);
            
            
            //Text Alignment insode textFields ***Marvin***
            levelVigor.setHorizontalAlignment(JTextField.CENTER);
            levelMind.setHorizontalAlignment(JTextField.CENTER);
            levelEndurance.setHorizontalAlignment(JTextField.CENTER);
            levelStrength.setHorizontalAlignment(JTextField.CENTER);
            levelDexterity.setHorizontalAlignment(JTextField.CENTER);
            levelIntelligence.setHorizontalAlignment(JTextField.CENTER);
            levelFaith.setHorizontalAlignment(JTextField.CENTER);
            levelArcane.setHorizontalAlignment(JTextField.CENTER);
            selectClassToLevel.setHorizontalAlignment(JTextField.LEFT);
            ((JLabel)classes.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            levelWindow.setHorizontalAlignment(JTextField.CENTER);
            rrOutputWindow.setHorizontalAlignment(JTextField.RIGHT);
            runeTotalOutputWindow.setHorizontalAlignment(JTextField.RIGHT);
                   
            //Align radio buttons ***Marvin***
            vigorStatContainer.setAlignmentX(Component.LEFT_ALIGNMENT);
            mindStatContainer.setAlignmentX(Component.LEFT_ALIGNMENT);
            enduranceStatContainer.setAlignmentX(Component.LEFT_ALIGNMENT);
            strengthStatContainer.setAlignmentX(Component.LEFT_ALIGNMENT);
            dexterityStatContainer.setAlignmentX(Component.LEFT_ALIGNMENT);
            intelligenceStatContainer.setAlignmentX(Component.LEFT_ALIGNMENT);
            faithStatContainer.setAlignmentX(Component.LEFT_ALIGNMENT);
            arcaneStatContainer.setAlignmentX(Component.LEFT_ALIGNMENT);
            
            //Alignment of Output WIndows
            increase.setAlignmentX(Component.RIGHT_ALIGNMENT);
            decrease.setAlignmentX(Component.RIGHT_ALIGNMENT);
            selectClassToLevel.setAlignmentX(Component.RIGHT_ALIGNMENT);
            classes.setAlignmentX(Component.RIGHT_ALIGNMENT);
            selectClassToLevel.setAlignmentX(Component.RIGHT_ALIGNMENT);
            levelWindow.setAlignmentX(Component.RIGHT_ALIGNMENT);
            //selectClassToLevel.setAlignmentX(Component.RIGHT_ALIGNMENT);
            
            runesRequiredForNextLevel.setAlignmentX(Component.RIGHT_ALIGNMENT);
            totalRunesSpent.setAlignmentX(Component.RIGHT_ALIGNMENT);
            
            
//Marvins code block end--------------------------------------------------------------------------------------
            

//Title container Marvin-------------------------------------------------------
            //titleContainer.add(title);
            
            //Vigor stat elements panels:
//            vigorStatContainer.setLayout(new BoxLayout(vigorStatContainer,BoxLayout.LINE_AXIS));
//            vigorStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
//            vigorStatContainer.add(Box.createHorizontalGlue());
////            vigorStatContainer.add(vigorStatLabel);
//            vigorStatContainer.add(levelVigor);
//            vigorStatContainer.add(vigorRadio);

//Marvins Vigor Stat Element-----------------------------------------------------------------------

            vigorStatContainer.setLayout(new BoxLayout(vigorStatContainer,BoxLayout.LINE_AXIS));
            vigorStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            levelVigor.setFont(segoeFont20);
            vigorStatContainer.add(Box.createHorizontalStrut(20));
            vigorStatContainer.add(levelVigor);
            vigorStatContainer.add(vigorRadio);
            
            
            //Mind stat elements panels:
            mindStatContainer.setLayout(new BoxLayout(mindStatContainer,BoxLayout.LINE_AXIS));
            mindStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            levelMind.setFont(segoeFont20);
            mindStatContainer.add(Box.createHorizontalStrut(20));
            mindStatContainer.add(levelMind);
            mindStatContainer.add(mindRadio);
            
            //Endurance stat elements panels:
            enduranceStatContainer.setLayout(new BoxLayout(enduranceStatContainer,BoxLayout.LINE_AXIS));
            enduranceStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            levelEndurance.setFont(segoeFont20);
            enduranceStatContainer.add(Box.createHorizontalStrut(20));
            enduranceStatContainer.add(levelEndurance);
            enduranceStatContainer.add(enduranceRadio);
            
            //Strength stat elements panels:
            strengthStatContainer.setLayout(new BoxLayout(strengthStatContainer,BoxLayout.LINE_AXIS));
            strengthStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            levelStrength.setFont(segoeFont20);
            strengthStatContainer.add(Box.createHorizontalStrut(20));
            strengthStatContainer.add(levelStrength);
            strengthStatContainer.add(strengthRadio);
            
            //Dexterity stat elements panels:
            dexterityStatContainer.setLayout(new BoxLayout(dexterityStatContainer,BoxLayout.LINE_AXIS));
            dexterityStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            levelDexterity.setFont(segoeFont20);
            dexterityStatContainer.add(Box.createHorizontalStrut(20));
            dexterityStatContainer.add(levelDexterity);
            dexterityStatContainer.add(dexterityRadio);
            
            //Intelligence stat elements panels:
            intelligenceStatContainer.setLayout(new BoxLayout(intelligenceStatContainer,BoxLayout.LINE_AXIS));
            intelligenceStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            levelIntelligence.setFont(segoeFont20);
            intelligenceStatContainer.add(Box.createHorizontalStrut(20));
            intelligenceStatContainer.add(levelIntelligence);
            intelligenceStatContainer.add(intelligenceRadio);
            
            //Faith stat elements panels:
            faithStatContainer.setLayout(new BoxLayout(faithStatContainer,BoxLayout.LINE_AXIS));
            faithStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            levelFaith.setFont(segoeFont20);
            faithStatContainer.add(Box.createHorizontalStrut(20));
            faithStatContainer.add(levelFaith);
            faithStatContainer.add(faithRadio);
            
            //Arcane stat elements panels:
            arcaneStatContainer.setLayout(new BoxLayout(arcaneStatContainer,BoxLayout.LINE_AXIS));
            arcaneStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            levelArcane.setFont(segoeFont20);
            arcaneStatContainer.add(Box.createHorizontalStrut(20));
            arcaneStatContainer.add(levelArcane);
            arcaneStatContainer.add(arcaneRadio);
            

            //Create Stat Windows level container ***Marvin***
            statLevelContainer.setLayout(new BoxLayout(statLevelContainer, BoxLayout.PAGE_AXIS));
            statLevelContainer.add(Box.createVerticalStrut(10));
            statLevelContainer.add(levelVigor);
            statLevelContainer.add(Box.createVerticalStrut(20));
            statLevelContainer.add(levelMind);
            statLevelContainer.add(Box.createVerticalStrut(20));
            statLevelContainer.add(levelEndurance);
            statLevelContainer.add(Box.createVerticalStrut(20));
            statLevelContainer.add(levelStrength);
            statLevelContainer.add(Box.createVerticalStrut(20));
            statLevelContainer.add(levelDexterity);
            statLevelContainer.add(Box.createVerticalStrut(20));
            statLevelContainer.add(levelIntelligence);
            statLevelContainer.add(Box.createVerticalStrut(20));
            statLevelContainer.add(levelFaith);
            statLevelContainer.add(Box.createVerticalStrut(20));
            statLevelContainer.add(levelArcane);
  

            
            
            

            //Add Radio Buttons and Labels elements to a vertically oriented container
            radioButtonContainer.setLayout(new BoxLayout(radioButtonContainer,BoxLayout.PAGE_AXIS));
            //radioButtonContainer.add(Box.createVerticalStrut(20));
            radioButtonContainer.add(vigorStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(20));
            radioButtonContainer.add(mindStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(20));
            radioButtonContainer.add(enduranceStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(20));
            radioButtonContainer.add(strengthStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(20));
            radioButtonContainer.add(dexterityStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(20));
            radioButtonContainer.add(intelligenceStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(20));
            radioButtonContainer.add(faithStatContainer);
            radioButtonContainer.add(Box.createVerticalStrut(20));
            radioButtonContainer.add(arcaneStatContainer);
            //radioButtonContainer.add(Box.createVerticalStrut(40));
            
            //Add action commands to radio buttons ***Marvin***
            vigorRadio.setActionCommand("Vigor");
//            vigorRadio.setSelected(true);
            mindRadio.setActionCommand("Mind");
            enduranceRadio.setActionCommand("Endurance");
            strengthRadio.setActionCommand("Strength");
            dexterityRadio.setActionCommand("Dexterity");
            intelligenceRadio.setActionCommand("Intelligence");
            faithRadio.setActionCommand("Faith");
            arcaneRadio.setActionCommand("Arcane");
            
            //Add action commands to textfields ***Marvin***
            levelVigor.setActionCommand("VigorText");
            
            //Set text fields uneditable
            levelVigor.setEditable(false);
            levelMind.setEditable(false);
            levelEndurance.setEditable(false);
            levelStrength.setEditable(false);
            levelDexterity.setEditable(false);
            levelIntelligence.setEditable(false);
            levelFaith.setEditable(false);
            levelArcane.setEditable(false);
            levelWindow.setEditable(false);
            runeTotalOutputWindow.setEditable(false);
            
            
            
//            //Add Radio Button font ***Marvin***
//            vigorRadio.setFont(myFont);
//            mindRadio.setFont(myFont);
//            enduranceRadio.setFont(myFont);
//            strengthRadio.setFont(myFont);
//            dexterityRadio.setFont(myFont);
//            intelligenceRadio.setFont(myFont);
//            faithRadio.setFont(myFont);
//            arcaneRadio.setFont(myFont);
            
            //Add buttons to button group ***Marvin***
            buttonGroup.add(vigorRadio);
            buttonGroup.add(mindRadio);
            buttonGroup.add(enduranceRadio);
            buttonGroup.add(strengthRadio);
            buttonGroup.add(dexterityRadio);
            buttonGroup.add(intelligenceRadio);
            buttonGroup.add(faithRadio);
            buttonGroup.add(arcaneRadio);
            
            
            //Add panel containers to the frame
            //container.add(levelContainer, BorderLayout.NORTH);
            container.add(inc_dec_panel_left, BorderLayout.WEST);
            
            container.add(inc_dec_panel_center, BorderLayout.CENTER);
            
            
            container.add(radioButtonContainer, BorderLayout.EAST);
            container.add(statLevelContainer, BorderLayout.EAST);
          
            //Add container to frame
            layer_1_container.add(container);
            layer_1_container.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            
            layer_1_container.setSize(540,540);
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
            
                     
            //Add ComboBox Listener
            classes.addActionListener((ActionEvent e) -> {
                //This line of code grabs the combo box selection to pass to the switch statement
                String comboBoxSelection = classes.getSelectedItem().toString();
                
                //This Switch statement passes all of the stat values into the text selection windows    
                switch (comboBoxSelection) {
                    case "Samurai":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Samurai.vigor));
                        levelMind.setText(String.valueOf(Samurai.mind));
                        levelEndurance.setText(String.valueOf(Samurai.endurance));
                        levelStrength.setText(String.valueOf(Samurai.strength));
                        levelDexterity.setText(String.valueOf(Samurai.dexterity));
                        levelIntelligence.setText(String.valueOf(Samurai.intelligence));
                        levelFaith.setText(String.valueOf(Samurai.faith));
                        levelArcane.setText(String.valueOf(Samurai.arcane));
                        break;
                    case "Prophet":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Prophet.vigor));
                        levelMind.setText(String.valueOf(Prophet.mind));
                        levelEndurance.setText(String.valueOf(Prophet.endurance));
                        levelStrength.setText(String.valueOf(Prophet.strength));
                        levelDexterity.setText(String.valueOf(Prophet.dexterity));
                        levelIntelligence.setText(String.valueOf(Prophet.intelligence));
                        levelFaith.setText(String.valueOf(Prophet.faith));
                        levelArcane.setText(String.valueOf(Prophet.arcane));
                        break;
                    case "Warrior":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Warrior.vigor));
                        levelMind.setText(String.valueOf(Warrior.mind));
                        levelEndurance.setText(String.valueOf(Warrior.endurance));
                        levelStrength.setText(String.valueOf(Warrior.strength));
                        levelDexterity.setText(String.valueOf(Warrior.dexterity));
                        levelIntelligence.setText(String.valueOf(Warrior.intelligence));
                        levelFaith.setText(String.valueOf(Warrior.faith));
                        levelArcane.setText(String.valueOf(Warrior.arcane));
                        break;
                    case "Hero":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Hero.vigor));
                        levelMind.setText(String.valueOf(Hero.mind));
                        levelEndurance.setText(String.valueOf(Hero.endurance));
                        levelStrength.setText(String.valueOf(Hero.strength));
                        levelDexterity.setText(String.valueOf(Hero.dexterity));
                        levelIntelligence.setText(String.valueOf(Hero.intelligence));
                        levelFaith.setText(String.valueOf(Hero.faith));
                        levelArcane.setText(String.valueOf(Hero.arcane));
                        break;
                    case "Bandit":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Bandit.vigor));
                        levelMind.setText(String.valueOf(Bandit.mind));
                        levelEndurance.setText(String.valueOf(Bandit.endurance));
                        levelStrength.setText(String.valueOf(Bandit.strength));
                        levelDexterity.setText(String.valueOf(Bandit.dexterity));
                        levelIntelligence.setText(String.valueOf(Bandit.intelligence));
                        levelFaith.setText(String.valueOf(Bandit.faith));
                        levelArcane.setText(String.valueOf(Bandit.arcane));
                        break;
                    case "Astrologer":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Astrologer.vigor));
                        levelMind.setText(String.valueOf(Astrologer.mind));
                        levelEndurance.setText(String.valueOf(Astrologer.endurance));
                        levelStrength.setText(String.valueOf(Astrologer.strength));
                        levelDexterity.setText(String.valueOf(Astrologer.dexterity));
                        levelIntelligence.setText(String.valueOf(Astrologer.intelligence));
                        levelFaith.setText(String.valueOf(Astrologer.faith));
                        levelArcane.setText(String.valueOf(Astrologer.arcane));
                        break;
                    case "Prisoner":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Prisoner.vigor));
                        levelMind.setText(String.valueOf(Prisoner.mind));
                        levelEndurance.setText(String.valueOf(Prisoner.endurance));
                        levelStrength.setText(String.valueOf(Prisoner.strength));
                        levelDexterity.setText(String.valueOf(Prisoner.dexterity));
                        levelIntelligence.setText(String.valueOf(Prisoner.intelligence));
                        levelFaith.setText(String.valueOf(Prisoner.faith));
                        levelArcane.setText(String.valueOf(Prisoner.arcane));
                        break;
                    case "Confessor":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Confessor.vigor));
                        levelMind.setText(String.valueOf(Confessor.mind));
                        levelEndurance.setText(String.valueOf(Confessor.endurance));
                        levelStrength.setText(String.valueOf(Confessor.strength));
                        levelDexterity.setText(String.valueOf(Confessor.dexterity));
                        levelIntelligence.setText(String.valueOf(Confessor.intelligence));
                        levelFaith.setText(String.valueOf(Confessor.faith));
                        levelArcane.setText(String.valueOf(Confessor.arcane));
                        break;
                    case "Wretch":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Wretch.vigor));
                        levelMind.setText(String.valueOf(Wretch.mind));
                        levelEndurance.setText(String.valueOf(Wretch.endurance));
                        levelStrength.setText(String.valueOf(Wretch.strength));
                        levelDexterity.setText(String.valueOf(Wretch.dexterity));
                        levelIntelligence.setText(String.valueOf(Wretch.intelligence));
                        levelFaith.setText(String.valueOf(Wretch.faith));
                        levelArcane.setText(String.valueOf(Wretch.arcane));
                        break;
                    case "Vagabond":
                        levelWindow.setText(String.valueOf(12));
                        levelVigor.setText(String.valueOf(Vagabond.vigor));
                        levelMind.setText(String.valueOf(Vagabond.mind));
                        levelEndurance.setText(String.valueOf(Vagabond.endurance));
                        levelStrength.setText(String.valueOf(Vagabond.strength));
                        levelDexterity.setText(String.valueOf(Vagabond.dexterity));
                        levelIntelligence.setText(String.valueOf(Vagabond.intelligence));
                        levelFaith.setText(String.valueOf(Vagabond.faith));
                        levelArcane.setText(String.valueOf(Vagabond.arcane));
                        break;
                }
            });
            
            //levelWindow Action
            //levelWindow.setText(String.valueOf(12));
            //Add Button Press Event Listener
            increase.addActionListener((ActionEvent e) ->
            {
                //levelInt++;
               
                if(vigorRadio.isSelected())
                        {
                            levelInt++;
                            levelWindow.setText(String.valueOf(levelInt));
                            rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                            Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                            runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                            System.out.println("Increase Button Pressed");
                            Samurai.vigor++;
                            levelVigor.setText(String.valueOf(Samurai.vigor));
                           
                        }
                else if(mindRadio.isSelected())
                        {
                            levelInt++;
                            levelWindow.setText(String.valueOf(levelInt));
                            rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                            Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                            runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                            System.out.println("Increase Button Pressed");
                            Samurai.mind++;
                            levelMind.setText(String.valueOf(Samurai.mind));
                        }
                else if(enduranceRadio.isSelected())
                        {
                            levelInt++;
                            levelWindow.setText(String.valueOf(levelInt));
                            rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                            Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                            runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                            System.out.println("Increase Button Pressed");
                            Samurai.endurance++;
                            levelEndurance.setText(String.valueOf(Samurai.endurance));
                        }
                else if(strengthRadio.isSelected())
                        {
                            levelInt++;
                            levelWindow.setText(String.valueOf(levelInt));
                            rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                            Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                            runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                            System.out.println("Increase Button Pressed");
                            Samurai.strength++;
                            levelStrength.setText(String.valueOf(Samurai.strength));
                        }
                else if(dexterityRadio.isSelected())
                        {
                            levelInt++;
                            levelWindow.setText(String.valueOf(levelInt));
                            rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                            Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                            runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                            System.out.println("Increase Button Pressed");
                            Samurai.dexterity++;
                            levelDexterity.setText(String.valueOf(Samurai.dexterity));
                        }
                else if(intelligenceRadio.isSelected())
                        {
                            levelInt++;
                            levelWindow.setText(String.valueOf(levelInt));
                            rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                            Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                            runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                            System.out.println("Increase Button Pressed");
                            Samurai.intelligence++;
                            levelIntelligence.setText(String.valueOf(Samurai.intelligence));
                        }
                else if(faithRadio.isSelected())
                        {
                            levelInt++;
                            levelWindow.setText(String.valueOf(levelInt));
                            rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                            Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                            runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                            System.out.println("Increase Button Pressed");
                            Samurai.faith++;
                            levelFaith.setText(String.valueOf(Samurai.faith));
                        }
                else if(arcaneRadio.isSelected())
                        {
                            levelInt++;
                            levelWindow.setText(String.valueOf(levelInt));
                            rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                            Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                            runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                            System.out.println("Increase Button Pressed");
                            Samurai.arcane++;
                            levelArcane.setText(String.valueOf(Samurai.arcane));
                        }
                    //This is error handling done by **Nathan**    
                else    
                        {
                            JFrame f;
                            f =new JFrame();
                            JOptionPane.showMessageDialog(f,"Please Select a Stat to increase level .","Alert",JOptionPane.WARNING_MESSAGE);
                        }

                });

            decrease.addActionListener((ActionEvent e) ->
            {
                 //This is error handling done by **Nathan**    

                if (levelInt == 12)
                   {
                        JFrame f;
                        f =new JFrame();
                        JOptionPane.showMessageDialog(f,"Level formula only works for 12, Level has not been decreased.","Alert",JOptionPane.WARNING_MESSAGE);
                                
                   }
                    else
                    {
                       
                        if(vigorRadio.isSelected())
                                {
                                    levelInt--;
                                    levelWindow.setText(String.valueOf(levelInt));
                                    rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                                    Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                                    runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                                    System.out.println("Decrease Button Pressed");
                                    Samurai.vigor--;
                                    levelVigor.setText(String.valueOf(Samurai.vigor));
                                }
                        else if(mindRadio.isSelected())
                                {
                                    levelInt--;
                                    levelWindow.setText(String.valueOf(levelInt));
                                    rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                                    Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                                    runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                                    System.out.println("Decrease Button Pressed");
                                    Samurai.mind--;
                                    levelMind.setText(String.valueOf(Samurai.mind));
                                }
                        else if(enduranceRadio.isSelected())
                                {
                                    levelInt--;
                                    levelWindow.setText(String.valueOf(levelInt));
                                    rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                                    Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                                    runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                                    System.out.println("Decrease Button Pressed");
                                    Samurai.endurance--;
                                    levelEndurance.setText(String.valueOf(Samurai.endurance));
                                }
                        else if(strengthRadio.isSelected())
                                {
                                    levelInt--;
                                    levelWindow.setText(String.valueOf(levelInt));
                                    rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                                    Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                                    runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                                    System.out.println("Decrease Button Pressed");
                                    Samurai.strength--;
                                    levelStrength.setText(String.valueOf(Samurai.strength));
                                }
                        else if(dexterityRadio.isSelected())
                                {
                                    levelInt--;
                                    levelWindow.setText(String.valueOf(levelInt));
                                    rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                                    Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                                    runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                                    System.out.println("Decrease Button Pressed");
                                    Samurai.dexterity--;
                                    levelDexterity.setText(String.valueOf(Samurai.dexterity));
                                }
                        else if(intelligenceRadio.isSelected())
                                {
                                    levelInt--;
                                    levelWindow.setText(String.valueOf(levelInt));
                                    rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                                    Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                                    runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                                    System.out.println("Decrease Button Pressed");
                                    Samurai.intelligence--;
                                    levelIntelligence.setText(String.valueOf(Samurai.intelligence));
                                }
                        else if(faithRadio.isSelected())
                                {
                                    levelInt--;
                                    levelWindow.setText(String.valueOf(levelInt));
                                    rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                                    Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                                    runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                                    System.out.println("Decrease Button Pressed");
                                    Samurai.faith--;
                                    levelFaith.setText(String.valueOf(Samurai.faith));
                                }
                        else if(arcaneRadio.isSelected())
                                {
                                    levelInt--;
                                    levelWindow.setText(String.valueOf(levelInt));
                                    rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                                    Integer totalRunes = Integer.parseInt(rrOutputWindow.getText());
                                    runeTotalOutputWindow.setText(String.valueOf(totalRunes + Integer.parseInt(rrOutputWindow.getText())));
                                    System.out.println("Decrease Button Pressed");
                                    Samurai.arcane--;
                                    levelArcane.setText(String.valueOf(Samurai.arcane));
                                }
                        
                            //This is error handling done by **Nathan**    
                        else
                                {
                                        
                                    JFrame f;
                                    f =new JFrame();
                                    JOptionPane.showMessageDialog(f,"Please Select a Stat to decrease level.","Alert",JOptionPane.WARNING_MESSAGE);
                                    
                                }
            }});
               
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Here is the action = " + action);
        
                chooseTextField();
        switch (action) {
            case "Vigor":
                levelVigor.setEditable(false);
                break;
            case "Mind":
                levelMind.setEditable(false);
                break;
            case "Endurance":
                levelEndurance.setEditable(false);
                break;
            case "Strength":
                levelStrength.setEditable(false);
                break;
            case "Dexterity":
                levelDexterity.setEditable(false);
                break;
            case "Intelligence":
                levelIntelligence.setEditable(false);
                break;
            case "Faith":
                levelFaith.setEditable(false);
                break;
            case "Arcane":
                levelArcane.setEditable(false);
                break;
        }
        
    }
    
    
    
    
    //Handles which textlields are grayed out
    public void chooseTextField() {
       levelVigor.setEditable(false);
       levelMind.setEditable(false);
       levelEndurance.setEditable(false);
       levelStrength.setEditable(false);
       levelDexterity.setEditable(false);
       levelIntelligence.setEditable(false);
       levelFaith.setEditable(false);
       levelArcane.setEditable(false);
       
    
   } 
    
    
    
    
  

}