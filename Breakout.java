import javax.swing.JFrame;
import ssn.cse.brick.*;
public class Breakout {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        //Gameplay class contains the logical functioning of the game
        GamePlay gameplay = new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
    
}