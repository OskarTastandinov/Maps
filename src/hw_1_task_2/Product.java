package hw_1_task_2;

import java.util.Objects;

public class Product {
    private String nameProduct;
    private int price;

    public Product(String nameProduct, int price) {
        if (nameProduct == null || nameProduct.isBlank() || price < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct);
    }

    @Override
    public String toString() {

        return String.format("%s, Стоимость: %s", this.nameProduct, this.price);
    }

}

