import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product banan = new Product("Банан", 17f, 1);
        Product ananas = new Product("Ананас", 89f, 1);
        ProductList productList = new ProductList();
        productList.addProduct(banan);
        productList.addProduct(ananas);
        System.out.println(productList);
        numbersSetRemoveEven();

    }

    private static void numbersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}