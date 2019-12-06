import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CartTest {

    @Test
    public void testCart_A_expect50(){
        Cart cart = new Cart("A");
        assertThat(cart.getTotal(), is(50.0));
    }

    @Test
    public void testCart_AB_expect80(){
        Cart cart = new Cart("AB");
        assertThat(cart.getTotal(), is(80.0));
    }

    @Test
    public void testCart_ABC_expect100(){
        Cart cart = new Cart("ABC");
        assertThat(cart.getTotal(), is(100.0));
    }

    @Test
    public void testCart_ABCD_expect115(){
        Cart cart = new Cart("ABCD");
        assertThat(cart.getTotal(), is(115.0));
    }

    @Test
    public void testCart_AAA_expectCombo3For130(){
        Cart cart = new Cart("AAA");
        assertThat(cart.getTotal(), is(130.0));
    }

    @Test
    public void testCart_BB_expectCombo2For45(){
        Cart cart = new Cart("BB");
        assertThat(cart.getTotal(), is(130.0));
    }

    @Test
    public void testCart_BBACAA_expect195(){
        Cart cart = new Cart("BBACAA");
        assertThat(cart.getTotal(), is(195.0));
    }
}
