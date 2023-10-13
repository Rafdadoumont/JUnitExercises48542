import org.example.Geometry;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({AnnotationTest.class,
                CalculatorTest.class,
                DigitTest.class,
                Ex2_Asserts.class,
                GeometryTest.class,
                StudentTest.class})
public class TestSuite {
}
