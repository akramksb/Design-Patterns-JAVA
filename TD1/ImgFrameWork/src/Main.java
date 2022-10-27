import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[100];
        Frame frame = new Frame();
        System.out.println(Arrays.toString(frame.filter(data)));
        System.out.println(Arrays.toString(frame.compresser(data)));
    }
}
