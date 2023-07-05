import java.util.Random;

public class SingletonRandom {
    private static Random random;

    private SingletonRandom(){}

    public static Random getInstance(){
        if(random == null){
            synchronized (Random.class){
                if(random == null){
                    random = new Random();
                }
            }
        }
        return random;
    }
}
