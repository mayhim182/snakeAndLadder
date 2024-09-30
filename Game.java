import java.util.Queue;

public class Game {
  private Board board;
  private Dice dice;
  private Queue<Player> playerQueue;
  private int winningPosition;

  public Game(Board board, Dice dice, Queue<Player> playerQueue) {
    this.board = board;
    this.dice = dice;
    this.playerQueue = playerQueue;
    this.winningPosition = board.getSize();
  }

  public void play() {
    while (true) {
      Player currPlayer = playerQueue.poll();
      int diceRoll = dice.roll();
      int newPosition = currPlayer.getPosition()+diceRoll;
      if(newPosition>winningPosition) {
        playerQueue.offer(currPlayer);
      } else {
        newPosition = board.getNextPosition(newPosition);
        currPlayer.setPosition(newPosition);
        System.out.println(currPlayer.getName()+" moved to "+newPosition);
        if(newPosition == winningPosition) {
          System.out.println(currPlayer.getName()+" wins ");
          break ;
        }
        playerQueue.offer(currPlayer);
      }
    }
  }

}
