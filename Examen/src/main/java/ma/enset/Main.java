package ma.enset;

enum visibility{
    PUBLIC("public"), Private("private");
    public final String label;
    private visibility(String label) {
        this.label = label;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println( visibility.Private.label );
    }
}
