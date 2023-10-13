import org.example.Geometry;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeometryTest {

    static Geometry geometry;

    @BeforeAll
    public static void setUp() {
        geometry = new Geometry();
    }

    @Test
    public void areaTest() {
        int length = 3;
        int height = 5;

        int expectedArea = length * height;
        int actualArea = geometry.area(length, height);

        assertEquals(expectedArea, actualArea);

        length = 5;
        height = 8;

        expectedArea = length * height;
        actualArea = geometry.area(length, height);

        assertEquals(expectedArea, actualArea);

        length = 2;
        height = 4;

        expectedArea = length * height;
        actualArea = geometry.area(length, height);

        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void perimeterTest() {
        int length = 3;
        int height = 5;

        int expectedPerimeter = 2 * (length + height);
        int actualPerimeter = geometry.perimeter(length, height);

        assertEquals(expectedPerimeter, actualPerimeter);

        length = 5;
        height = 8;

        expectedPerimeter = 2 * (length + height);
        actualPerimeter = geometry.perimeter(length, height);

        assertEquals(expectedPerimeter, actualPerimeter);

        length = 2;
        height = 4;

        expectedPerimeter = 2 * (length + height);
        actualPerimeter = geometry.perimeter(length, height);

        assertEquals(expectedPerimeter, actualPerimeter);
    }
}
