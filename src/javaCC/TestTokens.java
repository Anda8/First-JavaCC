import java.io.FileInputStream;

public class TestTokens {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/SAMA/Documents/NetBeansProjects/JavaCC/test.txt");
        Calculator parser = new Calculator(fis);

        Token t;
        while ((t = parser.getNextToken()).kind != 0) {
            System.out.println(t.image + "  line " + t.beginLine + ", col " + t.beginColumn);
        }
    }
}
