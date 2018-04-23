package AWT;/*Печать Graphics2D объектов*/

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class AWT_12 {
    public static void main(String[] args) throws  Exception {
        Printable printable = new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int i) throws PrinterException {
                if (i == 0){
                    Graphics2D graphics2D = (Graphics2D)graphics;
                    Line2D line2D = new Line2D.Double(0,0,200,200);
                    graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY()); //чтоб не уходило за пределы экрана.
                    graphics2D.draw(line2D);
                    return PAGE_EXISTS; //если страница не последняя то печатаем дальше.
                }
                return  NO_SUCH_PAGE; //страницы отсутствуют.
            }
        };
        PrinterJob job = PrinterJob.getPrinterJob(); //получаем рабочий принтер, т.е получаем доступ к реально существующим принтерам.
        job.setPrintable(printable); //устанавливаем на принтер наши значения.
        if (job.printDialog()){
            job.print(); //печатаем.
        }
    }
}
