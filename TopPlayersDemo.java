/*this driver program inserts values in 
the list of the .class file and sorts them
in order from highest to lowest scores. */

public class TopPlayersDemo 
{
   public static void main(String[] args) 
   {
      TopPlayers list = new TopPlayers();
      
      //inserts scores at random order
      list.gamerInsert("Bob", 70);
      list.gamerInsert("Chris", 23);
      list.gamerInsert("John", 65);
      list.gamerInsert("Marc", 46);
      list.gamerInsert("Sam", 89);
      list.gamerInsert("Jane", 87);
      list.gamerInsert("Sally",100);
      list.gamerInsert("Jack", 82);
      list.gamerInsert("Wally", 93);
      list.gamerInsert("George", 11);
      list.gamerInsert("Mario", 34);
      list.gamerInsert("Vanica", 24);
   
      System.out.println("Top 10 Scores: ");
      list.printList(); //prints out scores from highest to lowest
   }
}