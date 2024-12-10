public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.print("Ф.И.О сотрудника - " + fullName);

        System.out.println("Задача 2");
        System.out.print("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());

        System.out.println("Задача 3");
        String fullNames ="Иванов Семён Семёнович";
        String fullNamesTrue = fullNames.replace("ё","е");
        System.out.println("Данные Ф. И. О. сотрудника — "+fullNamesTrue);

    }
}


