public class Main {
    public static void main(String[] args) {


        int age = 18;
    // где 18 (или любая другая цифра, которую мы подставим) — возраст
    //далее напишем условный оператор
        if (age >= 18)
    // где age>=18 — условие, которое должно выполняться: возраст больше или равен 18
    // а далее нам нужно вывести в консоль результат, для этого используем функцию вывода
            System.out.println ("Мы готовы выдать вам дебетовую карту в нашем банке");

        int workYears = 1;
        if (age >= 18 && workYears >=1)
            System.out.println ("Мы готовы выдать вам кредитную карту в нашем банке");
        if (age >= 18 || workYears >=1)
            System.out.println ("Мы готовы выдать вам дебетовую карту в нашем банке");

        //int age = 18;
        // где 18 (или любая другая цифра, которую мы подставим) – возраст
        // дальше напишем логическую переменную, которая содержит в себе вопрос и условие, что
        // должно соблюдаться

        boolean giveCreditCard = age >= 18;
        //В скобках if мы переносим саму логическую переменную
        if (giveCreditCard);
        // а далее нам нужно вывести в консоль результат, для этого используем функцию вывода
        System.out.println ("Мы готовы выдать вам дебетовую карту в нашем банке");
    }
}