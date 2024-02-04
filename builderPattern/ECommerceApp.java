package builderPattern;

import java.util.*;

public class ECommerceApp {

    public static void main (String[] args) {

        Scanner stringInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);
        String firstname = "";
        String lastname = "";
        String address = "";
        String email = "";
        String phone = "";
        int age = 0;


        System.out.println("Fill up the fields in this form: ");
        while (firstname.trim().isEmpty()) {

            System.out.print("First Name: ");
            firstname = stringInput.nextLine();

            if (firstname.trim().isEmpty()) {

                System.out.println("Field is empty, please input your details.");

            }

        }

        while (lastname.trim().isEmpty()) {

            System.out.print("Last Name: ");
            lastname = stringInput.nextLine();

            if (lastname.trim().isEmpty()) {

                System.out.println("Field is empty, please input your details.");

            }

        }

        while(age == 0) {

            System.out.print("Age: ");
            age = intInput.nextInt();

            if (age == 0) {

                System.out.println("Field is empty, please input your details.");

            }

        }

        System.out.print("Address: ");
        address = stringInput.nextLine();

        System.out.print("Email: ");
        email = stringInput.nextLine();

        while(phone.trim().isEmpty()) {

            System.out.print("Phone: ");
            phone = stringInput.nextLine();

            if (lastname.trim().isEmpty()) {

                System.out.println("Field is empty, please input your details.");

            }

        }

        Users user = new Users.UsersBuilder()
                .address(address)
                .age(age)
                .email(email)
                .firstName(firstname)
                .lastName(lastname)
                .phone(phone)
                .build();

        System.out.println("\nThis is the complete form\n");

        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Address: " + user.address);
        System.out.println("Email: " + user.email);
        System.out.println("Phone Number: " + user.phone);
        System.out.println("Age: " + user.age);

        System.out.println("\nThank you for signing up in our E-Commerce Application.");
        System.out.println("We will be processing your application shortly.");
        System.out.println("Godbless.");

        System.exit(0);

    }

}
