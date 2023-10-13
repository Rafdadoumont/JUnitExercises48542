import org.example.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student bryan;
    private Student stewie;

    @BeforeAll
    public static void onceExecutedBeforeAll() {
        System.out.println("Test Student Class");
    }

    @BeforeEach
    public void setup() {
        bryan = new Student(1L, "Bryan");
        bryan.addGrade(100);
        bryan.addGrade(80);

    }

    @DisplayName ("Check data in Student object")
    @Test
    public void testCreateStudent() {
        assertNull(stewie);
        assertNotNull(bryan);
    }

    @Disabled
    @Test public void testStudentFields() {
        assertSame(1L, bryan.getId());
        assertSame("bryan", bryan.getName());
        assertSame(2 , bryan.getGrades().size());
    }

    @Test
    public void testAddGrade () {
        assertSame (100, bryan.getGrades().get(0));
        assertSame (80, bryan.getGrades().get(1));
    }

    @Test
    public void testAverageGrade () {
        assertEquals (90, bryan.getGradeAverage(), 0);
    }
}
