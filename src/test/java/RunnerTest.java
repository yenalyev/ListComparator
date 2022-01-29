import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {

    @Test
    void run() {
        Runner.Run( "src/test/resources/test.csv", "src/test/resources/test_2.csv", "src/test/resources/res.xlsx");
    }
}