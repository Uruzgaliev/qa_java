import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Spy
    Feline feline;

    @Test
    public void testGetKittensWithCount() {
        int expectedKittens = 3;
        Mockito.when(feline.getKittens(expectedKittens)).thenReturn(expectedKittens);
        int result = feline.getKittens(expectedKittens);

        assertEquals(expectedKittens, result);
    }


    @Test
    public void testGetFamily() {
        System.out.println("Ожидаемое значение " + feline.getFamily());
        assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        System.out.println("Ожидаемое значение" + expectedFood);
        System.out.println("Фактическое значение" + actualFood);
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetKittens() {
        System.out.println("Ожидаемое количество котят  " + feline.getKittens());
        assertEquals(1, feline.getKittens());
    }

}


