package AWT;/*Буфер обмена, копирование картинок*/

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class AWT_16 {
    public static void main(String[] args) throws  Exception {
        /*Далее после установки всех методов в классе
        * ImageTransferable, создаем буфер и получаем из него информацию:*/
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Image image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = image.getGraphics();
        graphics.fillOval(0,0,100,100);
        ImageTransferable im = new ImageTransferable(image);
        clipboard.setContents(im, null);

        DataFlavor dataFlavor = DataFlavor.stringFlavor;
        if (clipboard.isDataFlavorAvailable(dataFlavor)){
            Image image1 = (Image)clipboard.getData(dataFlavor);
        }

    }
}
/*Для того что бы скопировать изображение, нам
* понадобиться класс transferable (переносимый),
* который нам позволит перенести нашу кртинку в буфер обмена.
* Создадим:*/
class ImageTransferable implements Transferable {
    private Image theImage;
    public ImageTransferable (Image image){
        theImage = image;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[]{DataFlavor.imageFlavor};
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return dataFlavor.equals(DataFlavor.imageFlavor);
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException {
        if (dataFlavor.equals(DataFlavor.imageFlavor)){
            return  theImage;
        }
        else {
            throw new UnsupportedFlavorException(dataFlavor);
        }
    }
}
