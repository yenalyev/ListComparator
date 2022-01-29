import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvReaderTest {

    @Test
    void readFile() {
        System.out.println(CsvReader.readFile("src/test/resources/test.csv"));
    }

    @Test
    void readFile_1() {
        System.out.println(CsvReader.readFile(0,"src/test/resources/test.csv"));
    }
}