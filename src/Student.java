import java.util.*;

public class Student {
    private String name;
    private String faculty;
    private int year;

    Student(String name, String faculty,int year){
        this.name = name;
        this.faculty = faculty;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public String getFaculty(){
        return faculty;
    }
    public int getYear(){
        return year;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        return faculty == ((Student) obj).faculty || faculty != null
                && faculty.equals(((Student) obj).faculty) && year == ((Student) obj).year;
    }

    public int hashCode(){
        String key = this.faculty + this.year;
        return key.hashCode();
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        new Student("Ivan","fizmat",2002).addStudent(students);
        new Student("Misha","fizmat",2002).addStudent(students);
        new Student("Sasha","fizmat",2002).addStudent(students);
        new Student("Olya","inyaz",2003).addStudent(students);
        new Student("Lesha","hudgraf",2005).addStudent(students);

        Student studentForDel = new Student("Lesha","hudgraf",2005);
        studentForDel.deleteStudent(students);

        findStudents("fizmat", 2002, studentHashMap(students));

        System.out.println("Size = " + students.size());
        System.out.println(studentHashMap(students));
/*
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
 */
    }

    public static HashMap<String,String> studentHashMap(ArrayList<Student> students){
        HashMap<String,String> stHashMap = new HashMap<>();

        for (int i = 0; i < students.size(); i++) {
            String potok = students.get(i).faculty + students.get(i).year;
            stHashMap.put(potok, students.get(i).name);
        }

        return stHashMap;
    }

    public void addStudent(ArrayList arrayList){
        arrayList.add(this);
    }
    public void deleteStudent(ArrayList arrayList){
        arrayList.remove(this);
    }

    public static void findStudents(String faculty, Integer year, HashMap<String,String> hashMap){
        for (Map.Entry<String,String> entry: hashMap.entrySet()
             ) {

            System.out.println("Вывод " + entry.getKey() + " " + entry.getValue() );

            if (hashMap.equals(faculty + year)){
                System.out.println(hashMap.get(faculty + year));
            }
        }
    }
}
