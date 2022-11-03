import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Spy
    private Feline mockFeline;

    @Test
    public void testGetSoundIsWorking() throws Exception {
        Cat testCat = new Cat(mockFeline);
        String expectedGetSound = "Мяу";
        String actualGetSound = testCat.getSound();
        Assert.assertEquals("Ошибка, не тот звук", expectedGetSound, actualGetSound);
    }

    @Test
    public void testGetFoodIsWorking() throws Exception {
        Cat testCat = new Cat(mockFeline);
        List<String> expectedGetFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualGetFood = testCat.getFood();
        Assert.assertEquals("Ошибка, не та еда", expectedGetFood, actualGetFood);
    }
}