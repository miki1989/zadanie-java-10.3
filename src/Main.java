import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
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
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            for (int i = 0; i < products.length; i++) {
                String newLine = scanner.nextLine();
                String []divide = newLine.split(";");
                System.out.println(Arrays.toString(divide));
                products[i] = new Product(divide[0], divide[1],Double.valueOf(divide[2]));
            }
        }
        //obliczanie sumy cen produktów
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        System.out.println("Suma cen produktów to");
        System.out.println(sum);

        //zwracanie najdroższego produktu
        String maxValProd= " ";
        double maxValue = products[0].getPrice();
        for (int i = 0; i < products.length ; i++) {
            if(products[i].getPrice() > maxValue){
                maxValue = products[i].getPrice();
                maxValProd = products[i].getProductName();
            }
        }
        System.out.println("Cena najdroższego produktu to ");
        System.out.print(maxValue);
        System.out.println(" a jego nazwa to " + maxValProd);
    }
}
