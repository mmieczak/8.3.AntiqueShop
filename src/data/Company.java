package data;

public class Company extends Customer {
    private String vatNumber;

    public Company(String name, boolean isPremium, String vatNumber) {
        super(name, isPremium);
        this.vatNumber = vatNumber;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

}
