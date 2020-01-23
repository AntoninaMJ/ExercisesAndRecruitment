package main.recruitmentTestsNozama.videoTestCoding;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private Integer id;
    private String title;
    private String description;
    private Integer price;
    private List<Image> images = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setPrice(double price){
        this.price = (int) price;
    }

    public List<Image> getImages() {
        return images;
    }

    public void addImages(Image image) {
        images.add(image);
    }

    public boolean wasPurchaseByUser(Shop shop, User user){
        for (ShoppingCart shoppingCart: shop.getShoppingCarts()){
            for (Product product: shoppingCart.getProducts()){
                if (product.getId() == this.getId() && shoppingCart.getUser().getUserId() == user.getUserId()){
                    return true;
                }
            }
        }
        return false;
    }
}
