package Lesson_1;

public class HomeWorkApp {

    public static void main(String[] args) {
        HomeWorkApp.printThreeWords("Orange", "Banana", "Apple");
        HomeWorkApp.checkSumSign(-789, 12);
        HomeWorkApp.printColor(-78);
        HomeWorkApp.compareNumbers(78, 789);

    }
    public static void printThreeWords(String firstFruit, String secondFruit, String thirdFruit) {
        System.out.println(firstFruit);
        System.out.println(secondFruit);
        System.out.println(thirdFruit);
    }

    public static void checkSumSign (int a, int b){
        int c = a + b;

        System.out.println(c >= 0 ? "Сумма положительная!" : "Сумма отрицательная!");
    }

    public static void printColor (int value) {

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers (int a, int b){

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
