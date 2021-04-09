package oopExamples.model;

public class Course {
    private String name;
    private int price;
    private String tutor;
    private boolean isOnline;
    private int courseLengthInMonths;
    private String password = "1234";

    String getName() {
        return name;
    }

    void setName(String name, String password) {
        if(this.password == password)
            this.name = name;
        else System.out.println("You have no access to set name.");
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price, String password) {
        if(this.password == password)
            this.price = price;
        else System.out.println("You have no access to set price.");
    }

    String getTutor() {
        return tutor;
    }

    void setTutor(String tutor, String password) {
        if(this.password == password)
            this.tutor = tutor;
        else System.out.println("You have no access to set tutor.");
    }

    boolean isOnline() {
        return isOnline;
    }

    void setOnline(boolean online, String password) {
        if(this.password == password)
            this.isOnline = isOnline;
        else System.out.println("You have no access to set online.");
    }

    int getCourseLengthInMonths() {
        return courseLengthInMonths;
    }

    void setCourseLengthInMonths(int courseLengthInMonths, String password) {
        if(this.password == password) {
            this.courseLengthInMonths = courseLengthInMonths;
        }
        else System.out.println("You have no access to set course length.");
    }
}
