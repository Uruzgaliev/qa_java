import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

@RunWith(Parameterized.class)

public class LionTest {

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    private final String sex;
    private final boolean expectedHasMane;

    public LionTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Неверный пол", false}
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        try {
            Lion lion = new Lion(sex, new Feline());
            boolean actualHasMane = lion.doesHaveMane();
            assertEquals(expectedHasMane, actualHasMane);
        } catch (Exception e) {
            if (sex.equals("Неверный пол")) {
                assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
            } else {
                throw e;
            }
        }
    }

@Test
public void testGetFood() throws Exception {

    List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.eatMeat()).thenReturn(expectedFood);

    Lion lion = new Lion("Самец", feline);

    List<String> actualFood = lion.getFood();

    Mockito.verify(feline, Mockito.times(1)).eatMeat();
    assertEquals(expectedFood, actualFood);
}


    @Test
    public void testGetKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", feline);
        int kittens = lion.getKittens();

        Mockito.verify(feline, times(1)).getKittens();
        assertEquals(2, kittens);
    }

}

