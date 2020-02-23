import java.util.Scanner;

public class ManagerPhoneBook {
    static PhoneBook phoneBook = new PhoneBook();
    static  Scanner input = new Scanner(System.in);

    private static void insertPhone(){
        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        System.out.println("Nhập sđt: ");
        String phoneNumber = input.nextLine();
        phoneBook.insertPhone(name,phoneNumber);
    }

    private static void updatePhone(){
        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        System.out.println("Nhập sđt mới: ");
        String phoneNumber = input.nextLine();
        phoneBook.updatePhone(name,phoneNumber);
    }

    private static void removePhone(){
        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        phoneBook.removePhone(name);
    }

    private static void searchPhone(){
        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        phoneBook.searchPhone(name);
    }

    private static void sort(){
        phoneBook.sortPhone();
    }

    private static void show(){
        phoneBook.showPhoneBook();
    }

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1. Insert Phone");
        System.out.println("2. Edit Phone");
        System.out.println("3. Delete Phone");
        System.out.println("4. Search Phone");
        System.out.println("5. Sort");
        System.out.println("6. Show phone book");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        int choice;
        menu();
        while (true){
            System.out.println("Chọn 1 mục: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                    insertPhone();
                    break;
                case 2:
                    updatePhone();
                    break;
                case 3:
                    removePhone();
                    break;
                case 4:
                    searchPhone();
                    break;
                case 5:
                    sort();
                    break;
                case 6:
                    show();
                    break;
                case 0:
                    return;
            }
        }
    }
}

