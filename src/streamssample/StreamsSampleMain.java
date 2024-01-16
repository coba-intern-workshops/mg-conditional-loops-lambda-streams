package streamssample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsSampleMain {
    /*
    Strumienie (nie mylić ze strumieniami I/O) pozwalają na przetwarzanie danych (dane źródłowe) w nich zawartych w łatwy i szybki sposób.
Możemy je traktować jak wrappery na nasze źródło danych (kolekcja, tablica), na których możemy wykonywać operacje, które dzielimy na dwie kategorie:
 - operacje pośrednie (intermediate) np. filter, map, peek
 - operacje kończące (terminal), np. collect, forEach, findFirst
Operacje na streamach nie modyfikują danych źródłowych. W wyniku wykonania operacji pośredniej tworzony jest nowy stream.
     */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("jan", "michal", "ala", "alicja", "anastazja");
        names.stream()
                .filter(name -> name.length() > 4)
                .peek(name -> System.out.println(name))
                .map(name -> name.length())
                .forEach(nameLength -> System.out.println(nameLength));

    }


}
