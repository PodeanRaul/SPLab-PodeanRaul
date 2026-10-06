package ro.uvt.info.lab1sp;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getText() + "  left");
    }
}