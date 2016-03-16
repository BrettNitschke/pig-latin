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
public class PigLatinConverter {
    
    
    public String convert(String wordToBeConverted){
        
        String finishedWord = "";
        final String  vowels = "aieou";
        int splice = 0; //point in word to cut
        
        boolean capitalize = isFirstLetterCap(wordToBeConverted);
        
        wordToBeConverted = wordToBeConverted.toLowerCase();
        
        String lettersBeforeVowel = "";
        
        
        //collects all the letters before the first vowel, leaves splice at point of first vowel
        while (splice < wordToBeConverted.length() && !vowels.contains("" + wordToBeConverted.charAt(splice)))
        {
            lettersBeforeVowel += wordToBeConverted.charAt(splice);
            splice ++;
        }
        if (splice == 0) //vowel is first letter of word
        {
            wordToBeConverted += "w";
        }
        
        finishedWord = wordToBeConverted.substring(splice) + lettersBeforeVowel + "ay";
        
        
      
            
        
        //capitalize first letter of word if necessary
        if (capitalize == true) {
            char c[] = finishedWord.toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            finishedWord = new String(c);
        } 
        
        return finishedWord;
    }


//This function checks if the first letter is capitalized
//if so, the returned word's first letter should be capitalized
public boolean isFirstLetterCap(String word){
    if (Character.isUpperCase(word.charAt(0))) {
            return true;
        } 
    else return false;
   }


}