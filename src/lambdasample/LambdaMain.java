package lambdasample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaMain {
    /*
    Wyrażenie lambda umożliwia w prosty i przejrzysty sposób zaimplementować interfejs funkcyjny (dostarcza implementacji dla jedynej abstrakcyjnej metody).
            parameter -> expression or void method invocation
            (parameter1, parameter2) -> expression or void method invocation
            () -> expression or void method invocation
            (parameter) -> { code block }
	        (parameter1, parameter2) -> { code block }
	        () -> { code block }

    Wyrażenie lambda możemy traktować jak anonimową metodę (analogia do anonimowych klas) - metoda bez nazwy.

    */


    public static void main(String[] args) {
        List<String> names = Arrays.asList("michal", "robert", "jan");
//        findNamesWithAUsingClassicWay(names);
//        findNamesWithAUsingAnonymousClass(names);
//        findNamesUsingLambdaExpression(names);
        findNamesUsingStreams(names);
//        testFunctionInterface();
    }

    public static void findNamesWithAUsingClassicWay(List<String> names) {
        class NamesWithAFilter implements NamesFilter {

            @Override
            public boolean test(String name) {
                return name.contains("a");
            }
        }

        NamesFilter namesWithA = new NamesWithAFilter();
        NameService nameService = new NameService();
        System.out.println("Lista (findNamesWithAUsingClassicWay): " + nameService.findNames(names, namesWithA));
    }

    public static void findNamesWithAUsingAnonymousClass(List<String> names) {
        NameService nameService = new NameService();
        List<String> result = nameService.findNames(names, new NamesFilter() {
            @Override
            public boolean test(String name) {
                return name.contains("a");
            }
        });

        System.out.println("Lista (findNamesWithAUsingAnonymousClass): " + result);
    }

    public static void findNamesUsingLambdaExpression(List<String> names) {
        NameService nameService = new NameService();
        List<String> result = nameService.findNames(names, str -> str.contains("a"));
        System.out.println("Lista (findNamesUsingLambdaExpression): " + result);
    }

    public static void findNamesUsingStreams(List<String> names) {
        List<String> result = names.stream()
                .filter(name -> name.contains("a"))
                .collect(Collectors.toList());
        System.out.println("Lista (findNamesUsingStreams): " + result);
    }

    public static void testFunctionInterface() {
        Function<Integer, String> changeFunction = intValue -> {
            if (intValue < 10) {
                return "kwadrat";
            } else {
                return "trojkat";
            }
        };

        System.out.println(changeFunction.apply(11));
    }


}
