import java.util.HashMap;
import java.util.Map;

public class Cart {
    private String[] _cartItems;
    private double _total;

    public Cart(String cartContent) {
        _cartItems = cartContent.split("");
        calculateTotal();
    }

    public double getTotal() {
        return _total;
    }

    private void calculateTotal(){
        Map<Product, Integer> nbTotalByProduct = calculateHowMany(_cartItems);

        double total = 0;
        for (Map.Entry<Product, Integer> nbProdByProd: nbTotalByProduct.entrySet()) {
            Product product = nbProdByProd.getKey();
            Integer nb = nbProdByProd.getValue();

            total += product.getValue() * nb;
            //TODO check combos
        }
        _total = total;
    }

    private static Map<Product, Integer> calculateHowMany(String[] cartItems){
        Map<Product, Integer> nbTotalByProduct = new HashMap<>();

        for (String cartItem : cartItems) {
            Product currentItem = Product.fromText(cartItem);

            Integer nbItem = nbTotalByProduct.get(currentItem);
            if(nbItem == null ){
                nbItem = 0;
            }
            nbItem++;
            nbTotalByProduct.put(currentItem, nbItem);
        }
        return nbTotalByProduct;
    }
}
