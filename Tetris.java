/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tetris;

/**
 *
 * @author MichelleWang
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import javax.swing.*; 
/**
 *
 * @author MichelleWang
 */

public class Tetris extends JFrame{//inheriting JFrame  
   JLabel score;


    public Tetris() {

        score = new JLabel(" 0");
        add(score, BorderLayout.NORTH);
        Board board = new Board(this);
        add(board);
        board.start();

        setSize(200,400);
        setTitle("俄罗斯方块");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public JLabel getScore() {
       return score;
   }

    public static void main(String[] args) {

        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    }  
 }
    



