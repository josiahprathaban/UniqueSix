package com.company.part_3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class TestSixNumbers {
    ArrayList<Integer> appeared_faces = new ArrayList<Integer>();
    AtomicInteger count_rolling = new AtomicInteger();
    Player player = new Player();

    public String[] play_game(){

            int die_face_value = player.get_die_face_value();
            String checked_result = player.check_die_face_value(appeared_faces);
            if (checked_result == "stop_rolling") {
                return new String[]{reporting(count_rolling),"0",String.valueOf(count_rolling)};
            } else {
                if (checked_result == "not_exists") {
                    appeared_faces.add(die_face_value);
                }
                count_rolling.set(count_rolling.get() + 1);
                return new String[]{"No of rolls: "+String.valueOf(count_rolling),String.valueOf(die_face_value)};
            }

    }
    public static String reporting(AtomicInteger count_rolling){
        return "Congratulations, you have taken " + count_rolling + " rolls to get onr of each number between 1 and 6";
    }
}
