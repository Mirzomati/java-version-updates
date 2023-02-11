package com.cydeo;

import java.util.ArrayList;
import java.util.Formattable;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> item = new ArrayList<Integer>(); // this is saying ArrayList only accepts objects that belong to integer class.
        item.add(1);
        item.add(2);
        item.add(3);
 //       item.add("apple");

        printDouble(item);


        System.out.println("#########################################################");

        FootballPlayer jim = new FootballPlayer("Jim");
        BaseballPlayer rocky = new BaseballPlayer("Rocky");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team<SoccerPlayer>giants = new Team("Giants");
    //    giants.addPlayer(jim);
    //    giants.addPlayer(rocky);
        giants.addPlayer(messi);

      ///  Team<String> brokenTeam = new Team<>("what kind of team is this");



    }


    private static void printDouble(ArrayList <Integer> item){
        for(Integer i : item){
            System.out.println( i * 2);
        }
    }



}
