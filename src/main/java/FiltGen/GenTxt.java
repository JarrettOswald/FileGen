package FiltGen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GenTxt extends FileGenerator {


    public static void genTxt(String fileName, String text, String size) throws IOException {

        try (FileWriter writer = new FileWriter(PATHCREATE + fileName + ".txt", false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        RandomAccessFile randomAccessFile = new RandomAccessFile(PATHCREATE + fileName + ".txt", "rw");
        randomAccessFile.setLength(FileGenerator.convertByte(size));
    }
}
