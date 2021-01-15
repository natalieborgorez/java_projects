// code by Natalie Borgorez

package fan;

class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 6;
    String color = "yellow";

    public Fan() {

    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        if (on)
        this.speed = speed;

    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (on)
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (on)
        this.color = color;
    }

    public String toString() {
        if (on ) {
            return "The speed of this fan is "+speed+ "; the colour is "+color+ "; the radius is " +radius;
        } else
            return "This fan is off;"+" The colour is "+color+ "; the radius is "+radius;
    }

}

public class TestFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1 = new Fan();

        fan.setOn(true);
        fan.setSpeed(Fan.FAST);
        fan.setRadius(5);
        fan.setColor("red");


        System.out.println(fan.toString());

        fan1.setOn(false);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(6);
        fan1.setColor("yellow");


        System.out.println(fan1.toString());
    }
}

// Code by Natalie Borgorez
