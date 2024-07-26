import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Mock
    Feline feline;

    @Test
    public void testGetKittensWithCount() {
        int expectedKittens = 3;
        when(feline.getKittens(expectedKittens)).thenReturn(expectedKittens);
        int result = feline.getKittens(expectedKittens);

        assertEquals(expectedKittens, result);
        Mockito.verify(feline).getKittens(expectedKittens);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        System.out.println("Ожидаемое значение " + feline.getFamily());
        assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        System.out.println("Ожидаемое значение" + expectedFood);
        System.out.println("Фактическое значение" + actualFood);
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        System.out.println("Ожидаемое количество котят  " + feline.getKittens());
        assertEquals(1, feline.getKittens());
    }

}


