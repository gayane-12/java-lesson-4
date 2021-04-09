package oopExamples.model;

public class TrainingCenter {
    private String name = "Code Center";
    private String phone = "041123456";
    private String[] addresses = {"Mashtoc 20", "Abovyan 9", "Komitas 68"};
    private String adminPassword = "123456admin";
    private String moderatorPassword = "123456moderator";
    private Course currentCourse;

    public void setName(String name, String password) {
        if(password == adminPassword || password == moderatorPassword)
            this.name = name;
        else System.out.println("You have no access to set name.");
    }

    public void setPhone(String phone, String password) {
        if(password == adminPassword || password == moderatorPassword)
            this.phone = phone;
        else System.out.println("You have no access to set phone.");
    }

    public void getCurrentCourse(){
        if(currentCourse==null){
            System.out.println("No course available.");
        }
        else{
            System.out.println("Name: "+currentCourse.getName());
            System.out.println("Tutor: "+currentCourse.getTutor());
            System.out.println("Is online: " + (currentCourse.isOnline()?"Yes":"No"));
            System.out.println("Course length: " + currentCourse.getCourseLengthInMonths() + " month" + (currentCourse.getCourseLengthInMonths()==1?"":"s"));
            System.out.println("Total price: " + calculateTotalCoursePrice());
        }
    }

    public void setCurrentCourse(String name, int price, boolean isOnline, int courseLength, String tutor, String password){
        if(adminPassword == password){
            currentCourse = new Course();
            currentCourse.setName(name, "1234");
            currentCourse.setOnline(isOnline, "1234");
            currentCourse.setPrice(price, "1234");
            currentCourse.setCourseLengthInMonths(courseLength, "1234");
            currentCourse.setTutor(tutor, "1234");
            System.out.println("Course is added!");
        }
        else{
            System.out.println("You have no access to add course.");
        }
    }

    public void getTrainingCenterInfo(){
        System.out.println("Welcome to " + name);
        System.out.println("Our phone: " + phone);
        System.out.println("Our Addresses: ");

        for (String address:
             addresses) {
            System.out.print(" - " + address + "\n");
        }
    }

    private int calculateTotalCoursePrice(){
        return currentCourse.getPrice() * currentCourse.getCourseLengthInMonths();
    }

}
