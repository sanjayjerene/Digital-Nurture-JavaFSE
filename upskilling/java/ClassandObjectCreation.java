class Car{
    String make;
    String model;
    int year;
    public void displayDetails(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}


public class ClassandObjectCreation {
    public static void main(String[] args) {
        Car car1=new Car();
        System.out.println("Details of Car1:");
        car1.make="Toyota";
        car1.model="Camry";
        car1.year=2020;
        car1.displayDetails();

        Car car2=new Car();
        System.out.println("Details of Car2:");
        car2.make="Honda";
        car2.model="Civic";     
        car2.year=2019;
        car2.displayDetails();

        Car car3=new Car();
        System.out.println("Details of Car3:");
        car3.make="Ford";   
        car3.model="Mustang";
        car3.year=2021;
        car3.displayDetails();
    }

    
}
