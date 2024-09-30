import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Map<Integer, Integer> snakes = new HashMap<>();
    snakes.put(17, 7);
    snakes.put(54, 34);
    snakes.put(62, 19);
    snakes.put(98, 79);

    Map<Integer, Integer> ladders = new HashMap<>();
    ladders.put(3, 22);
    ladders.put(6, 25);
    ladders.put(20, 29);
    ladders.put(57, 76);

    Board board = new Board(100, snakes, ladders);

    Queue<Player> players = new LinkedList<>();
    players.add(new Player("Player 1"));
    players.add(new Player("Player 2"));

    Dice dice = new Dice();
    Game game = new Game(board, dice, players);

    game.play();
  }
}
