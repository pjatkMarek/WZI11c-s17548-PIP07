import java.util.Scanner;

public class SecretStudent {
    private String name = "Secret Name";
    private String surname = "Secret Surname";
    private int number = 0;

    public String getName() {
        return name;
    }

    public void setName(String name2) {
        if(name2 != "") {
            name = name2;
        } else {
            System.out.println("Error");
        }
    }

    public String getSurame() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    public void readFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter student number: ");
        number = scanner.nextInt();
    }

    public void print() {
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nsNumber: " + number);
    }

}