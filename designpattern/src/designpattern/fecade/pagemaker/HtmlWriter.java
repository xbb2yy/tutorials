package designpattern.fecade.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    public void title(String title) throws IOException {
        writer.write("<html><head><title>");
        writer.write(title);
        writer.write("</title></head><body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>\n");
    }

    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailTo(String addr, String user) throws IOException {
        link("mailto:" + addr, user);
    }

    public void close() throws IOException {
        writer.write("</body></html>\n");
        writer.close();
    }


}
