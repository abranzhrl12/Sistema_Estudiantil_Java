
package Controlador;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class MetodosUtilidades {
    //generar CodigoQR
   public void generarQR(String codigo, String nombreArchivo, String directorio) {
        int size = 800;
        String fileType = "png";

        QRCodeWriter qrcode = new QRCodeWriter();
        try {
            BitMatrix matrix = qrcode.encode(codigo, BarcodeFormat.QR_CODE, size, size);
            File f = new File(directorio + "/" + nombreArchivo + "." + fileType);
            int matrixWidth = matrix.getWidth();
            BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);

            Graphics2D qd = (Graphics2D) image.getGraphics();
            qd.setColor(Color.WHITE);
            qd.fillRect(0, 0, matrixWidth, matrixWidth);
            qd.setColor(Color.black);

            for (int i = 0; i < matrixWidth; i++) {
                for (int j = 0; j < matrixWidth; j++) {
                    if (matrix.get(i, j)) {
                        qd.fillRect(i, j, 1, 1);
                    }
                }
            }

            ImageIO.write(image, fileType, f);
            System.out.println("Código QR generado exitosamente en: " + f.getAbsolutePath());

        } catch (WriterException | IOException ex) {
            Logger.getLogger(MetodosUtilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
     
}
