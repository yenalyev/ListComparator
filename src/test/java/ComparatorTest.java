import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class ComparatorTest {

    //performance test with big_file.csv - 100'000 rows

    @Test
    void bigFileTestAfterRefactoring() {
        List<String> base = CsvReader.readFile(0,"src/test/resources/big_file.csv");
        List<String> whichCompare = CsvReader.readFile(0,"src/test/resources/big_file.csv");
        long start = System.currentTimeMillis();
        List<String> comparison = Comparator.compareAfterRefactoring(whichCompare,base);
        long end = System.currentTimeMillis();
        long diff = end-start;
        System.out.println("Total time execution - " + diff);
        Assertions.assertEquals(comparison, new ArrayList<>());
    }

    @Test
    void bigFileTestBeforeRefactoring() {
        List<String> base = CsvReader.readFile(0,"src/test/resources/big_file.csv");
        List<String> whichCompare = CsvReader.readFile(0,"src/test/resources/big_file.csv");
        long start = System.currentTimeMillis();
        List<String> comparison = Comparator.compareBeforeRefactoring(whichCompare,base);
        long end = System.currentTimeMillis();
        long diff = end-start;
        System.out.println("Total time execution - " + diff);
        Assertions.assertEquals(comparison, new ArrayList<>());
    }

    //---------------------------------------------------------------------------------------------------------

    @Test
    void compareAfterRefactoring() {
        List<String> base = CsvReader.readFile(0,"src/test/resources/test.csv");
        List<String> whichCompare = CsvReader.readFile(0,"src/test/resources/test_2.csv");
        List<String> comparison = Comparator.compareAfterRefactoring(whichCompare,base);
        Assertions.assertEquals(Arrays.asList("4","5","6","7"), comparison);
    }

    @Test
    void compareAfterRefactoring_2() {
        List<String> base = CsvReader.readFile(0,"src/test/resources/test.csv");
        List<String> whichCompare = CsvReader.readFile(0,"src/test/resources/test_2.csv");
        List<String> comparison = Comparator.compareAfterRefactoring(base, whichCompare);
        Assertions.assertEquals(new ArrayList<>(), comparison);

    }


    @Test
    void compareBeforeRefactoring() {
        List<String> base = CsvReader.readFile(0,"src/test/resources/test.csv");
        List<String> whichCompare = CsvReader.readFile(0,"src/test/resources/test_2.csv");
        List<String> comparison = Comparator.compareBeforeRefactoring(whichCompare,base);
        Assertions.assertEquals(Arrays.asList("4","5","6","7"), comparison);
    }

    @Test
    void compareBeforeRefactoring_2() {
        List<String> base = CsvReader.readFile(0,"src/test/resources/test.csv");
        List<String> whichCompare = CsvReader.readFile(0,"src/test/resources/test_2.csv");
        List<String> comparison = Comparator.compareBeforeRefactoring(base, whichCompare);
        Assertions.assertEquals(new ArrayList<>(), comparison);
    }
}