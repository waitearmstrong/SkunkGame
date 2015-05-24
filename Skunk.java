import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Skunk
{
  int skunk = 3;
  public boolean isSkunk(Player play)
  {
    if((play.getDice1() == skunk) || (play.getDice2() == skunk))
      return true;
    else
      return false;
  }
  public boolean isDoubleSkunk(Player play)
  {
    if((play.getDice1() == skunk) && (play.getDice2() == skunk))
      return true;
    else
      return false;
  }
    
  public static void main (String [] args)
  {
    int skunk = 3;
    int numPlayers;
    Scanner scan = new Scanner (System.in);
    
    System.out.println("How many Players do you have?");
    numPlayers = scan.nextInt();
    ArrayList<Player> table = new ArrayList<Player>();
    for(int i = 0; i < numPlayers; i++)
    {
      table.add(new Player(i));
    }
    
    
  }
}
      
    
    
    
    
    
