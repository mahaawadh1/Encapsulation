public class Student {
    private String name;
    private int age;
    private double gpa;

    //getter and setter for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //getter and setter for age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getGpaStatus(){
        if (gpa > 3){
            return " Excellent!";
        } else if (gpa>=2){
            return "Good.";
        }else {
            return "Need Improvement.";
        }
    }
    public void setGpa(double gpa){
        if (gpa >= 0.0 && gpa <=4.0){
            this.gpa = gpa;
        } else {
            System.out.println("ERROR!");
            this.gpa = 0.0;
        }
    }
 
}