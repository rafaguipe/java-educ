/******************************************************************************
 *  Compilation:  javac Rainbow.java 
 *  Execution:    java Rainbow N
 *  Dependencies: StdDraw.java
 *
 *  Use Monte Carlo simulation to plot a rainbow according to the
 *  physical laws of reflection and refraction.
 *
 *  % java Rainbow 100000
 *
 ******************************************************************************/

import java.awt.Color;

public class Rainbow { 

    public static void main(String[] args) { 

        int N = Integer.parseInt(args[0]);
        int SIZE = 1000;
        StdDraw.setCanvasSize(SIZE, SIZE/2);
        StdDraw.setXscale(0, SIZE);
        StdDraw.setYscale(0, SIZE/2.0);
        StdDraw.enableDoubleBuffering();

        // sky blue background
        Color skyblue = new Color(48, 144, 199);
        StdDraw.clear(skyblue);

        // simulate N incident light rays
        for (int i = 0; i < N; i++) {

            // generate random (x, y) uniformly in unit circle centered at (0, 0)
            double r = Math.random();                       // impact parameter
            double theta = Math.random() * 2 * Math.PI;     // between 0 and 2*pi
            double x = Math.sqrt(r) * Math.sin(theta);
            double y = Math.sqrt(r) * Math.cos(theta);

            float c  = (float) Math.random();               // random hue of rainbow
            double n = 1.33 + 0.06 * c;                     // refraction index

            double thetaI = Math.asin(r);                   // angle of incidence
            double thetaR = Math.asin(r / n);               // angle of refraction
            double thetaP = 4*thetaR - 2*thetaI;            // primary rainbow angle
            double thetaS = 6*thetaR - 2*thetaI - Math.PI;  // secondary rainbow angle

            // intensities of principle and secondary 
            double p = Math.pow(Math.sin(thetaI - thetaR) / Math.sin(thetaI + thetaR), 2);
            double s = Math.pow(Math.tan(thetaI - thetaR) / Math.tan(thetaI + thetaR), 2);
            double intensityP = 0.5 * (  s*(1-s)*(1-s) +   p*(1-p)*(1-p));
            double intensityS = 0.5 * (s*s*(1-s)*(1-s) + p*p*(1-p)*(1-p));

            // plot primary rainbow
            float saturation = (float) Math.min(intensityP / 0.04, 1.0);
            StdDraw.setPenColor(Color.getHSBColor(c, saturation, 1.0f));
            double xp = (SIZE/2.0 * thetaP * 3 / Math.PI * x / r) + SIZE / 2.0;
            double yp = (SIZE/2.0 * thetaP * 3 / Math.PI * Math.abs(y) / r);
            StdDraw.point(xp, yp);

            // plot secondary rainbow
            saturation = (float) Math.min(intensityS / 0.02, 1.0);
            StdDraw.setPenColor(Color.getHSBColor(c, saturation, 1.0f));
            double xs = ( SIZE/2.0 * thetaS * 3 / Math.PI * x / r) + SIZE / 2.0;
            double ys = (-SIZE/2.0 * thetaS * 3 / Math.PI * Math.abs(y) / r);
            StdDraw.point(xs, ys);

            // display every 1000 iterates
            if (i % 1000 == 0) {
                StdDraw.show();
                StdDraw.pause(10);
            }
        }

        StdDraw.show();
    }

}