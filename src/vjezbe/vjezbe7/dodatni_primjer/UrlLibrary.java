package vjezbe.vjezbe7.dodatni_primjer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class UrlLibrary {

    private ArrayList<String> htmlOfUrls = new ArrayList<>();

    public void addUrl(String url) {
        try {
            URL urlObject = new URL(url);
            BufferedReader br = new BufferedReader(new InputStreamReader(urlObject.openStream()));
            String line;
            String htmlString = "";
            while ((line = br.readLine()) != null) {
                htmlString += line + "\n";
            }
            htmlOfUrls.add(htmlString);
            System.out.println("Added from-" + url + "- to html.");

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String> getHtmlOfUrls() {
        return htmlOfUrls;
    }
}
