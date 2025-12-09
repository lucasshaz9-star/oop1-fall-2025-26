class Contact {
private String phone;
private String email;

    public Contact(String phone, String email){
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return phone + " , " + email;
    }
}

class Student {
private String Name;
private Contact cont;

    public Student(String Name, Contact cont){
        this.Name = Name;
        this.cont = cont;
    }

    public void showInfo(){
        System.out.println("Student: " + Name);
        System.out.println("Contact: " + cont);
    }
}

class School {
    private String schoolName;
    private Student studs[];
    private int total = 0;

    public School(String schoolName, int StdSize){
        this.schoolName = schoolName;
        studs = new Student[StdSize];
    }

    public void addStd(Student s){
     if(total < studs.length){
            studs[total] = s;
            total++;
        }
     else{
            System.out.println("Full.. can't add " + s);
        }
    }

    public void showStudents(){
        System.out.println("School: " + schoolName);
         for(int i = 0; i < total; i++){
            studs[i].showInfo();
            System.out.println();
        }
    }
}

public class SchoolAssociation {
    public static void main(String[] args) {

        School sc = new School("Eng MED SCHL", 3);

        sc.addStd(new Student("Bruce", new Contact("123", "Bruce@mail.com")));
        sc.addStd(new Student("Wayne", new Contact("1234", "wayne@gmail.com")));
        sc.addStd(new Student("John", new Contact("12345", "John@gmail.com")));

        sc.showStudents();
        System.out.println();

        Student x = new Student("Doe", new Contact("123456", "Doe@gmail.com"));
        x.showInfo();
    }
}
