package simulation;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        GUI gui = new GUI();

        double deltaT = 0.01;
        Objekt Ball = new Objekt(new double[] { 0.0, 100.0 }, new double[] { 0.0, 0.0 }, new double[] { 0.0, -9.81 },
                "Ball1");

        for (int i = 0; i < 100; i++) {
            Ball.EulerSchritt(deltaT);
            System.out.println("x: " + Ball.get_x() + " y: " + Ball.get_y());
            gui.updateGUI(i);
            Thread.sleep(10);
        }
    }
}