package com.company.part_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SixNumbersPanel extends JPanel{
    SixNumbersPanel() {

        TestSixNumbers testSixNumbers = new TestSixNumbers();

        JTextField dfv1, dfv2, dfv3, dfv4, dfv5, dfv6, dfvc;

        JLabel l1 = new JLabel("<html>A number between 1 to 6 will appear <br>once in each of the following text fields </html>");

        JTextArea report=new JTextArea();
        report.setEditable(false);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        dfv1=new JTextField(3);
        dfv1.setEditable(false);

        dfv2=new JTextField(3);
        dfv2.setEditable(false);

        dfv3=new JTextField(3);
        dfv3.setEditable(false);

        dfv4=new JTextField(3);
        dfv4.setEditable(false);

        dfv5=new JTextField(3);
        dfv5.setEditable(false);

        dfv6=new JTextField(3);
        dfv6.setEditable(false);

        dfvc=new JTextField(3);
        dfvc.setEditable(false);

        JButton roll=new JButton("Roll Die");
        roll.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String[] data = testSixNumbers.play_game();
                report.setText(data[0]);
                switch (data[1]){
                    case "1":
                        dfv1.setText(data[1]);
                        dfvc.setText(data[1]);

                        break;
                    case "2":
                        dfv2.setText(data[1]);
                        dfvc.setText(data[1]);
                        break;
                    case "3":
                        dfv3.setText(data[1]);
                        dfvc.setText(data[1]);
                        break;
                    case "4":
                        dfv4.setText(data[1]);
                        dfvc.setText(data[1]);
                        break;
                    case "5":
                        dfv5.setText(data[1]);
                        dfvc.setText(data[1]);
                        break;
                    case "6":
                        dfv6.setText(data[1]);
                        dfvc.setText(data[1]);
                        break;
                    default:
                        //report.setText(data[2]);
                        roll.setEnabled(false);
                }
            }
        });

        this.setBackground(Color.gray);

        l1.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(l1);

        panel1.add(dfv1);panel1.add(dfv2);panel1.add(dfv3);panel1.add(dfv4);panel1.add(dfv5);panel1.add(dfv6);
        panel1.setBackground(Color.gray);
        this.add(panel1);

        panel2.add(roll);panel2.add(dfvc);
        panel2.setBackground(Color.gray);
        this.add(panel2);

        report.setWrapStyleWord(true);
        report.setLineWrap(true);
        this.add(report);

        this.setLayout(new GridLayout(4,1));
    }
}
