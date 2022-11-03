import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Spy
    private Feline mockFeline;

    @Test
    public void testGetKittensIsWorking() throws Exception {
        Lion testLion = new Lion(mockFeline, "Самец");
        int expectedGetKittens = 1;
        int actualGetKittens = testLion.getKittens();
        Assert.assertEquals("Ошибка: количество котят не совпадает", expectedGetKittens, actualGetKittens);
    }

    @Test
    public void testGetFoodIsWorking() throws Exception {
        Lion testLion = new Lion(mockFeline, "Самец");
        List<String> expectedGetFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualGetFood = testLion.getFood();
        Assert.assertEquals("Ошибка: еда не та", expectedGetFood, actualGetFood);
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion testLion = new Lion(mockFeline, "Самец");
        boolean expectedDoesHaveMane = true;
        boolean actualDoesHaveMane = testLion.doesHaveMane();
        Assert.assertEquals("Ошибка: параметр гривы сломался", expectedDoesHaveMane, actualDoesHaveMane);
    }

    @Test
    public void testThrowsExceptionUnsupportedSex() {
        Exception exception = null;

        try {
            Lion testLion = new Lion(mockFeline, "");
        } catch (Exception ex) {
            exception = ex;
        }
        Assert.assertEquals("Не тот текст ошибки", "Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}