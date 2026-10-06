package ro.uvt.info.lab1sp;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println(" right " + paragraph.getText());
    }
}