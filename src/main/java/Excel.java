import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Excel {
    public static void writeSXSSFWorkbook(String pathToSave, List<String> inputData){
        SXSSFWorkbook wb = new SXSSFWorkbook(1000);
        try {
            Sheet sheet = wb.createSheet("Test_results" );
            for (int rows = 0; rows < inputData.size(); rows++){
                Row currentRow = sheet.createRow(rows);
                currentRow.createCell(0).setCellValue(inputData.get(rows));
            }
        }finally {
            FileOutputStream out = null;
            try {
                out = new FileOutputStream(pathToSave);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                wb.write(out);
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
