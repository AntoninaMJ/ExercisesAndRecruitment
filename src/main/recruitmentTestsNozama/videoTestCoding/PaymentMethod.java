package main.recruitmentTestsNozama.videoTestCoding;

public class PaymentMethod {
    private PaymentMethodType type;
    private String properties;
    private boolean isDefault;

    public PaymentMethod(PaymentMethodType type, String properties, Boolean isDefault) {
        this.type = type;
        this.properties = properties;
        this.isDefault = isDefault;
    }

    public PaymentMethodType getType() {
        return type;
    }

    public void setType(PaymentMethodType type) {
        this.type = type;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
