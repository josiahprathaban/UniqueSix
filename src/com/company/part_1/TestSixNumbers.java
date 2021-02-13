package com.company.part_1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class TestSixNumbers {

    public static void main(String[] args) {

	    TestSixNumbers testSixNumbers = new TestSixNumbers();
	    testSixNumbers.play_game();

    }

    public void play_game(){
        ArrayList<Integer> appeared_faces = new ArrayList<Integer>();
        AtomicInteger count_rolling = new AtomicInteger();
        Player player = new Player();
        while (true) {
            int die_face_value = player.get_die_face_value();
            String checked_result = player.check_die_face_value(appeared_faces);
            if (checked_result == "stop_rolling") {
                reporting(count_rolling);
                break;
            } else {
                if (checked_result == "not_exists")
                    appeared_faces.add(die_face_value);
                count_rolling.set(count_rolling.get() + 1);
                System.out.println("\nNumber rolled: " + die_face_value);
                System.out.print("So far, you have: ");
                appeared_faces.forEach(value -> System.out.print(value + " "));
            }
        }
    }
    public static void reporting(AtomicInteger count_rolling){
        System.out.println("\n\nCongratulations, you have taken " + count_rolling + " rolls to get onr of each number between 1 and 6");
    }
}
