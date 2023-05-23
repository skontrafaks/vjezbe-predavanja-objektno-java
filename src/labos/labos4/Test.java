package labos.labos4;

public class Test {

    public static void main(String[] args) {
        String filePath = "src/labos/labos4/quotes.txt"; // u labosu samo quetes.txt
        QUOTEREADER.readDataFromFile(filePath);
        QUOTEREADER.listAllQuotes();
    }
}
