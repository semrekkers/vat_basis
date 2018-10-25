package Domain;


import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class HexagonalPrismTest {
    @Test
    public void calculateVolume() throws Exception {
        HexagonalPrism hexagonalPrism = new HexagonalPrism(5.0, 12.0);
        assertEquals(hexagonalPrism.calculateVolume(), 779.4228634059948, 0.0000001);
    }
}
