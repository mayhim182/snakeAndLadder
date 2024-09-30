import java.util.HashMap;
import java.util.Map;

public class Board {
  private int size; //0 to 100 default
  private Map<Integer, Integer> snakes;
  private Map<Integer, Integer> ladder;

  public Board() {
    this.size = 100; //default;
    snakes = new HashMap<>();
    ladder = new HashMap<>();
  }

  public Board(int size, Map<Integer, Integer> snake, Map<Integer, Integer> ladder) {
    this.size = size;
    this.snakes = snake;
    this.ladder = ladder;
  }

  int getSize() {
    return this.size;
  }

  public int getNextPosition(int currPosition) {
    if (snakes.containsKey(currPosition)) return snakes.get(currPosition);
    if (snakes.containsKey(currPosition)) return snakes.get(currPosition);
    return currPosition;
  }



}
