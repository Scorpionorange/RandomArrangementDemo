import java.util.Arrays;

/**
 * Created by ScorpionOrange on 2017/01/05.
 */
public class RandomArrangementDemo {
    public static void main(String[] args){
        int[] a = new int[20];
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*1000);
        }
        Arrays.sort(a);
        for(int temp : a){
            System.out.print(temp + "  ");
        }
        System.out.println("\nAfter :");
        randomArrangement(a);
        for(int temp : a){
            System.out.print(temp + "  ");
        }
    }

    public static void randomArrangement(int[] arrayInput){
        for(int i = 0; i < arrayInput.length; i++){
            int temp = arrayInput[i];
            int tempNumber = (int) (Math.random()*arrayInput.length);
            arrayInput[i] = arrayInput[tempNumber];
            arrayInput[tempNumber] = temp;
        }
    }
}
