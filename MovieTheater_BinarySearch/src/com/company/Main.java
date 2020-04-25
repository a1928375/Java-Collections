package com.company;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 3, 6);
        theatre.getSeats();
        if(theatre.reserveSeat("A06")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("A06")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

//        System.out.println("--------------------------------------------------");
//
//        Theatre theatre1 = new Theatre("Olympian", 8, 12);
//        if(theatre1.reserveSeat1("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre1.reserveSeat1("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }


    }
}
