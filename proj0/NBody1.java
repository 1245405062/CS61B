import java.io.File;

/**
 * Created by zhangjinrong on 2018/3/15.
 */
public class NBody1 {

    public static double readRadius(String file){
        In in=new In(file);
        in.readInt();
        return in.readDouble();
    }
    public static Planet[] readPlanets(String file){
        In in=new In(file);
        int numOfPlanets=in.readInt();
        Planet[] planets=new Planet[numOfPlanets];
        in.readDouble();
        for(int i=0;i<numOfPlanets;i++){
            double xxPos=in.readDouble();
            double yyPos=in.readDouble();
            double xxVel=in.readDouble();
            double yyVel=in.readDouble();
            double mass=in.readDouble();
            String imgFileName=in.readString();
            planets[i]=new Planet(xxPos,yyPos,xxVel,yyVel,mass,imgFileName);
        }
        return planets;
    }

    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        StdDraw.picture(0, 0, "images/starfield.jpg");
        for (int i=0;i<10;i++){
            if (i==9){
                i=0;
            }
            if (i%2==0){
                StdDraw.clear();
            }else{
                StdDraw.picture(0, 0, "images/starfield.jpg");
            }
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}
