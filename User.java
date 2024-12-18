import java.time.LocalDate;

public class User {

    protected String name;
    protected LocalDate dob;

    //Constructor
    public User(){
        this.name = null;
        this.dob = LocalDate.now();

    }

    public User(String name, int year, int month, int day){
        setName(name);
        setDob(year, month, day);
    }

    //Getter

    public String getName() {
        return name;
    }

    public LocalDate getDob(){
        return dob;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public void setDob(int year, int month, int day){
        this.dob = LocalDate.of(year,month,day);

    }

    //Method

    public void displayInfo(){
        System.out.println("Name : " + getName());
        System.out.println("Date of Birth : " + getDob());
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return this.getDob().getMonth() == today.getMonth() &&
                this.getDob().getDayOfMonth() == today.getDayOfMonth();
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}
