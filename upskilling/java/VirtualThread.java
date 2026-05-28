public class VirtualThread{
    public static void main(String[] args) throws Exception{
        long start=System.currentTimeMillis();
        for(int i=1;i<=100000;i++){
            int n = i;
            Thread.startVirtualThread(()->{
                System.out.println("Virtual Thread : "+ n);
            });
        }
        long end=System.currentTimeMillis();
        System.out.println("\nTime Taken : "+(end-start)+" ms");
    }
}