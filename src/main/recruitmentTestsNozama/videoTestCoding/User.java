package main.recruitmentTestsNozama.videoTestCoding;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer userId;
    private String name;
    private String address;
    private String email;
    private List<PaymentMethod> paymentMethods = new ArrayList<>();

    public User(Integer userId, String name, String address, String email) {
        this.userId = userId;
        this.name = name;
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.add(paymentMethod);
    }

    public PaymentMethod getDefaultPaymentMethod() {
        for (PaymentMethod paymentMethod : paymentMethods) {
            if (paymentMethod.getIsDefault())
                return paymentMethod;
        }
        return null;
    }
}
