package com.company.part_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class DisplaySixNumbersPanel {
    public static void main(String[] args){

        Timer timer = new Timer();
        JFrame w1 = new JFrame("Six Numbers Game");
        JPanel p1 = new JPanel();
        JLabel l2 = new JLabel();
        JButton play_again=new JButton("Play again");

        SixNumbersPanel2 myPanel = new SixNumbersPanel2();
        myPanel.setBorder(BorderFactory.createTitledBorder("player 1"));
        SixNumbersPanel2 myPanel1 = new SixNumbersPanel2();
        myPanel1.setBorder(BorderFactory.createTitledBorder("player 2"));

        p1.setLayout(new GridLayout(1, 2));
        p1.add(myPanel);p1.add(myPanel1);
        p1.setBounds(0,0,600,300);
        w1.add(p1);

        l2.setBounds(225, 305, 150, 20);
        w1.add(l2);

        play_again.setBounds(225,330, 150,30);
        w1.add(play_again);

        // update the count every seconds
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if((myPanel.count!=0) && (myPanel1.count!=0)) {
                    l2.setText((myPanel.count > myPanel1.count) ? "winner is player 2" : "winner is player 1");
                }
            }
        }, 0, 1000);

        // close the old window and create a new window to play again
        play_again.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                w1.setVisible(false);
                w1.dispose();
                main(args);
            }
        });


        w1.setSize(600, 400);
        w1.setLayout(null);
        w1.setVisible(true);
        w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
