import java.util.Arrays;
import java.util.Scanner;
class Noble {
    public int Value(int a[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (a[i] == i) {
                count += 1;
            }


        }
        return count;
    }
}
public class NobleInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        int a[]=new int [n];
        System.out.println("enter different  "+n+" elements");
        for(int i=0;i<n;i++){
             a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Noble sol=new Noble();
        System.out.println(sol.Value(a,n));

    }
}