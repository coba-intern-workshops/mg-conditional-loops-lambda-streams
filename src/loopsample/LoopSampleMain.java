package loopsample;

import java.util.Arrays;
import java.util.List;

public class LoopSampleMain {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        List<String> names = Arrays.asList("michal", "jan");
        for(String name : names) {
            System.out.println(name);
        }

        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }

        System.out.println("------------------------------");
        a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 10);


    }
}
