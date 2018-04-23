package MyProgram.TrainingDiary;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public interface Effects {
    DropShadow effectTeni = new DropShadow();
    ColorAdjust colorButton = new ColorAdjust();
    Rectangle rt1 = new Rectangle();
    Rectangle rt2 = new Rectangle();

    default DropShadow getEffectTeni() {
        effectTeni.setRadius(2.0);
        effectTeni.setOffsetX(6.0);
        effectTeni.setOffsetY(5.0);
        effectTeni.setColor(Color.color(0.4, 0.5, 0.5));
        return effectTeni;
    }
    default ColorAdjust getColorButton() {
        colorButton.setHue(0.8);
        colorButton.setSaturation(5.0);
        return colorButton;
    }
    default Rectangle getRt1() {
        rt1.setLayoutX(0);
        rt1.setLayoutY(290);
        rt1.setHeight(2);
        rt1.setWidth(1350);
        return rt1;
    }
    default Rectangle getRt2() {
        rt2.setLayoutX(0);
        rt2.setLayoutY(540);
        rt2.setHeight(2);
        rt2.setWidth(1350);
        return rt2;
    }
}
