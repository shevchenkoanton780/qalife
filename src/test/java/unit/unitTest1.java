package unit;

import common.Utility;
import org.testng.annotations.Test;

public class unitTest1 {
    @Test
    public void FormatToCurrency() {
        Utility.toCurrency(123);
        Utility.toCurrency(123.45);
        Utility.toCurrency(12345.67);
    }
}
