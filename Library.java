public class Library {

public static void name() {
    
// importing the FileReader class
import java.io.FileReader;

class Main {
  public static void main(String[] args) {

    char[] array = new char[100];
    try {
      // Creates a reader using the FileReader
      FileReader fr = new FileReader("mtxt");

      // Reads characters
      input.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);

      // Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();



BufferedReaderreader = new BufferedReader(...);
    List<String> unique = reader.lines()
      .flatMap(line -> Stream.of(line.split(“\\s+”)))
      .map(String::trim)
      .map(String::toLowerCase)
      .distinct()
      .sorted((w0, w1) -> w0.length() -w1.length())
      .collect(Collectors.toList())

    }
  }

// Your search of 'Tales' produces no results

// There are no books.

}
}
}
