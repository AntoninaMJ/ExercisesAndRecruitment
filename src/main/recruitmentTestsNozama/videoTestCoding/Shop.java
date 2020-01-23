package main.recruitmentTestsNozama.videoTestCoding;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<ShoppingCart> shoppingCarts;

    public List<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void fulfillShoppingCart(ShoppingCart shoppingCart){
        for (Product product: shoppingCart.getProducts()){
            shipProductTo(shoppingCart.getUser().getAddress(), product);
        }
        shoppingCarts.add(shoppingCart);
    }

    public List<Product> pastPurchasesPerUser(User user) {
        List<Product> pastPurchases = new ArrayList<>();
        for (ShoppingCart shoppingCart: shoppingCarts){
            for (Product product:shoppingCart.getProducts()){
                pastPurchases.add(product);
            }
        }
        return pastPurchases;
    }

    private void shipProductTo(String address, Product product) {
        //this method should actually call warehouse API to ship the product to given address
    }


}
