package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        CatFactService catFactService = new CatFactService();
        List<CatFact> catFacts = catFactService.getCatFacts();

        for (CatFact catFact : catFacts) {
            System.out.println(catFact.getText());
        }
    }
}