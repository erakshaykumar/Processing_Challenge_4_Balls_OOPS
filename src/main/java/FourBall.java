import processing.core.PApplet;

import java.util.ArrayList;

public class FourBall extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int INITIAL_X_POS = 0;
    public static final int DIAMETER = 10;
    ArrayList<Ball> Balls=new ArrayList<>();


    public static void main(String[] args) {
        PApplet.main("FourBall",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

        for(int i=1;i<=4;i++){
            Ball b=new Ball(INITIAL_X_POS,(i*HEIGHT/5), DIAMETER,i);
            Balls.add(b);
            drawBall(b);
        }


    }

    public void drawBall(Ball b){

            ellipse(b.getxPos(),b.getyPos(),b.getDiameter(),b.getDiameter());


    }

    @Override
    public void draw() {

        for(int i=1;i<=4;i++){
            Ball b=Balls.get(i-1);
            drawBall(b);
            b.moveX();
        }

    }
}
