import ShoppingBasket.ShoppingBasket;
import ShoppingBasket.Item;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ShoppingBasketTest {




  @Test
  public void totalOfEmptyBasket() {
    ShoppingBasket shoppingBasket = new ShoppingBasket(new ArrayList<>());
    assertEquals(0.0, shoppingBasket.getTotal(), 0.0);

  }

  @Test
  public void totalOfSingleItem(){
    ShoppingBasket shoppingBasket = new ShoppingBasket(List.of(new Item(100.0,1)));
     assertEquals(100.0,shoppingBasket.getTotal(),0.0);

  }

  @Test
  public void totalOfTwoItems(){
    ShoppingBasket shoppingBasket = new ShoppingBasket((List.of(new Item(100.0, 1), new Item(200.0, 1))));
    assertEquals(300.0, shoppingBasket.getTotal(), 0.0);
  }
}
