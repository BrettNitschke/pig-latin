/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

/**
 *
 * @author brettnitschke
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
            PigLatinConverter aConverter = new PigLatinConverter();
        
        
            //constructs sentence out of individual words in command line
            String originalSentence = ""; 
            
            for (String arg : args) {
                originalSentence += arg;
                originalSentence += " ";
            }
           
            System.out.print(originalSentence + "------> ");
           
            
           //runs words one at a time through the pigLatinConverter
           for (String arg: args){
               System.out.print(aConverter.convert(arg) + " ");
               
           }
           System.out.println("");

        

    }
    
}
