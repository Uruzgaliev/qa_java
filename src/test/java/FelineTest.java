import com.example.Feline;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;



public class FelineTest {


    Feline feline = new Feline();

    @Test
    public void testGetKittensWithCount() {
        int expectedKittens = 3;
        int actualKittens = feline.getKittens(3);
        assertEquals(expectedKittens, actualKittens);
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
        System.out.println("Количество котят  " + feline.getKittens());
        assertEquals(1, feline.getKittens());
    }

}


