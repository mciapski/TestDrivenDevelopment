import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ShoppingBasketTest {

  @Test
  public void totalOfEmptyBasket() {
    ShoppingBasket shoppingBasket = new ShoppingBasket();
    assertEquals(0.0, shoppingBasket.getTotal(), 0.0);
  }
}
