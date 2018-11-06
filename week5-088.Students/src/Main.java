
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     ArrayList<Student> list = new ArrayList<Student>();
     String name;
     String studentnumber;

     while (true) {
         System.out.println("name: ");
         name = reader.nextLine();

         if(name.isEmpty())
             break;

         System.out.println("studentnumber: ");
         studentnumber = reader.nextLine();

         Student buffer = new Student(name, studentnumber);

         for (Student i : list) {
             System.out.println(i.toString());
         }

         String search;

         System.out.println("Give search term: ");
         search = reader.nextLine();

         System.out.println("Result: ");

         for(Student j : list) {
             if(j.getName().contains(search)){
                 System.out.println(j);
             }
     }
    }
}
