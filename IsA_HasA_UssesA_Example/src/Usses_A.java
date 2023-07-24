class Printer {
    void print(String text) {
        System.out.println("Printing: " + text);
    }
}

class Document {
    void generateDocument() {
        Printer printer = new Printer();
        printer.print("Sample document");
    }
}

public class Usses_A {
    public static void main(String[] args) {
        Document document = new Document();
        document.generateDocument(); // Output: Printing: Sample document
    }
}
