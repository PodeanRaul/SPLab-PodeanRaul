package ro.uvt.info.lab1sp;

public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Table: " + title);
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
