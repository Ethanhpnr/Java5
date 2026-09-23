import java.util.ArrayList;
import java.util.List;

public class TicTacToeObservable {
    private final List<IObserver> observers;
	private final int[][] board;
    private int turn = 1;

    public TicTacToeObservable() {
        observers = new ArrayList<>();
        board = new int[3][3];
    }

	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}

	public void makeMove(int x, int y) {
		if (x < 0 || x >= 3 || y < 0 || y >= 3 || board[x][y] != 0) {
			return;
		}

		board[x][y] = turn;
		turn = turn == 1 ? 2 : 1;
		notifyObservers();
	}

	public int[][] getBoard() {
		return board;
	}

	public int getTurn() {
		return turn;
	}
}
