package main;

import country.AllCountries;
import country.Country;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by СЕВАК on 09.04.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("countries.csv");

        AllCountries countries = new AllCountries();
        countries.setCountries(file);
        countries.sort();
    }
}
