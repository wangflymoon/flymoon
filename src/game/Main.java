package game;

import javax.swing.*;

public class Main {
    public static void main(String[] args)throws Exception{
        JFrame frame=new JFrame();
        BirdGame game=new BirdGame();
        frame.add(game);
        frame.setSize(440,670);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        game.action();
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                