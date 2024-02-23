import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Main {

        public static void main(String[] tarun){
            System.out.println("tarun");
            box b = new box();
            b.setDimension(0,0,0);
            b.showDimension();
        }

}
class box {
    private int length, width, height;

    public void setDimension(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public void showDimension() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("L=" + length);
        System.out.println("w=" + width);
        System.out.println("h=" + height);

    }
}