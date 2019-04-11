package com.xubing.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

public class PdfSplit {

    public static void main(String[] args) throws Exception{
        InputStream inputStream =new FileInputStream("E:\\WordSpace\\tutorials\\java\\src\\main\\java\\com\\xubing\\pdf\\bb.pdf");
        FileOutputStream outputStream = new FileOutputStream("E:/a.pdf");
        splitPDF(inputStream, outputStream, 1, 1);
    }

    public static void splitPDF(InputStream inputStream,
                                OutputStream outputStream, int fromPage, int toPage) {
        Rectangle rect = new Rectangle(PageSize.A4);
        Document document = new Document(rect);
        try {
            PdfReader.unethicalreading = true;
            PdfReader inputPDF = new PdfReader(inputStream);
            int totalPages = inputPDF.getNumberOfPages();
            System.out.println(totalPages);

            // Create a writer for the outputstream
            PdfWriter writer = PdfWriter.getInstance(document, outputStream);
            document.open();
            PdfContentByte cb = writer.getDirectContent();
            // Holds the PDF data
            writer.
            PdfImportedPage page = writer.getImportedPage(inputPDF, 1);
            document.newPage();
            cb.addTemplate(page, 0, 0);

            document.newPage();
            cb.addTemplate(page, -PageSize.A4.getWidth(), 0);

            outputStream.flush();
            document.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen())
                document.close();
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
