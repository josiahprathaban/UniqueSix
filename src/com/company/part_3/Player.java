package com.company.part_3;

import java.util.ArrayList;

public class Player {
    Die die = new Die();
    private int die_face_value;
    public String check_die_face_value(ArrayList<Integer> appeared_faces){
        if (appeared_faces.size()<6) {
            if(appeared_faces.contains(die_face_value))
                return "exists";
            else
                return "not_exists";
        }
        else
            return "stop_rolling";
    }

    public int get_die_face_value(){
        die_face_value = die.roll_the_die();
        return die_face_value;
    }
}
