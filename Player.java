import java.lang.Math;

public class Player {
    private int playerID;
    private int score;
    private int dice1, dice2;
  public Player()
  {
   
  }
  public Player(int id) 
  { 
   // private int playerID = id;
   // private int score;
   // private int dice1, dice2; 
    playerID = id;
    score = 0;
    dice1 = 0;
    dice2 = 0;
  }
  public int getPlayerID()
  {
    return playerID;
  }
  
  public int getScore()
  {
    return score;
  }
  
  public void setScore(int sco)
  {
    score = sco;
  }
  
  public int getDice1()
  {
    return dice1;
  }
  
  public int getDice2()
  {
    return dice2;
  }
  
  public void roll()
  {
    dice1 =(int) Math.random() * 5 + 1;
    dice2 =(int) Math.random() * 5 + 1;
  }
  
  
 
}
