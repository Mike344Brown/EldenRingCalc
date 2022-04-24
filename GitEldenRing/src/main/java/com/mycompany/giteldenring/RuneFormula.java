/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eldenringcalculator;

/**
 *
 * @author chef
 */
public class RuneFormula {
    /**
     * Hero = 7
     * bandit =5 
     * astro =6 
     * warrior =8 
     * prisoner = 9 
     * confessor = 10
     * wretch = 1
     * vagabond = 9
     * prophet = 7
     * samurai = 9 
     */
    public double base_RuneAmountToGetToLevelTwelve;
    public double total_levels= 12;
    public double total_runes;
    public double runesForLevelUp;
 
    public RuneFormula(int base_level)
    {
        switch(base_level){
            case 1: 
                base_RuneAmountToGetToLevelTwelve = 7496;
                break;
            case 5 :
                base_RuneAmountToGetToLevelTwelve = 740 + 757 + 775 + 793 + 811 + 829;
            case 6: 
                base_RuneAmountToGetToLevelTwelve = 757 + 775 + 793 + 811 + 829;
                break;
            case 7: 
                base_RuneAmountToGetToLevelTwelve = 775 + 793 + 811 + 829;
                break;
            case 8 :
                base_RuneAmountToGetToLevelTwelve = 793 + 811 + 829;
            case 9: 
                base_RuneAmountToGetToLevelTwelve = 811 + 829;
                break;
            case 10: 
                base_RuneAmountToGetToLevelTwelve = 829;
                break;    
        }
            
           
        runesForLevelUp = ((0.02*(Math.pow(total_levels,3))) + (3.06*(Math.pow(total_levels, 2))) + (105.6*total_levels) - 895)+ base_RuneAmountToGetToLevelTwelve;
    }  
    public void totalRuneCalc(){
        total_runes = 0;
        for(int i = 1; i < level; i++){
            int value = nextLevelCalc(i);
            if (value > 0) {
                    totalRunes += value;
                    
        }
    }
}
