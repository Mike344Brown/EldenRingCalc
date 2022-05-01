                                                                                                                                         /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giteldenring;
<<<<<<< Updated upstream
import java.awt.*;
=======
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
>>>>>>> Stashed changes
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
        JTextField levelWindow = new JTextField();
        JButton increase = new JButton("Increase");
        JButton decrease = new JButton("Decrease");
        Font segoeFont20 = new Font("Segoe UI", Font.BOLD, 20);
        Font segoeFont18 = new Font("Segoe UI", Font.BOLD, 18);
        Font segoeFont16 = new Font("Segoe UI", Font.BOLD, 16);
        Font segoeItalic12 = new Font("Segoe UI Semibold Italic", Font.PLAIN, 12);
        Font segoeFont12 = new Font("Segoe UI", Font.BOLD, 12);
        Font castellar26 = new Font("Castellar", Font.BOLD, 26);
        Font stencil24 = new Font("Stencil", Font.BOLD, 24);
        
        //Build Arrays for character names.
        String [] names = {"", "Samurai", "Prophet", "Warrior", "Hero", "Bandit", "Astrologer", "Prisoner", "Confessor", "Wretch", "Vagabond"};
        JComboBox classes = new JComboBox(names);
        JLabel currentLevelLabel = new JLabel("Level");
        JLabel selectClassToLevel = new JLabel("Class");
        JLabel runesRequiredForNextLevel = new JLabel("Next Level");
        JTextField rrOutputWindow = new JTextField();
        JLabel totalRunesSpent = new JLabel("Total Runes");
        JTextField runeTotalOutputWindow = new JTextField();
                
        JLabel title  = new JLabel("RUNE CALCULATOR");
        
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
        JPanel titleContainer = new JPanel();
        JPanel levelContainer = new JPanel();
        Dimension fieldSize = new Dimension(64, 31);
        Dimension centerArea = new Dimension(40, 300);
        Dimension conboBoxDimension = new Dimension(52, 22);
        Dimension buttonDimension = new Dimension(55, 22);
        
        
        
        //level int
        public int levelInt = 12;
        
        //Instantiate new rune formula object
        RuneFormula formula = new RuneFormula(levelInt);
        
        //Constructor for boxLayout button panel
        public FrontEnd(){
            
            //Left Side Panel containing current level text window, inc dec buttons, and the combobox and cb label.
            inc_dec_panel_left.setLayout(new BoxLayout(inc_dec_panel_left,BoxLayout.PAGE_AXIS));
<<<<<<< Updated upstream
            
=======
            increase.setBackground(Color.GREEN);
            decrease.setBackground(Color.RED);
            inc_dec_panel_left.add(currentLevel);
            inc_dec_panel_left.add(levelWindow);
            inc_dec_panel_left.add(Box.createVerticalStrut(30));
            inc_dec_panel_left.add(increase);
            inc_dec_panel_left.add(decrease);
            inc_dec_panel_left.add(Box.createVerticalStrut(30));
>>>>>>> Stashed changes
            inc_dec_panel_left.add(selectClassToLevel);
            inc_dec_panel_left.add(classes);
            inc_dec_panel_left.add(Box.createVerticalStrut(20));

            inc_dec_panel_left.add(increase); 
            inc_dec_panel_left.add(Box.createVerticalStrut(20));
            inc_dec_panel_left.add(decrease);
            inc_dec_panel_left.add(Box.createVerticalStrut(40));
            inc_dec_panel_left.add(runesRequiredForNextLevel);
            inc_dec_panel_left.add(rrOutputWindow);
            rrOutputWindow.setEditable(false);
            inc_dec_panel_left.add(totalRunesSpent);
            inc_dec_panel_left.add(runeTotalOutputWindow);
            
            inc_dec_panel_center.add(Box.createRigidArea(centerArea));
            inc_dec_panel_left.setAlignmentX(Component.LEFT_ALIGNMENT);

            levelContainer.setLayout(new BoxLayout(levelContainer,BoxLayout.PAGE_AXIS));
            levelContainer.add(Box.createVerticalStrut(20));
            levelContainer.add(currentLevelLabel);
            levelContainer.add(levelWindow);
//            inc_dec_panel_left.add(currentLevelLabel);
//            inc_dec_panel_left.add(levelWindow);
            
             
            //Set font options
            selectClassToLevel.setFont(segoeFont12);
            runesRequiredForNextLevel.setFont(segoeFont12);
            totalRunesSpent.setFont(segoeFont12);
//            currentLevelLabel.setFont(new Font("Courier", Font.BOLD, 14));
            
            //Sizing JTextfields ***Marvin***
            levelVigor.setPreferredSize(fieldSize);
            levelMind.setPreferredSize(fieldSize);
            levelEndurance.setPreferredSize(fieldSize);
            levelStrength.setPreferredSize(fieldSize);
            levelDexterity.setPreferredSize(fieldSize);
            levelIntelligence.setPreferredSize(fieldSize);
            levelFaith.setPreferredSize(fieldSize);
            levelArcane.setPreferredSize(fieldSize);
            
            //Adding font to JTextfields ***Marvin***
            levelVigor.setFont(segoeFont18);
            levelMind.setFont(segoeFont18);
            levelEndurance.setFont(segoeFont18);
            levelStrength.setFont(segoeFont18);
            levelDexterity.setFont(segoeFont18);
            levelIntelligence.setFont(segoeFont18);
            levelFaith.setFont(segoeFont18);
            levelArcane.setFont(segoeFont18);
            
            title.setFont(castellar26);
            currentLevelLabel.setFont(castellar26);
            levelWindow.setFont(stencil24);
            increase.setFont(segoeItalic12);
            decrease.setFont(segoeItalic12);
            levelWindow.setForeground(Color.red);
            increase.setForeground(new java.awt.Color(0, 153, 0));
            decrease.setForeground(Color.RED);

            //Add Radio Button font ***Marvin***
            vigorRadio.setFont(segoeFont20);
            mindRadio.setFont(segoeFont20);
            enduranceRadio.setFont(segoeFont20);
            strengthRadio.setFont(segoeFont20);
            dexterityRadio.setFont(segoeFont20);
            intelligenceRadio.setFont(segoeFont20);
            faithRadio.setFont(segoeFont20);
            arcaneRadio.setFont(segoeFont20);
            
            //Text Alignment ***Marvin***
            levelVigor.setHorizontalAlignment(JTextField.CENTER);
            levelMind.setHorizontalAlignment(JTextField.CENTER);
            levelEndurance.setHorizontalAlignment(JTextField.CENTER);
            levelStrength.setHorizontalAlignment(JTextField.CENTER);
            levelDexterity.setHorizontalAlignment(JTextField.CENTER);
            levelIntelligence.setHorizontalAlignment(JTextField.CENTER);
            levelFaith.setHorizontalAlignment(JTextField.CENTER);
            levelArcane.setHorizontalAlignment(JTextField.CENTER);
            selectClassToLevel.setHorizontalAlignment(JTextField.CENTER);
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
            
            increase.setAlignmentX(Component.LEFT_ALIGNMENT);
            decrease.setAlignmentX(Component.LEFT_ALIGNMENT);
            selectClassToLevel.setAlignmentX(Component.LEFT_ALIGNMENT);
            selectClassToLevel.setMaximumSize(conboBoxDimension);
            runesRequiredForNextLevel.setAlignmentX(Component.LEFT_ALIGNMENT);
            totalRunesSpent.setAlignmentX(Component.LEFT_ALIGNMENT);

            
//            //Sizing boxex
//            classes.setPreferredSize(conboBoxDimension);
//            rrOutputWindow.setPreferredSize(conboBoxDimension);
//            runeTotalOutputWindow.setPreferredSize(conboBoxDimension);
//            runesRequiredForNextLevel.setPreferredSize(conboBoxDimension);
//            selectClassToLevel.setPreferredSize(conboBoxDimension);
////            increase.setMaximumSize(buttonDimension);
////            decrease.setMaximumSize(buttonDimension);
//////            increase.setMinimumSize(buttonDimension);
//////            decrease.setMinimumSize(buttonDimension);
            
            
            //Title container
            titleContainer.add(title);
            
            //Vigor stat elements panels:
            vigorStatContainer.setLayout(new BoxLayout(vigorStatContainer,BoxLayout.LINE_AXIS));
<<<<<<< Updated upstream
//            vigorStatLabel.setFont(new Font("Courier", Font.BOLD, 50));
//            vigorStatContainer.add(Box.createHorizontalGlue());
//            vigorStatContainer.add(levelVigor);
//            vigorStatContainer.add(Box.createHorizontalStrut(60));
=======
            vigorStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
            vigorStatContainer.add(Box.createHorizontalStrut(20));
//            vigorStatContainer.add(vigorStatLabel);
            vigorStatContainer.add(levelVigor);
>>>>>>> Stashed changes
            vigorStatContainer.add(vigorRadio);
//            vigorStatContainer.add(vigorStatLabel);
//            vigorStatContainer.add(Box.createHorizontalStrut(20));
            System.out.println(levelVigor.getBounds());
            
            //Mind stat elements panels:
            mindStatContainer.setLayout(new BoxLayout(mindStatContainer,BoxLayout.LINE_AXIS));
//            mindStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
//            mindStatContainer.add(mindStatLabel);
<<<<<<< Updated upstream
//            mindStatContainer.add(levelMind);
//            mindStatContainer.add(Box.createHorizontalStrut(60));
=======
            mindStatContainer.add(Box.createHorizontalStrut(20));
            mindStatContainer.add(levelMind);
>>>>>>> Stashed changes
            mindStatContainer.add(mindRadio);
//            mindStatContainer.add(Box.createHorizontalGlue());
//            mindStatContainer.add(Box.createHorizontalStrut(13));
            
            //Endurance stat elements panels:
            enduranceStatContainer.setLayout(new BoxLayout(enduranceStatContainer,BoxLayout.LINE_AXIS));
//            enduranceStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
//            enduranceStatContainer.add(enduranceStatLabel);
<<<<<<< Updated upstream
//            enduranceStatContainer.add(levelEndurance);
//            enduranceStatContainer.add(Box.createHorizontalStrut(12));
=======
            enduranceStatContainer.add(Box.createHorizontalStrut(20));
            enduranceStatContainer.add(levelEndurance);
>>>>>>> Stashed changes
            enduranceStatContainer.add(enduranceRadio);
//            enduranceStatContainer.add(Box.createHorizontalStrut(1));
            
            //Strength stat elements panels:
            strengthStatContainer.setLayout(new BoxLayout(strengthStatContainer,BoxLayout.LINE_AXIS));
//            strengthStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
//            strengthStatContainer.add(strengthStatLabel);
//            strengthStatContainer.add(levelStrength);
//            strengthStatContainer.add(Box.createHorizontalStrut(20));
            strengthStatContainer.add(strengthRadio);
            
            //Dexterity stat elements panels:
            dexterityStatContainer.setLayout(new BoxLayout(dexterityStatContainer,BoxLayout.LINE_AXIS));
//            dexterityStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
//            dexterityStatContainer.add(dexterityStatLabel);
            dexterityStatContainer.add(levelDexterity);
//            dexterityStatContainer.add(Box.createHorizontalStrut(20));
            dexterityStatContainer.add(dexterityRadio);
            
            //Intelligence stat elements panels:
            intelligenceStatContainer.setLayout(new BoxLayout(intelligenceStatContainer,BoxLayout.LINE_AXIS));
//            intelligenceStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
//            intelligenceStatContainer.add(intelligenceStatLabel);
//            intelligenceStatContainer.add(levelIntelligence);
//            intelligenceStatContainer.add(Box.createHorizontalStrut(20));
            intelligenceStatContainer.add(intelligenceRadio);
            
            //Faith stat elements panels:
            faithStatContainer.setLayout(new BoxLayout(faithStatContainer,BoxLayout.LINE_AXIS));
//            faithStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
//            faithStatContainer.add(faithStatLabel);
//            faithStatContainer.add(levelFaith);
//            faithStatContainer.add(Box.createHorizontalStrut(20));
            faithStatContainer.add(faithRadio);
            
            //Arcane stat elements panels:
            arcaneStatContainer.setLayout(new BoxLayout(arcaneStatContainer,BoxLayout.LINE_AXIS));
//            arcaneStatLabel.setFont(new Font("Courier", Font.BOLD, 20));
//            arcaneStatContainer.add(arcaneStatLabel);
//            arcaneStatContainer.add(levelArcane);
//            arcaneStatContainer.add(Box.createHorizontalStrut(20));
            arcaneStatContainer.add(arcaneRadio);
            
            //Create stat level container ***Marvin***
            statLevelContainer.setLayout(new BoxLayout(statLevelContainer, BoxLayout.PAGE_AXIS));
            statLevelContainer.add(levelVigor);
            statLevelContainer.add(Box.createVerticalStrut(14));
            statLevelContainer.add(levelMind);
            statLevelContainer.add(Box.createVerticalStrut(14));
            statLevelContainer.add(levelEndurance);
            statLevelContainer.add(Box.createVerticalStrut(14));
            statLevelContainer.add(levelStrength);
            statLevelContainer.add(Box.createVerticalStrut(14));
            statLevelContainer.add(levelDexterity);
            statLevelContainer.add(Box.createVerticalStrut(14));
            statLevelContainer.add(levelIntelligence);
            statLevelContainer.add(Box.createVerticalStrut(14));
            statLevelContainer.add(levelFaith);
            statLevelContainer.add(Box.createVerticalStrut(14));
            statLevelContainer.add(levelArcane);
            
            
            
            
            
            
            
            //Add Stat elements to a vertically oriented container
            radioButtonContainer.setLayout(new BoxLayout(radioButtonContainer,BoxLayout.Y_AXIS));
            System.out.println(radioButtonContainer.getPreferredSize());
            System.out.println(radioButtonContainer.getAlignmentY());
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
            container.add(titleContainer, BorderLayout.NORTH);
            container.add(inc_dec_panel_left, BorderLayout.WEST);
            container.add(inc_dec_panel_center, BorderLayout.CENTER);
            container.add(statLevelContainer, BorderLayout.EAST); 
            container.add(radioButtonContainer, BorderLayout.EAST);
            container.add(levelContainer, BorderLayout.SOUTH);
            
          
            //Add container to frame
            int width = 450;
            int height = 550;
            int x = (int) ((layer_1_container.getWidth())/2 + 300);
            int y = (int) ((layer_1_container.getHeight())/2 +100);

            layer_1_container.pack();
            Dimension alteredScreenSize = new Dimension(width, height);
            layer_1_container.setLocation(x,y);
            layer_1_container.setSize(alteredScreenSize);
            layer_1_container.setResizable(false); 
            layer_1_container.add(container);
            layer_1_container.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            
            layer_1_container.setSize(width, height);
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
            
            //Set initial values
            levelVigor.setText(String.valueOf(Samurai.vigor));
            levelMind.setText(String.valueOf(Samurai.mind));
            levelEndurance.setText(String.valueOf(Samurai.endurance));
            levelStrength.setText(String.valueOf(Samurai.strength));
            levelDexterity.setText(String.valueOf(Samurai.dexterity));
            levelIntelligence.setText(String.valueOf(Samurai.intelligence));
            levelFaith.setText(String.valueOf(Samurai.faith));
            levelArcane.setText(String.valueOf(Samurai.arcane));
            
            
            //Add ComboBox Listener
            classes.addActionListener((ActionEvent e) -> {
                //This line of code grabs the combo box selection to pass to the switch statement
                String comboBoxSelection = classes.getSelectedItem().toString();
                
                //This Switch statement passes all of the stat values into the text selection windows    
                switch (comboBoxSelection) {
                    case "Samurai":
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
            levelWindow.setText(String.valueOf(12));
            //Add Button Press Event Listener
            increase.addActionListener((ActionEvent e) -> {
                levelInt++;
                levelWindow.setText(String.valueOf(levelInt));
                rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                Double totalRunes = Double.parseDouble(rrOutputWindow.getText());
                runeTotalOutputWindow.setText(String.valueOf(totalRunes + Double.parseDouble(rrOutputWindow.getText())));
                System.out.println("Increase Button Pressed");
                if(vigorRadio.isSelected())
                        {
                            Samurai.vigor++;
                            levelVigor.setText(String.valueOf(Samurai.vigor));

                        }
                else if(mindRadio.isSelected())
                        {
                            Samurai.mind++;
                            levelMind.setText(String.valueOf(Samurai.mind));
                        }
                else if(enduranceRadio.isSelected())
                        {
                            Samurai.endurance++;
                            levelEndurance.setText(String.valueOf(Samurai.endurance));
                        }
                else if(strengthRadio.isSelected())
                        {
                            Samurai.strength++;
                            levelStrength.setText(String.valueOf(Samurai.strength));
                        }
                else if(dexterityRadio.isSelected())
                        {
                            Samurai.dexterity++;
                            levelDexterity.setText(String.valueOf(Samurai.dexterity));
                        }
                else if(intelligenceRadio.isSelected())
                        {
                            Samurai.intelligence++;
                            levelIntelligence.setText(String.valueOf(Samurai.intelligence));
                        }
                else if(faithRadio.isSelected())
                        {
                            Samurai.faith++;
                            levelFaith.setText(String.valueOf(Samurai.faith));
                        }
                else if(arcaneRadio.isSelected())
                        {
                            Samurai.arcane++;
                            levelArcane.setText(String.valueOf(Samurai.arcane));
                        }

                });
            
            decrease.addActionListener((ActionEvent e) -> {
                levelInt--;
                levelWindow.setText(String.valueOf(levelInt));
                rrOutputWindow.setText(String.valueOf(formula.nextLevelCalc(levelInt)));
                Double totalRunes = Double.parseDouble(rrOutputWindow.getText());
                runeTotalOutputWindow.setText(String.valueOf(totalRunes + Double.parseDouble(rrOutputWindow.getText())));
                System.out.println("Decrease Button Pressed");
                if(vigorRadio.isSelected())
                        {
                            Samurai.vigor--;
                            levelVigor.setText(String.valueOf(Samurai.vigor));
                        }
                else if(mindRadio.isSelected())
                        {
                            Samurai.mind--;
                            levelMind.setText(String.valueOf(Samurai.mind));
                        }
                else if(enduranceRadio.isSelected())
                        {
                            Samurai.endurance--;
                            levelEndurance.setText(String.valueOf(Samurai.endurance));
                        }
                else if(strengthRadio.isSelected())
                        {
                            Samurai.strength--;
                            levelStrength.setText(String.valueOf(Samurai.strength));
                        }
                else if(dexterityRadio.isSelected())
                        {
                            Samurai.dexterity--;
                            levelDexterity.setText(String.valueOf(Samurai.dexterity));
                        }
                else if(intelligenceRadio.isSelected())
                        {
                            Samurai.intelligence--;
                            levelIntelligence.setText(String.valueOf(Samurai.intelligence));
                        }
                else if(faithRadio.isSelected())
                        {
                            Samurai.faith--;
                            levelFaith.setText(String.valueOf(Samurai.faith));
                        }
                else if(arcaneRadio.isSelected())
                        {
                            Samurai.arcane--;
                            levelArcane.setText(String.valueOf(Samurai.arcane));
                        }
                });
      
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
