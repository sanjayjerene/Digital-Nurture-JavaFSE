import java.util.concurrent.*;
import java.util.concurrent.Callable;

public class ServiceandCallable{
    public static void main(String[] args) throws Exception{

        ExecutorService ex=Executors.newFixedThreadPool(3);

        Callable<Integer> t1=() -> 10+20;
        Callable<Integer> t2=() -> 30+40;
        Callable<Integer> t3=() -> 50+60;

        Future<Integer> future1=ex.submit(t1);
        Future<Integer> future2=ex.submit(t2);
        Future<Integer> future3=ex.submit(t3);

        System.out.println("Result 1 = " +future1.get());
        System.out.println("Result 2 = " +future2.get());
        System.out.println("Result 3 = " +future3.get());

        ex.shutdown();
    }
}