package org.example.HW10_03;

public class TrafficLights {
    public static String updateLight(String current) {
//        if (current == "red") {
//            return "green";
//        } else if (current == "green") {
//            return "yellow";
//        } else
//
//            return "red";
        return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");

    }
}
