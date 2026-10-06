package ro.uvt.info.lab1sp;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("Image with name:" + url);
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
