public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1:");
        String firstName = new String("Ivan");
        String middleName = new String("Ivanovich");
        String lastname = new String("Ivanov");
        String fullName = new String();
        fullName = lastname + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName);
        System.out.println();
    }
}