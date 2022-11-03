import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

@RunWith(Parameterized.class)
public class LionParamsTest {

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Spy
    private Feline mockFeline;

    private final String sex;
    private final boolean expectedHaveMane;

    public LionParamsTest(String sex, boolean expectedHaveMane) {
        this.sex = sex;
        this.expectedHaveMane = expectedHaveMane;
    }

    @Parameterized.Parameters
    public static Object[][] getCorrectHasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testHaveManeIsWorking() throws Exception {
        Lion testLion = new Lion(mockFeline, sex);
        boolean actualHaveMane = testLion.doesHaveMane();
        Assert.assertEquals("Пол не совпадает", expectedHaveMane, actualHaveMane);
    }
}