package lambdasample;

import java.util.ArrayList;
import java.util.List;

public class NameService {

    public List<String> findNames(List<String> names, NamesFilter namesFilter) {
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (namesFilter.test(name)) {
                result.add(name);
            }
        }

        return result;
    }
}
