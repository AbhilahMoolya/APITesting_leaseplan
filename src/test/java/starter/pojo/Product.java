package starter.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import starter.productResponse;

import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private String provider;
    private String title;
    private String url;
    private String brand;
    private Double price;
    private String unit;
//    private String isPromo;
//    private String promoDetails;
    private String image;

//    @Override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return  getProvider().equals(product.getProvider()) && getTitle().equals(product.getTitle()) && getUrl().equals(product.getUrl()) && getBrand().equals(product.getBrand()) && getPrice()==product.getPrice() && getUnit().equals(product.getUnit()) && getImage().equals(product.getImage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProvider(), getTitle(), getUrl(), getBrand(), getPrice(), getUnit(),  getImage());
    }
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Product)) return false;
//        Product product = (Product) o;
////        return Objects.equals(product.getPrice(), getPrice())  && isPromo() == product.isPromo() && getPromoDetails().toString().equals( product.getPromoDetails().toString()) && Objects.equals(getProvider(), product.getProvider()) && Objects.equals(getTitle(), product.getTitle()) && Objects.equals(getUrl(), product.getUrl()) && Objects.equals(getBrand(), product.getBrand()) && Objects.equals(getUnit(), product.getUnit()) && Objects.equals(getImage(), product.getImage());
//        return Objects.equals(product.getPrice(), getPrice())  && isPromo() == product.isPromo()  && Objects.equals(getProvider(), product.getProvider()) && Objects.equals(getTitle(), product.getTitle()) && Objects.equals(getUrl(), product.getUrl()) && Objects.equals(getBrand(), product.getBrand()) && Objects.equals(getUnit(), product.getUnit()) && Objects.equals(getImage(), product.getImage());
//
//    }
//
//    @Override
//    public int hashCode() {
////        return Objects.hash(getProvider(), getTitle(), getUrl(), getBrand(), getPrice(), getUnit(), isPromo(), getPromoDetails(), getImage());
//        return Objects.hash(getProvider(), getTitle(), getUrl(), getBrand(), getPrice(), getUnit(), isPromo(), getImage());
//    }
    public Product(){

    }

    public Product(String provider, String title, String url, String brand, double price, String unit, String image) {
        this.provider = provider;
        this.title = title;
        this.url = url;
        this.brand = brand;
        this.price = price;
        this.unit = unit;
//        this.isPromo = isPromo;
//        this.promoDetails = promoDetails;
        this.image = image;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

//    public String isPromo() {
//        return isPromo;
//    }
//
//    public void setPromo(String promo) {
//        isPromo = promo;
//    }

//    public String getPromoDetails() {
//        return promoDetails;
//    }
//
//    public void setPromoDetails(String promoDetails) {
//        this.promoDetails = promoDetails;
//    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
