import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ExcelTest {

    @Test
    void writeSXSSFWorkbookArrOfArr() {
        List<String> list = Arrays.asList("test", "utuyt");
        Excel.writeSXSSFWorkbook("src/test/resources/writeTest.xlsx", list);
    }
}