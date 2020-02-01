package exam;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static exam.Pizzas.*;

public class HelperTest {

    public HelperTest() {
    }

    @Test
    public void testGroupByMenu() {
        System.out.println("groupByMenu");
        List<Pizza> pizzas = Arrays.asList(MARGHERITA, TABASCO, AMORE);
        String expResult = "Vegetarian: Marrgherita 13\n"
                + "Spicy: Tabasco 22\n"
                + "Normal: Amore 16";

        // when
        Helper helper = new Helper();
        String result = helper.groupByMenu(pizzas);

        // then
        assertEquals(expResult, result);
    }

    @Test
    public void testGroupByMenuAll() {
        System.out.println("groupByMenu");
        List<Pizza> pizzas = Arrays.asList(MARGHERITA, CAPRI, HAVAI, CARUSO, MAMA_MIA, SOPRANO, CALABRESE, VEGETARIANA, CAPRESE, PASCETORE, FOUR_CHEESE, TABASCO, AMORE, FARMER);
        String expResult = "Vegetarian: Vegetariana 20, Pascetore 16, Caprese 19, Cztery sery 19, Marrgherita 13\n"
                + "Spicy: Soprano 23, Tabasco 22, Caruso 15\n"
                + "Normal: Capri 17, Amore 16, Farmerska 22, Havai 17, Calabrese 24, Mama Mia 18";

        // when
        Helper helper = new Helper();
        String result = helper.groupByMenu(pizzas);

        // then
        assertEquals(expResult, result);
    }

}
