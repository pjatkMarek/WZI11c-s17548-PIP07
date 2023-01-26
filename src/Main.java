public class Main {
    public static void main(String[] args) {
            // ZADANIE 1
            Student student1 = new Student();
            Student student2 = new Student();

            student1.name = "Marek Zagorski";

            System.out.println(student1.name + "\n" + student2.name);

            student1.number = 17548;

            System.out.println(student1.number + "\n" + student2.number);

            // ZADANIE 2

            SecretStudent student3 = new SecretStudent();

            System.out.println(student3.getName() + "\n" + student3.getSurame() + "\n" + student3.getNumber());

            // ZADANIE 3

            student3.setName("");

            student3.setName("Jakub");
            System.out.println(student3.getName());

            // ZADANIE 4

            SecretStudent student4 = new SecretStudent();
            student4.readFromScanner();
            SecretStudent student5 = new SecretStudent();
            student5.readFromScanner();

            student4.print();
            student5.print();
    }
}