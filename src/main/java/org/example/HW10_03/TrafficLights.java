package org.example.HW10_03;

public class TrafficLights {
    public static String updateLight(String current) {
        // //#1
//        if (current == "red") {
//            return "green";
//        } else if (current == "green") {
//            return "yellow";
//        } else
//
//            return "red";
        // //#2
        //        if (current.equals("green")){
//            return "yellow";
//        }
//        else if (current.equals("yellow")){
//            return "red";
//        }
//        else return "green";

        // //#3
        return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");

    }
}
