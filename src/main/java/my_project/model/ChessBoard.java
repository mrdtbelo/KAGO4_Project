package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class ChessBoard extends GraphicalObject {

    int width;
    int height;

    public ChessBoard(int x, int y){
        this.x = x;
        this.y = y;
        width = 50;
        height = 50;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(0, 0, 0));
        for ( int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                drawTool.drawFilledRectangle(x,y,i*width,j*height);
            }
        }
    }
}
