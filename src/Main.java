public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        var  firstNeme= "Ivanov";
        var middleNeme = "Ivan";
        var lastNeme = "Ivanovich";
        var fullNeme = firstNeme + " " + middleNeme + " " + lastNeme;
        System.out.println("Ф. И. О. сотрудника —" + fullNeme);


    }

    public static void task2() {
        var firstNeme = "Ivanov";
        var  middleNeme= "Ivan";
        var lastNeme = "Ivanovich";
        var fullNeme = firstNeme + " " + middleNeme + " " + lastNeme;

        fullNeme = fullNeme.toUpperCase();
        System.out.println(fullNeme);
    }

    public static void task3() {
        var middleNeme = "Иванов";
        var firstNeme = "Семён";
        var lastNeme = "Семёнович";
        var fullNeme = firstNeme + " " + middleNeme + " " + lastNeme;


        fullNeme = fullNeme.replace(  "ё", "е");
        System.out.println(fullNeme);
    }
}
