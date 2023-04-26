package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class chess extends GraphicalObject {

    String picture;
    int x;
    int y;
    int width;
    int height;

    public chess(){
        x = 0;
        y = 0;
        width = 50;
        height = 50;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(0,0,0));
        drawTool.drawFilledRectangle(x, y, width, height);
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledRectangle();
    }
}
