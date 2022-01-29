import java.util.List;

public class Runner {
    public static void Run(String whichCompared, String base, String reportPath){
        System.out.println("start");
        List<String> baseList = CsvReader.readFile(0, base);
        System.out.println("read all base list - size " + baseList.size());
        List<String> whichComparedList = CsvReader.readFile(0, whichCompared);
        System.out.println("read all whichComparedList list - size " + whichComparedList.size());
        List<String> diff = Comparator.compareAfterRefactoring(whichComparedList, baseList);
        System.out.println("read all diff list - size " + diff.size());
        Excel.writeSXSSFWorkbook(reportPath, diff);
    }
}
