public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private String phoneNumber;
    private String email;
    private boolean isActive;

    //step 1 : make constructor private
    private Student(){};

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public boolean getActive(){
        return isActive;
    }

    //global access point to return builder object
    public static Builder builder(){
        return new Builder();
    }

    //step 2: friend class Builder / inner class
    static class Builder{
        //step 3 : copy attributes from Outer to Innder class
        private String firstName;
        private String lastName;
        private Integer age;
        private String phoneNumber;
        private String email;
        private boolean isActive;

        //step 4: expose setters - mutablev/ should return Builder (obj type)
        //Fluent interface / chain builder - modify object and return value
//        public Builder setFirstName(String firstName){
//            this.firstName = firstName;
//            return this;
//        }
//        public Builder setLastName(String lastName) {
//            this.lastName = lastName;
//            return this;
//        }
//
        public Builder withName(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }
        public  Builder withEmail(String email){
            this.email = email;
            return this;
        }
        public  Builder active(){
            this.isActive = true;
            return this;
        }
//        step 5 : add the build hook & validation
        public Student build(){
            if(!isValid()){
                throw new IllegalArgumentException("Invalid Object");
            }
            Student student = new Student(); //call constructor
            student.firstName = firstName;
            student.lastName = lastName;
            student.email = email;
            student.isActive = isActive;
            return student;
        }
        public boolean isValid(){
            if(firstName == null && lastName == null)
                    return false;
            return true;
        }
    }

}
