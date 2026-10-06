package ro.uvt.info.lab1sp;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }

    @Override
    public void add(Element element) {
        // Frunză: nu poate conține alte elemente
    }

    @Override
    public void remove(Element element) {
        // Frunză: nu poate conține alte elemente
    }

    @Override
    public Element get(int index) {
        return null;
    }
}
