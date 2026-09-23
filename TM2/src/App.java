public class App {
    public static void main(String[] args){
        
        TicTacToeObservable observable = new TicTacToeObservable();
        new TicTacToeView(300, observable, "Player 1", 100, 100);
        new TicTacToeView(300, observable, "Player 2", 500, 100);
    }
}
