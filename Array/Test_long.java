import java.util.Scanner;

public class Test_long {

    public static void main(String[] args) {
        // int l = 10;
        // int[] a = new int[l];
        // for(int i=0; i<a.length; ++i){
        //     System.out.println(a[i]);
        //     System.out.println(a);
        // }
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);
        for(int i =0;  i<5; i++){
            a[i] = s.nextInt();
        }
        for(int i =0;  i<5; i++){
            System.out.println(a[i]);
        }
        
    }
    
}