import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class TicTacToeView extends JComponent implements IObserver {

    private final TicTacToeObservable observable;

    public TicTacToeView(int size, TicTacToeObservable observable, String title, int x, int y) {
        this.observable = observable;
        observable.registerObserver(this);

        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setContentPane(this);
        frame.setSize(size, size);
        frame.setLocation(x, y);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = e.getX() * 3 / getWidth();
                int j = e.getY() * 3 / getHeight();
                observable.makeMove(i, j);
            }
        });
    }

    @Override
    public void update() {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        drawGrid(g, getWidth(), getHeight());
        colorBoard(g, observable.getBoard());
    }

    private void drawGrid(Graphics g, int width, int height) {
        g.drawLine(width / 3, 0, width / 3, height);
        g.drawLine(width * 2 / 3, 0, width * 2 / 3, height);
        g.drawLine(0, height / 3, width, height / 3);
        g.drawLine(0, height * 2 / 3, width, height * 2 / 3);
    }

    private void colorBoard(Graphics g, int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) {
                    g.setColor(Color.RED);
                    colorBox(g, i, j);
                } else if (board[i][j] == 2) {
                    g.setColor(Color.BLUE);
                    colorBox(g, i, j);
                }
            }
        }
    }

    private void colorBox(Graphics g, int i, int j) {
        g.fillRect(getWidth() * i / 3, getHeight() * j / 3,
                getWidth() / 3, getHeight() / 3);
    }
}