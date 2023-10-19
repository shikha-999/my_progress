// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Student.Builder builder = new Student.Builder(); //nested class
//        builder.setFirstName("Shikha");
//        builder.setLastName("Yadav");

        //method chaining
//        Student.Builder builder =
//                                    Student.builder()
//                                    .setFirstName("shikha")
//                                    .setLastName("yadav");

//        step 5 :
//          Student student = Student
//                          .builder()                //creating object
//                          .setFirstName("shikha")   //method of Builder
//                          .setLastName("yadav")     //method of Builder
//                          .build();                 //method of Builder
        Student student = Student
                .builder()                //creating object
                .active()
                .withName("shikha","yadav")
                .withEmail("shikha@google.com")
                .build();                 //method of Builder
        System.out.println(student.getFirstName()+ " " + student.getLastName() + " " + student.getEmail()+ " "+student.getActive());
    }
}