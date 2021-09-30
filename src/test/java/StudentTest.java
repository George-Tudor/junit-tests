import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testCreateStudent() {
        Student george = new Student("George", 1L);
        Student bill = null;
        assertNull(bill);
        assertNotNull(george);
    }

    @Test
    public void testStudentFields() {
        Student george = new Student("George", 1L);

    }
}
