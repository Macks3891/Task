import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выбор категории блюд
        System.out.println("Выберите категорию блюд:");
        System.out.println("1 - Завтрак");
        System.out.println("2 - Обед");
        System.out.println("3 - Ужин");
        int category = scanner.nextInt();

        // Проверка на голод
        System.out.println("Вы голодны сейчас? (да/нет)");
        String isHungry = scanner.next();

        // Рекомендация блюд и напитков
        String meal = "";
        String drink = "";

        // Используем тернарный оператор для определения блюда и напитка
        meal = isHungry.equalsIgnoreCase("да") ?
                (category == 1 ? "Омлет с тостами" : category == 2 ? "Стейк с картофелем" : category == 3 ? "Пасту с соусом" : "Некорректный выбор категории") :
                (category == 1 ? "Йогурт с фруктами" : category == 2 ? "Салат с курицей" : category == 3 ? "Суп-пюре" : "Некорректный выбор категории");

        drink = category == 1 ? "кофе" : "сок";

        // Проверка на корректность выбора категории
        if (meal.equals("Некорректный выбор категории")) {
            System.out.println("Некорректный выбор категории.");
            return;
        }

        // Проверка на корректность ответа о голоде
        if (!isHungry.equalsIgnoreCase("да") && !isHungry.equalsIgnoreCase("нет")) {
            System.out.println("Некорректный ответ о голоде.");
            return;
        }

        // Вывод рекомендаций
        System.out.println("Рекомендуем: " + meal + " и " + drink + ".");

        scanner.close();
    }
}