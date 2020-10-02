package FiltGen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GenTiff {
    public void genTiff(String nameFile, String size, String PATHCREATE) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawString(nameFile, 0, 20);
        g2d.drawString(size + "мб", 0, 60);
        g2d.dispose();
        File file = new File(PATHCREATE + nameFile + "." + "tiff");
        ImageIO.write(bufferedImage, "TIFF", file);

    }
}
