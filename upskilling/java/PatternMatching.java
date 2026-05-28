public class PatternMatching{
    public static void type(Object obj){
        switch (obj){
            case Integer i ->
                System.out.println("Integer value: "+i);
            case String s ->
                System.out.println("String value: "+s);
            case Double d ->
                System.out.println("Double value: "+d);
            case Boolean b ->
                System.out.println("Boolean value: "+b);
            case null ->
                System.out.println("Object is null");
            default ->
                System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }
    public static void main(String[] args){
        type(10);
        type("Hello World");
        type(25.12);
        type(true);
        type(null);
        type(new StringBuilder("hello"));
    }
}