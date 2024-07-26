import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Feline feline = new Feline();

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Cat cat = new Cat(feline);
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }

    }






