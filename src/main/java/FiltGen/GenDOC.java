package FiltGen;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class GenDOC extends FileGenerator {


    public static void genDoc(String fileName, String text, String size) {

        try {
            File file = new File(fileName);
            FileOutputStream fos = new FileOutputStream(PATHCREATE + fileName + ".docx");

            XWPFDocument doc = new XWPFDocument();
            XWPFParagraph tempParagraph = doc.createParagraph();
            XWPFRun tempRun = tempParagraph.createRun();
            tempRun.setText(text);
            tempRun.setFontSize(12);
            doc.write(fos);
            fos.close();
            System.out.println(file.length());
            RandomAccessFile randomAccessFile = new RandomAccessFile(PATHCREATE + fileName + ".docx", "rw");
            randomAccessFile.setLength(FileGenerator.convertByte(size));

        } catch (Exception e) {

        }

    }


}
