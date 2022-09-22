
/**
* A class which runs the Snap, Crackle , Pop game
* @author Shelly Fradkin
* @version 1.0
*/


public class SnapCracklePop{
   
   /**
   * Instance variables store the values entered by user for Snap, Crackle, and Pop
   */
   private int snap; 
   private int crackle; 
   private int pop;
      
   /**
   * Constructor sets private variables to values entered by user
   * @param snap stores value for snap
   * @param crackle stores value of crackle
   * @param pop stores value of pop
   */
    
   /*  The constructor takes in three ints,
   *  which must be assigned to their instance variables and initialized.
   */
 
   public SnapCracklePop(int snap, int crackle, int pop){
   
      this.snap = snap; 
      this.crackle = crackle;
      this.pop = pop;
    
   } 
   /**
   * Compares values of snap, crackle, and pop to current round and returns respective result
   * @param currentRound the current round of the game being executed
   * @return a String holding the result of the round
   */ 
 
   private String playRound(int currentRound){
      
      if((currentRound%snap == 0) && (currentRound%crackle == 0) && (currentRound%pop == 0)){
         return "snapcracklepop";
      }
      else if ((currentRound%snap == 0) && (currentRound%crackle == 0)){
         return "snapcrackle";
      }
      else if ((currentRound%snap == 0) && (currentRound%pop == 0)){
         return "snappop";
      }
      else if ((currentRound%pop == 0) && (currentRound%crackle == 0)){
         return "cracklepop";
      }
      else if (currentRound%snap == 0){
         return "snap";
      }
      else if (currentRound%crackle == 0){
         return "crackle";
      }
      else if (currentRound%pop == 0){
         return "pop";
      }
      else{
         return Integer.toString(currentRound);        
      }
   }
   /**
   * A loop which runs through the entered number of rounds and sets the results of the game
   * @param numRounds the amount of rounds the user wishes to play
   * @return A string with the results of the games
   */ 
   public String playGame(int numRounds){
   
      String gameResult = "";
   
      for(int i = 1; i <= numRounds; i++){
         gameResult = gameResult.concat("Round " + i + ": ");
         gameResult = gameResult.concat(playRound(i));
         gameResult = gameResult.concat("\n");
      }
      return gameResult; 
   }
   /**
   * Gets the value set for the snap variable
   * @return the snap value
   */
   public int getSnap(){
      return snap;
   }
   /**
   * Gets the value for the crackle variable
   * @return the value of crackle
   */  
   public int getCrackle(){
      return crackle;
   } 
    /**
   * Gets the value of for the pop variable
   * @return the value of pop
   */
   public int getPop(){
      return pop;
   }
}
//end class