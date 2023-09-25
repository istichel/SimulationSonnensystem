package simulation;

public class Objekt {
    private String name;
    private double[] s = new double[2];
    private double[] v = new double[2];
    private double[] a = new double[2];

    public Objekt(double[] a_beginn, String n) {

    }

    public Objekt(double[] s_beginn, double[] v_beginn, double[] a_beginn, String n) {
        for (int i = 0; i < 2; i++) {
            s[i] = s_beginn[i];
            v[i] = v_beginn[i];
            a[i] = a_beginn[i];
        }
        name = n;

    }

    public void EulerSchritt(double deltaT) {
        double[] s_new = new double[2];
        double[] v_new = new double[2];

        for (int i = 0; i < 2; i++) {
            s_new[i] = deltaT * v[i] + s[i];
            v_new[i] = deltaT * a[i] + v[i];
        }
        update(s_new, v_new);
    }

    private void update(double[] s_new, double[] v_new) {
        for (int i = 0; i < 2; i++) {
            s[i] = s_new[i];
            v[i] = v_new[i];
        }
    }

    public double[] get_pos() {
        return s;
    }

    public double get_x() {
        return s[0];
    }

    public double get_y() {
        return s[1];
    }

    public String get_name() {
        return name;
    }

}
