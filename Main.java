public class Main {
    public static void main(String[] args) {

        User usr1 = new User("John",1954,12,18);
        Admin usr2 = new Admin("Nicolas", 2005, 12, 18);


        usr1.displayHappyBirthday();
        System.out.println();
        usr2.displayHappyBirthday();

    }
}