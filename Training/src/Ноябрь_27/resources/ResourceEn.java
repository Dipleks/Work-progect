package Ноябрь_27.resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class ResourceEn extends ListResourceBundle {
    private static final Object[][]contents =
            {
                    {"somevalue", "Is English"},
                    {"backgroundColor", Color.black},
                    {"defaultPaperSize", new double[]{210, 297}}
            };

    @Override
    public Object[][] getContents() {
        return contents;
    }
}