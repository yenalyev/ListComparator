import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Comparator {
    public static List<String> compareBeforeRefactor(List<String> whichCompared, List<String> base){
        base.removeAll(whichCompared);
        return base;
    }


    public static List<String> compareAfterRefactoring(List<String> whichCompared, List<String> base){

        Set<String> b = new HashSet<>(base);
        return whichCompared
                .stream()
                .filter(a -> !b.contains(a))
                .collect(Collectors.toList());
    }
}
