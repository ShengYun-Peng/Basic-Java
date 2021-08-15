package chap12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);
        String urlString = input.next();

        // url: http://liveexample.pearsoncmg.com/data/Lincoln.txt  1469 characters
        try {
            URL url = new URL(urlString);
            Scanner webpage = new Scanner(url.openStream());
            int count = 0;
            while (webpage.hasNext()) {
                String line = webpage.nextLine();
                count += line.length();
                System.out.println(line);
            }
            System.out.println("Total characters: " + count);
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("No such file");
            System.out.println(ex);
        }
    }
}
