package Ноябрь_27.resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class ResourceFr extends ListResourceBundle {
    private static final Object[][]contents =
            {
                    {"somevalue", "Is France"},
                    {"backgroundColor", Color.black},
                    {"defaultPaperSize", new double[]{210, 297}}
            };

    @Override
    public Object[][] getContents() {
        return contents;
    }
}
