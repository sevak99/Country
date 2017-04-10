package country;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by СЕВАК on 09.04.2017.
 */
public class AllCountries {
    private ArrayList<Country> countries;

    public AllCountries() {
        countries = new ArrayList<>();
    }

    public void setCountries(File file) throws IOException {
        String string;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while ((string = bufferedReader.readLine()) != null) {
            String[] str = string.split(",");
            countries.add(new Country(str[0], str[1], str[2]));
        }
    }

    public void sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1, 2 or 3: ");
        Comparator<Country> countryComparator;
        bb:
        for(;;) {
            aa:
            switch (scanner.nextInt()) {
                case 1:
                    countryComparator = new Country.Comparator1();
                    break bb;
                case 2:
                    countryComparator = new Country.Comparator2();
                    break bb;
                case 3:
                    countryComparator = new Country.Comparator3();
                    break bb;
                default:
                    System.out.print("Warning:\nEnter 1, 2 or 3: ");
                    break aa;
            }
        }

        Collections.sort(countries, countryComparator);
        printCountries();
    }

    public void printCountries() {
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
