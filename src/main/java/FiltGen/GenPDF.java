package FiltGen;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GenPDF extends FileGenerator {


    public static void genPDF(String name, String text, String size) throws DocumentException, IOException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(PATHCREATE + name));
        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk(text, font);
        document.add(chunk);
        document.close();

        RandomAccessFile randomAccessFile = new RandomAccessFile(PATHCREATE + name, "rw");
        randomAccessFile.setLength(FileGenerator.convertByte(size));


    }
}
