package meserakov_misha.Task02;

import java.io.Serializable;

public class Calc implements Serializable {
private double x;
private double y;
private static final long serialVersionUID = 1L;

public Calc() {
x = 0.0;
y = 0.0;
}

public Calc(double x, double y) {
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

public Calc setXY(double x, double y) {
this.x = x;
this.y = y;
return this;
}

@Override
public String toString() {
return "x=" + x + ", y=" + y;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass().equals(obj.getClass())) {
        Calc other = (Calc) obj;
        return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
    }
    return false;
}

private static final double EPSILON = 1e-10;

@Override
public int hashCode() {
    int result = 17;
    long xBits = Double.doubleToLongBits(x);
    result = 31 * result + (int) (xBits ^ (xBits >>> 32));
    long yBits = Double.doubleToLongBits(y);
    result = 31 * result + (int) (yBits ^ (yBits >>> 32));
    return result;
}

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void init(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void save() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void restore() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getCurrent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public class BinaryCount {
    public static int countOnes(int binary) {
        int count = 0;
        while (binary > 0) {
            count += binary % 2;
            binary /= 2;
        }
        return count;
    }
}

}