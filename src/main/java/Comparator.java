import java.util.HashSet;
import java.util.List;

public class Comparator {
    public static List<String> compareBeforeRefactoring(List<String> whichCompared, List<String> base){
        base.removeAll(whichCompared);
        return base;
    }


    public static List<String> compareAfterRefactoring(List<String> whichCompared, List<String> base){
        base.removeAll(new HashSet<>(whichCompared));
        return base;
    }
}
