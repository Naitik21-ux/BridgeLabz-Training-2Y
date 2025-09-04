import java.util.Scanner;

public class kilometertomile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        float miles=(distance)*1.6f;
        System.out.println("The distance "+distance+"km in miles is "+miles);
        sc.close();;

    }
}
