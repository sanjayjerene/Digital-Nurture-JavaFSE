interface Playable{
    void play();
}
class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println(" this is a guitar");
    }
}
class Piano implements Playable{
    @Override
    public void play(){
        System.out.println(" this is a piano");
    }
}
public class Interface{
    public static void main(String[] args){
        Playable guitar=new Guitar();
        Playable piano=new Piano();
        guitar.play();
        piano.play();
    }
}