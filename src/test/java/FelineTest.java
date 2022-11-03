import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void testEatMeatIsWorking() throws Exception {
        Feline testFeline = new Feline();
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = testFeline.eatMeat();
        Assert.assertEquals("Ошибка, еда не та", expectedEatMeat, actualEatMeat);
    }

    @Test
    public void testGetFamilyIsWorking() throws Exception {
        Feline testFeline = new Feline();
        String expectedGetFamily = "Кошачьи";
        String actualGetFamily = testFeline.getFamily();
        Assert.assertEquals("Ошибка, не то семейство", expectedGetFamily, actualGetFamily);
    }

    @Test
    public void testGetKittensWithoutCountIsWorking() throws Exception {
        Feline testFeline = new Feline();
        int expectedGetKittensWithoutCount = 1;
        int actualGetKittensWithoutCount = testFeline.getKittens();
        Assert.assertEquals("Ошибка, не то число котят", expectedGetKittensWithoutCount, actualGetKittensWithoutCount);
    }

    @Test
    public void testGetKittensIsWithCountWorking() throws Exception {
        Feline testFeline = new Feline();
        int expectedGetKittensWithCount = 5;
        int actualGetKittensWithCount = testFeline.getKittens(5);
        Assert.assertEquals("Ошибка, не то число котят", expectedGetKittensWithCount, actualGetKittensWithCount);
    }
}