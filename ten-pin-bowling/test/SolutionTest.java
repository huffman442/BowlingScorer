import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void BasicTests() {
        // assertEquals("expected", "actual");

        Solution s = new Solution();
        assertEquals("No spares no strikes equalling 20", 20, s.bowlingScore("11 11 11 11 11 11 11 11 11 11"));
        assertEquals("Combined spares and strikes equaling 202", 202, s.bowlingScore("X 8/ 9/ 80 X X 9/ 9/ X X9/"));
        assertEquals("All strikes resulting in 300", 300, s.bowlingScore("X X X X X X X X X XXX"));
    }
}