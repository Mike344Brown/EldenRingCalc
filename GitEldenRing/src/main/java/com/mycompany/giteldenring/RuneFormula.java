/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giteldenring;
import java.lang.Math;
/**
 *
 * Entire formula class created by **Nathan**
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
        public int base_RuneAmountToGetToLevelTwelve;
        public int total_levels= 713;
        public int total_runes;
        public int runesForLevelUp;
        public int current_level;
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


        }  
    public int nextLevelCalc(int current_level){
            runesForLevelUp = (int)((0.02*(Math.pow(current_level,3))) + (3.06*(Math.pow(current_level, 2)))
                    + (105.6*current_level) - 895);
            return runesForLevelUp;
    }
    public int totalRuneCalc(){
           
            for(int i = 1; i < total_levels; i++){
                int currentRuneValue = nextLevelCalc(i);
                if (currentRuneValue > 1) {
                        total_runes += currentRuneValue;

            }
            total_runes = total_runes + base_RuneAmountToGetToLevelTwelve;

        }
          return total_runes;   
    }
}
