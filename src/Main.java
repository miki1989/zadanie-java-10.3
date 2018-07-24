import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Product[] products = new Product[4];

        File file = new File("produkty.csv");
        if(!file.exists()){
            file.createNewFile();
        }

        FileWriter fw = new FileWriter("produkty.csv", false);
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write("baton; Mars; 3.0");
        bfw.newLine();
        bfw.write("mleko; Mlekowita; 1.0");
        bfw.newLine();
        bfw.write("czekolada; Wedel; 5.0");
        bfw.newLine();
        bfw.write("samochód; Opel; 3000.0");
        bfw.newLine();
        bfw.close();

        for (int i = 0; i < products.length; i++) {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String newLine = scanner.nextLine();
                products[i] = new Product(newLine, newLine, newLine);
                //System.out.println(products[i]);
            }

        }
        System.out.println(products[0]);

    }
}
