package com.company.part_2;

import javax.swing.*;

public class DisplaySixNumbersPanel {
    public static void main(String[] args){
        JFrame w1 = new JFrame("Six Numbers Game");

        SixNumbersPanel myPanel = new SixNumbersPanel();
        w1.add(myPanel);
        w1.setSize(300, 300);
        w1.setVisible(true);
        w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
