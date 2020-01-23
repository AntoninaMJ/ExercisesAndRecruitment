package main.recruitmentTestsNozama.videoTestCoding;

import java.util.List;

public class ShoppingCart {
    private User user;
    private List<Product> products;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(User user, Product product){
        setUser(user);
        getProducts().add(product);
    }
}
