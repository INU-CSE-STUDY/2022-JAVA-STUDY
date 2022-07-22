package inu.cse.ch12.hgyellow;

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus fare = " + Transportation1.BUS.fare(100));
        System.out.println("train fare = " + Transportation1.TRAIN.fare(100));
        System.out.println("ship fare = " + Transportation1.SHIP.fare(100));
        System.out.println("airplane fare = " + Transportation1.AIRPLANE.fare(100));
    }
}

enum Transportation1 {
    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(300) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE;

    Transportation1(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBasicFare() {
        return BASIC_FARE;
    }

    abstract int fare(int distance);
}
