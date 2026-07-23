package OOP;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("library lending system");
            System.out.println("1-Add Item");
            System.out.println("2-Add Member");
            System.out.println("3-Borrow Item");
            System.out.println("4-Return Item");
            System.out.println("5-List Catalog");
            System.out.println("6-Report");
            System.out.println("7-Exit");
            System.out.print(" enter choice plz = ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input  plz enter a number.");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter item type for Book | Magazine | DVD: ");
                String type = scanner.nextLine().trim();
                System.out.print("Enter title: ");
                String title = scanner.nextLine().trim();

                try {
                    if (type.equalsIgnoreCase("Book")) {

                        System.out.print("Enter author: ");
                        String author = scanner.nextLine().trim();
                        System.out.print("Enter pages: ");
                        int pages = Integer.parseInt(scanner.nextLine());
                        library.addItem(new Book(title, author, pages));
                        System.out.println("Book added successfully.");
                    } else if (type.equalsIgnoreCase("Magazine")) {
                        System.out.print("Enter issue number: ");
                        int issueNumber = Integer.parseInt(scanner.nextLine());
                        library.addItem(new Magazine(title, issueNumber));
                        System.out.println("Magazine added successfully.");
                    } else if (type.equalsIgnoreCase("DVD")) {
                        System.out.print("Enter runtime minutes: ");
                        int runtime = Integer.parseInt(scanner.nextLine());
                        library.addItem(new DVD(title, runtime));
                        System.out.println("DVD added successfully.");
                    } else {
                        System.out.println("Invalid item type.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else if (choice == 2) {
                System.out.print("Enter member id: ");
                String memberId = scanner.nextLine().trim();
                System.out.print("Enter member name: ");
                String name = scanner.nextLine().trim();
                System.out.print("Enter max allowed items: ");
                int maxAllowed = Integer.parseInt(scanner.nextLine());

                try {
                    Member member = new Member(memberId, name, maxAllowed);
                    library.addMember(member);
                    System.out.println("Member added successfully.");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else if (choice == 3) {
                System.out.print("Enter member id: ");
                String mId = scanner.nextLine().trim();
                System.out.print("Enter item id: ");
                String iId = scanner.nextLine().trim();

                try {
                    library.borrowItem(mId, iId);
                    System.out.println("Borrowed " + iId + " to " + mId + ".");
                } catch (LibraryException ex) {
                    System.out.println("Could not borrow: " + ex.getMessage());
                }

            } else if (choice == 4) {
                System.out.print("Enter member id: ");
                String rmId = scanner.nextLine().trim();
                System.out.print("Enter item id: ");
                String riId = scanner.nextLine().trim();

                try {
                    library.returnItem(rmId, riId);
                    System.out.println("Returned " + riId + " from " + rmId + ".");
                } catch (LibraryException ex) {
                    System.out.println("Could not return ;" + ex.getMessage());
                }

            } else if (choice == 5) {
                library.listCatalog();

            } else if (choice == 6) {
                library.printReport();

            } else if (choice == 7) {
                System.out.println("Exiting");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}