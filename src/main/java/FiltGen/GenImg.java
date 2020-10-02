package FiltGen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class GenImg extends FileGenerator {

    public static void genImg(String nameFile, String size, String format, int width, int height) throws IOException {

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawString(nameFile, 0, 20);
        g2d.drawString(size + "мб", 0, 60);
        g2d.dispose();
        File file = new File(PATHCREATE + nameFile + "." + format);
        ImageIO.write(bufferedImage, format, file);

        RandomAccessFile randomAccessFile = new RandomAccessFile(PATHCREATE + nameFile + "." + format, "rw");
        randomAccessFile.setLength(FileGenerator.convertByte(size));
        randomAccessFile.close();
    }
}
