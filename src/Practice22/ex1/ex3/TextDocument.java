package Practice22.ex1.ex3;
import java.io.IOException;

class TextDocument implements IDocument {
    public TextDocument() {
        try {
            Process rs = Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
