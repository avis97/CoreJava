package Stream;
import java.util.*;
import java.util.stream.Collectors;

class Student{
    private String name;
    private String stream;
    private String add;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String stream, String add, int age) {
        this.name = name;
        this.stream = stream;
        this.add = add;
        this.age = age;
    }
}
public class ObjectStream{
    public static void main(String[] args){
        Student student1=new Student("Avishek","EE","Barasat",26);
        Student student2=new Student("Amiya","EE","Sodepur",24);
        Student student3=new Student("Ankita","ECE","Habra",34);
        Student student4=new Student("Kanaka","Cibil","Barasat",42);
        Student student5=new Student("Rabi","ME","Sodepur",21);
        Student student6=new Student("Koushik","ME","Barasat",19);
        Student student7=new Student("Rinku","EE","Dumdum",49);
        Student student8=new Student("Babai","ECE","Talikhola",42);

        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);

        // sort reverse by student age which from Barasat address
        list.stream()
                .filter(student -> student.getAdd().equals("Barasat"))
                .sorted(Comparator
                        .comparing(Student::getAge)
                        .reversed())
                .forEach(e-> System.out.println(e.getName()+" "+e.getAge()));

        //revers sort by age and multiply by 2;
        list.stream().sorted(Comparator
                .comparing(Student::getAge)
                .reversed())
                .map(student -> student.getName()+" "+student.getAge()*2)
                .forEach(e-> System.out.println(e));

        //get a list all the address but no duplicate...

        list.stream()
                .map(student ->student.getAdd())
                .distinct()
                .forEach(e-> System.out.println(e));

        // count
        int student= (int) list.stream().count();
        System.out.println(student);

        // collection-->>
        List<String> studentList=list
                .stream()
                .filter(st->st.getAge()>=25)
                .sorted(Comparator
                        .comparing(Student::getAge)
                        .reversed())
                .map(Student::getName)
                .collect(Collectors.toList());
        
        studentList.forEach(System.out::println);

    }
}
