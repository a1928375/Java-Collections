package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java."));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building."));
        locations.put(2, new Location(2, "You are at the top of a hill."));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring."));
        locations.put(4, new Location(4, "You are in a valley beside a stream."));
        locations.put(5, new Location(5, "You are in the forest."));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        int loc = 1;

        while(true) {

            System.out.println(locations.get(loc).getDescription());

            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();

            System.out.print("Available exits are ");

            String exits_string = "";

            for(String exit: exits.keySet()) {
                exits_string = exits_string.concat(exit + ", ");
            }

            exits_string = exits_string.substring(0, exits_string.length()-2);             // deal with the extra comma

            System.out.println(exits_string);

            System.out.println("Please enter the direction you want: ");

            String direction = scanner.nextLine().toUpperCase();

            String temp = "";

            if (direction.contains("NORTH") || (direction.length() == 1 && direction.equals("N"))) {

                temp = "N";

            } else if (direction.contains("SOUTH") || (direction.length() == 1 && direction.equals("S"))){

                temp = "S";

            } else if (direction.contains("WEST") || (direction.length() == 1 && direction.equals("W"))){

                temp = "W";

            } else if (direction.contains("EAST") || (direction.length() == 1 && direction.equals("E"))){

                temp = "E";

            } else if (direction.contains("QUIT") || (direction.length() == 1 && direction.equals("Q"))){

                temp = "Q";
            }

            if(exits.containsKey(temp)) {

                loc = exits.get(temp);

            } else {

                System.out.println("You cannot go in that direction");
            }
        }

    }
}
