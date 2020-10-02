package FiltGen;

import com.itextpdf.text.DocumentException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.RenderedImage;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App

{




    public static void main( String[] args ) throws IOException, DocumentException {
        GenImg.genImg("жопа","10.000001","jpeg");
        GenPDF.genPDF("Для тебя Аня 80.pdf","test LANIT","80");
        GenDOC.genDoc("Заявление на вычет01","Говно","1");
        GenTxt.genTxt("Текстовый01","LANIT TEST TXT","1");
            long m = System.currentTimeMillis();
        GenImg.genImg("5jpg","5","jpg");


//        FileGenerator.convertByte("8.000001");
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}
