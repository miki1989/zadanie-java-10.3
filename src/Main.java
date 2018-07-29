import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Product[] products = new Product[5];

        File file = new File("produkty.csv");
        if (!file.exists()) {
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
        bfw.write("twaróg; Mlekowita; 0.5");
        bfw.close();
        Scanner scanner = new Scanner(file);
        int j = 0;
        while (scanner.hasNextLine()) {
                String newLine = scanner.nextLine();
                String[] divide = newLine.split(";");
                System.out.println(Arrays.toString(divide));
                products[j] = new Product(divide[0], divide[1], Double.valueOf(divide[2]));
                j++;
        }
        //obliczanie sumy cen produktów
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        System.out.println("Suma cen produktów to");
        System.out.println(sum);

        //zwracanie najdroższego produktu
        String maxValProd = " ";
        double maxValue = products[0].getPrice();
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > maxValue) {
                maxValue = products[i].getPrice();
                maxValProd = products[i].getProductName();
            }
        }
        System.out.println("Cena najdroższego produktu to ");
        System.out.print(maxValue);
        System.out.println(" a jego nazwa to " + maxValProd);

        //zwracanie producenta z największą ilością towarów

    }
/*
    public static String popularProducer(Product[] products){
        ArrayList<String> producers = new ArrayList<>();
        producers.add(products[0].getProductManufacturer());

        boolean equal = false;
        for (int i = 1; i < products.length; i++) {
            equal = false;
            for (int j = 0; j < producers.size() && !equal; j++) {
                if (products[i].getProductManufacturer().equals(producers.get(j))) {
                    equal = true;
                }
            }
            if (!equal) {
                producers.add(products[i].getProductManufacturer());
            }
        }

            int[] index = new int[producers.size()];
            for(int k = 0; k < producers.size(); k++){
                for (int j = 0; j < products.length; j++) {
                    if(producers.get(k).equals(products[j].getProductManufacturer())){
                        index[k]++;
                    }
                }
            }

            String bestProducer = null;
            for(int i = 0; i < index.length; i++){
                for (int j = 0; j < i; j++) {
                    if(index[i] > index[j]){
                        bestProducer = producers.get(i);
                    }
                }
                return  bestProducer;
        }
    }

*/



}

