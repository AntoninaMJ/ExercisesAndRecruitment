package test.java.nozamaAssesments.videoTestCoding;

import main.nozamaAssessments.videoTestCoding.*;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void checkDefaultMethod1() {
        User user1 = new User(1, "Antonina", "Gdansk", "antonina@gmail.com");
        PaymentMethod defaultMethod = user1.getDefaultPaymentMethod();
        Assert.assertTrue(defaultMethod.getIsDefault());

        //answer = pass; but I think it doesn't;
    }

    @Test
    public void checkDefaultMethod2() {
        User user1 = new User(1, "Antonina", "Gdansk", "antonina@gmail.com");
        PaymentMethod method1 = new PaymentMethod(PaymentMethodType.CREDIT_CARD, "myPersonalCard", true);
        PaymentMethod method2 = new PaymentMethod(PaymentMethodType.CREDIT_CARD, "corporateCard", false);
        user1.addPaymentMethod(method1);
        user1.addPaymentMethod(method2);
        Assert.assertSame(method1, user1.getDefaultPaymentMethod());

        //answer = pass; ok
    }

    @Test
    public void checkNameAndEmail() {
        User user1 = new User(1, "Antonina", "Gdansk", "antonina@gmail.com");
        User user2 = new User(2, "Michal", "Kartuzy", "michal@gmail.com");
        Assert.assertEquals("Antonina", user1.getName());
        Assert.assertEquals("michal@gmail.com", user2.getEmail());

        //answer = fail; ok
    }

    @Test
    public void checkAddImage() {
        Product product = new Product();
        Image image = new Image();
        product.addImages(image);
        Assert.assertSame(image, product.getImages().get(0));

        //answer = pass; ok
    }

    @Test
    public void checkSetGetProductPrice(){
        Product product = new Product();
        product.setPrice(7.25);
        Assert.assertEquals(7.25, product.getPrice(), 0.0);

        //answer = fail; ok
    }
}
