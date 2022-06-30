package inu.cse.ch07.hgyellow;

import java.awt.*;
import java.awt.event.ActionEvent;

public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler() {
                                public void actionPerformed(ActionEvent e) {
                                    System.out.println("ActionEvent occurred!!!");
                                }
                            }
        );
    }
}
