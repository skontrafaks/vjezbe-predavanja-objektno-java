package vjezbe.vjezbe7.dodatni_primjer;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String fileName = "src\\vjezbe\\vjezbe7\\dodatni_primjer\\html_data.txt";
        String domainGoogle = "http://www.google.com";
        String domainOracle = "https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html";

        UrlLibrary urlLibrary = new UrlLibrary();
        urlLibrary.addUrl(domainGoogle);
        urlLibrary.addUrl(domainOracle);

        write2File(fileName, urlLibrary.getHtmlOfUrls());

    }

    private static void write2File(String fileName, ArrayList<String> arrayList) {
        File file = new File(fileName);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String elem : arrayList) {
                bw.write(elem);
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
