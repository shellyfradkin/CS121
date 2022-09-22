/**
* FileRelations is intended to be a simple search engine to find the most related text files possible
* @author Shelly Fradkin
* @version 1.0
*/

import java.io.*;

public class FileRelations{

   /**
   * a String holding the file name for the highest scoring file
   */
   private String topFile;
   /**
   * an int holding the score for the highest scoring file
   */
   private double topScore;
   /**
   * wordsToFind: a String array holding all the words to search for
   */
   private String[] wordsToFind;
   
   /**
   * This is the primary and only constructor for the FileRelations class.
   * @param toFind holds all the key words to search for
   */
   public FileRelations(String[] toFind){
      //TODO 1 Initialize instance variables
      wordsToFind = toFind;
      topScore = 0.0;
      topFile = "";
      
   }
   
   /**
   * Analyses the file based on the keywords and updates the top scoring file and score once done.
   * @param fileContent an array of Strings each representing a line in the original file
   * @param fileName the name of the file being analysed
   */ 
   public void analyseFile(String[] fileContent, String fileName){
      //TODO 4
      // Search the fileContent array to find the frequency of words in each line, using the scoreLine method 
      // Divide the score by the total number of lines
      // Compare to and possibly replace topScore
      // Assign the topFile to the file name with topScore if needed
      double score = 0.0;
      double count = 0.0;
      for(String curr : fileContent){
         count = count + scoreLine(curr);
      }
      
      score = count/fileContent.length;
      if((score>topScore) || (topScore==0)){
         
         topScore = score;
         topFile = fileName;
         
      }
   }
   
   /**
   * Analyses the line passed in and scores it based on frequency of the key words. A helper method for analyseFile.
   * @param line a String representing a single line in a file
   * @returns the score of the line passed in
   */ 
   private int scoreLine(String line){
      //TODO 3
      // Split the line into words
      // Score each word and sum those scores
      // Return the sums
      int sums = 0;
      String newWords[] = line.split(" ");
      for(String word : newWords){
         sums = sums + countWord(word);
      }
      return sums;
   }
   
   /**
   * Analyses the word passed in and scores it based on if it is one of the key words. A helper method for scoreLine.
   * @param word a String representing a single word in a file
   * @returns the score of the word passed in
   */ 
   private int countWord(String word){
      //TODO 2
      // Compare word to each of the wordsToFind and count the words
      // Return the result of the word comparison
      int res = 0;
      for(String i : wordsToFind){
         if(word.equalsIgnoreCase(i)){
            res++; 
            
         }
      }
      return res;
   }
   
   /**
   * A getter method for the key words used in this object's search
   * @returns a String array containing the key words to search for.
   */ 
   public String[] getWords(){
      //TODO 5
      return wordsToFind;
   }
   
   /**
   * A getter method for the top scoring file in the object currently
   * @returns a String representing the file name of the top scoring file.
   */ 
   public String getTopFile(){
      //TODO 6
      return topFile;
   }
   
   /**
   * A getter method for the score of the top scoring file in the object currently
   * @returns an int representing the score of the top scoring file.
   */ 
   public double getTopScore(){
      //TODO 7
      return topScore; 
   }
}