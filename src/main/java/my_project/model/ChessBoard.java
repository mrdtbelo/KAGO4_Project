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
        width = 100;
        height = 100;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(0, 0, 0));
        for ( int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(i % 2 == 0) {
                    drawTool.drawFilledRectangle(j*200,i*100,width,height);
                } else {
                    drawTool.drawFilledRectangle(100+ j*200,i*100,width,height);
                }
            }
        }
    }
}
