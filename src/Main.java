public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        var  firstName= "Ivanov";
        var middleName = "Ivan";
        var lastName = "Ivanovich";
        var fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника —" + fullName);


    }

    public static void task2() {
        var firstName = "Ivanov";
        var  middleName= "Ivan";
        var lastName = "Ivanovich";
        var fullName = firstName + " " + middleName + " " + lastName;

        fullName = fullName.toUpperCase();
        System.out.println(fullName);
    }

    public static void task3() {
        var middleName = "Иванов";
        var firstName = "Семён";
        var lastName = "Семёнович";
        var fullName = firstName + " " + middleName + " " + lastName;


        fullName = fullName.replace(  "ё", "е");
        System.out.println(fullName);
    }
}
