package Practice4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Program extends JFrame{
    private int Madrid = 0;
    private int Milan = 0;

    private JLabel score = new JLabel("Result: 0 X 0");
    private JLabel winner = new JLabel("Winner: DRAW");
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private JButton madrid = new JButton("Real Madrid");
    private JButton milan = new JButton("AC Milan");

    private void change(int milan, int madrid){
        Madrid += madrid;
        Milan += milan;

        score.setText("Result: " + Madrid + "X" + Milan);

        if (Milan > Madrid){
            winner.setText("Winner: AC Milan");
        } else if(Milan < Madrid){
            winner.setText("Winner: Real Madrid");
        }
        else {
            winner.setText("Winner: DRAW");
        }
        if (milan == 1){
            lastScorer.setText("Last Scocer: AC Milan");
        }
        else {
            lastScorer.setText("Last Scocer: Real Madrid");
        }
        winner.setForeground(Color.RED);

    }

    public Program(){
        super("Program");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   ///???
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                change(0,1);
            }
        });

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                change(1,0);
            }
        });


        setLayout(new BorderLayout());
        add(score, BorderLayout.CENTER);
        //score.setBackground(Color.PINK);
        add(winner, BorderLayout.NORTH);
        add(lastScorer, BorderLayout.SOUTH);
        add(madrid, BorderLayout.WEST);
        //madrid.setBackground(Color.RED);
        add(milan, BorderLayout.EAST);


    }

}
