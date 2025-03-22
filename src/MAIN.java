import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);  //Place window in centre
        frame.setResizable(false);  //User cannot resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Exit only when user click on close

    }
}
