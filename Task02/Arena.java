package meserakov_misha.Task02;

import java.io.Serializable;

public class Arena implements Serializable {
private static final long serialVersionUID = 1L;
    private double y;
    private double x;

public Arena() {
    x = .0;
    y = .0;
}

public Arena(double x, double y) {
    this.x = x;
    this.y = y;
}


public double setX(double x) {
    return this.x = x;
}


public double getX() {
    return x;
}


public double setY(double y) {
    return this.y = y;
}


public double getY() {
    return y;
}


public Arena setXY(double x, double y) {
    this.x = x;
    this.y = y;
    return this;
}
}