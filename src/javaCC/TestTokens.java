import java.io.FileInputStream;

public class TestTokens {
    public static void main(String[] args) throws Exception {
        FileInputStream fis =
            new FileInputStream("C:/Users/SAMA/Documents/NetBeansProjects/JavaCC/test.txt");

        Calculator parser = new Calculator(fis);

        // ده بيشغّل Parser على كامل الملف
        parser.Program();

        System.out.println("Parsing completed successfully ✔");
    }
}
