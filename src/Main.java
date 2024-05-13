public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = (lastName + " " + firstName + " " + middleName);

        System.out.println("Ф.И.О.сотрудника " + fullName);
        System.out.println("Данные Ф.И.О.сотрудника для заполнения отчета — " + fullName.toUpperCase());

        String firstName1 = "Семён";
        String middleName1 = "Семёнович";
        String lastName1 = "Иванов";
        String fullName1 = (lastName1 + " " + firstName1 + " " + middleName1);
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные Ф.И.О.сотрудника — " + fullName1);

    }
}