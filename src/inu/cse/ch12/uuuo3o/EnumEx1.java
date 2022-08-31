package inu.cse.ch12.uuuo3o;

enum Directoin { EAST, SOUTH, WEST, NORTH }

public class EnumEx1 {
    public static void main(String[] args) {
        Directoin d1 = Directoin.EAST;
        Directoin d2 = Directoin.valueOf("WEST");
        Directoin d3 = Enum.valueOf(Directoin.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 ? " + (d1 == d2));
        System.out.println("d1 == d3 ? " + (d1 == d3));
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));

        switch (d1) {
            case EAST:
                System.out.println("The direction is EAST");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH");
                break;
            case WEST:
                System.out.println("The direction is WEST");
                break;
            case NORTH:
                System.out.println("The direction is NORTH");
                break;

            default:
                System.out.println("Invalid direction.");
                break;
        }

        Directoin[] dArr = Directoin.values();

        for (Directoin d : dArr)
            System.out.printf("%s = %d%n", d.name(), d.ordinal());

    }
}
