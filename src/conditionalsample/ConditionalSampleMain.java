package conditionalsample;

public class ConditionalSampleMain {
    public static void main(String[] args) {
        int a = 3;

//        if (a < 50) {
//            System.out.println("wyrazenie prawdziwe");
//        } else if (a == 50) {
//            System.out.println("a ma wartosc 50");
//        } else {
//            System.out.println("falsz");
//        }
//
//        if (a < 20) System.out.println("a mniejsze od 20");
//        System.out.println("dodatkowo wyswietlamy to");
//        else if (a == 20) System.out.println("a ma wartosc 20");
//        else System.out.println("a jest wieksze niz 20");


        switch (a) {
            case 2:
            case 3:
            case 4:
                System.out.println("liczba z przedzialu 2-4");
                break;
            case 10:
                System.out.println("liczba 10");
                break;
            case 11:
                System.out.println("liczba 11");
                break;
            default:
                System.out.println("wqartosc domyslna");
        }

        a = 5;
        String result = switch (a) {
            case 2:
                yield "dwa";
            case 3:
                yield "trzy";
            case 4:
            case 5:
            case 6:
                yield "przedzial 4-6";

            default:
                yield "inna";
        };

        System.out.println("Wynik dzialania switch expression: " + result);

        result = switch (a) {
            case 2 -> "dwa";
            case 3 -> "trzy";
            case 4,5,6 -> "przedzial 4-6";
            default -> "inna";
        };

        System.out.println("wynik dzialania switch expression (alternatywna wersja): " + result);


    }
}
