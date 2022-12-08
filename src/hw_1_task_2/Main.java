package hw_1_task_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Recipe cocktail = new Recipe("Коктейль");
        Product milk = new Product("Молоко", 70);
        Product strawberry = new Product("Клубника", 300);
        Product iceCream = new Product("Мороженное", 150);


        cocktail.add(milk, 1);
        cocktail.add(strawberry, 10);
        cocktail.add(iceCream, 1);


        System.out.println(cocktail.getRecipeName());
        System.out.println(cocktail.getTotalPrice() + milk.getPrice() + strawberry.getPrice() + iceCream.getPrice());

    }
}
