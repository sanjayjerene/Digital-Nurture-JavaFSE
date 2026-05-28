import java.util.*;
public class Records{
    record Person(String name, int age){}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n=sc.nextInt();
        Person[] people=new Person[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter name: ");
            String name=sc.next();
            System.out.print("Enter age: ");
            int age=sc.nextInt();
            people[i]=new Person(name, age);
        }
        System.out.println("Person Records:");
        for(Person person : people){
            System.out.println(person);
        }
        List<Person> p1=Arrays.asList(people);
        System.out.println("\nPeople with age > 20:");
        p1.stream()
          .filter(person -> person.age()>18)
          .forEach(System.out::println);
    }
}