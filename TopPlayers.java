/* this program serves as a .class file for the driver.
mostly just an example to play around nodes and lists
in java. */

public class TopPlayers
{
   //constructor methods for node
   public class Node
   {
      int score;
      String name;
      Node next;
      Node(String value1, int value2, Node n)
      {
         name = value1;
         score = value2;
         next = n;
      }
      Node(String value1, int value2)
      {
         this(value1, value2, null);
      }
   }
   private Node first;
   private Node last;
   
   //empty constructor
   public TopPlayers() {
      first = null;
      last = null;
   }
   
   //checks if list is empty
   public boolean checkEmpty()
   {
      return first == null;
   }
   
   //method determines list size
   public int listSize()
   {
      int index = 0;
      Node s = first;
      while (s != null) {
         index++;
         s = s.next;
      }
      return index;
   }
   
   //method inserts values for the list from demo
   public void gamerInsert(String name, int score)
   {
      //creates new Node
      Node node = new Node(name, score);
      if (checkEmpty()) { //checks if list is empty
         first = node;
         first.next = last;
      }
      else if(first.score <= node.score) { // sorts the node score based on higher score
         node.next = first;
         first = node;
      }
      else {
         Node beforeNode = first; 
         while (beforeNode.score > node.score && beforeNode.next != null)
         {
            beforeNode = beforeNode.next;
         }
         node.next = beforeNode.next;
         beforeNode.next = node;
      }
      if (listSize() > 10) { //determines list size to be 10 (0-9)
         Node currentPtr = first;
         for (int i = 0; i < 9; i++) {
            currentPtr = currentPtr.next;
         }
         currentPtr.next = null;
      }
   }
   
   public void printList() { //method prints if called from demo
      Node t = first;
      int placer = 1; // number for top 10 players
      while (t != null){
         System.out.println(placer + ". " + t.name + " " + t.score + "");
         t = t.next;
         placer++;
      }
   }
}