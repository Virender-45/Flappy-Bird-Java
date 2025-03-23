import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;     //for storing pipes
import java.util.Random;        //For placing pipes at random place
import javax.swing.*;

public class FlappyBird extends JPanel{
    int boardWidth = 360;
    int boardHeight = 640;

    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.blue);

    }
}
