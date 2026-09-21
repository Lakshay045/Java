public class PasswordCheck {
    public static void main(String[] args) {
        String password = "Lakshay@123";

        boolean upper = false;
        boolean digit = false;
        boolean special = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                upper = true;
            else if (Character.isDigit(ch))
                digit = true;
            else if (!Character.isLetterOrDigit(ch))
                special = true;
        }

        if (upper && digit && special)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}