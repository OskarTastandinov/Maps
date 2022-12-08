package hw_1_task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String recipeName;
    private final Map<Product, Integer> products = new HashMap<>();

    public Recipe(String recipeName) {
        if (recipeName == null || recipeName.isBlank()) {
            throw new IllegalArgumentException("Заполните поля полностью");
        }
        this.recipeName = recipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void add(Product product, int amount) {
        products.put(product, products.getOrDefault(amount, 0) + amount);
    }

    public int getTotalPrice() {
        int summa = 0;
        for (Map.Entry<Product, Integer> product:this.products.entrySet()) {
            summa = summa + product.getKey().getPrice()*product.getValue();

        }
        return summa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipes = (Recipe) o;
        return Objects.equals(recipeName, recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }
}
