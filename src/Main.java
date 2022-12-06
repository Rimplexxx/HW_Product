import passport.Passport;
import phonebook.FullName;
import phonebook.Phonebook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Recipe recipe = new Recipe("Каша");
        recipe.addProduct(new Product("Банан", 12), 2);
        System.out.println(recipe.getRecipePrice());
        //hw 1
        Phonebook phonebook = new Phonebook();
        phonebook.addPhone(new FullName("Иван", "Петров"), "88005556789");
        phonebook.addPhone(new FullName("Денис", "Борикович"), "82455556789");
        phonebook.addPhone(new FullName("Олег", "Федоров"), "83335556789");
        for (Map.Entry<FullName, String> entry : phonebook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }
        //hw 2
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "Строка 5");
        orderedMap.put(2, "Строка 2");
        orderedMap.put(1, "Строка 1");
        orderedMap.put(6, "Строка 6");
        orderedMap.put(8, "Строка 8");
        orderedMap.put(10, "Строка 10");
        orderedMap.put(7, "Строка 7");
        orderedMap.put(4, "Строка 4");
        orderedMap.put(3, "Строка 3");
        orderedMap.put(9, "Строка 9");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("%s:%s%n", entry.getKey(), entry.getValue());
        }
    }

//    private static void numbersSetRemoveEven() {
//        Set<Integer> numbers = new HashSet<>(20);
//        Random random = new Random();
//        while (numbers.size() < 20) {
//            numbers.add(random.nextInt(1000));
//        }
//        System.out.println(numbers);
//        Iterator<Integer> numberIterator = numbers.iterator();
//        while (numberIterator.hasNext()) {
//            int number = numberIterator.next();
//            if (number % 2 != 0) {
//                numberIterator.remove();
//            }
//        }
//        System.out.println(numbers);
//    }
}