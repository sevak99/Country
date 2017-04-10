package country;

import java.util.Comparator;

/**
 * Created by СЕВАК on 09.04.2017.
 */
public class Country {

    private static int n = 1;
    private int id;
    private String countryCode;
    private String englishName;
    private String franchName;

    public Country(String countryCode, String englishName, String franchName) {
        id = n++;
        this.countryCode = countryCode;
        this.englishName = englishName;
        this.franchName = franchName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id).append(". ")
                .append(countryCode).append(", ")
                .append(englishName).append(", ")
                .append(franchName);
        return builder.toString();
    }

    public static class Comparator1 implements Comparator <Country> {

        @Override
        public int compare(Country o1, Country o2) {
            return o1.countryCode.compareTo(o2.countryCode);
        }
    }
    public static class Comparator2 implements Comparator <Country> {

        @Override
        public int compare(Country o1, Country o2) {
            return o1.englishName.compareTo(o2.englishName);
        }
    }
    public static class Comparator3 implements Comparator <Country> {

        @Override
        public int compare(Country o1, Country o2) {
            return o1.franchName.compareTo(o2.franchName);
        }
    }
}
