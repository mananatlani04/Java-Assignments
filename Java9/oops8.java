import java.util.ArrayList;
import java.util.Scanner;

class TrafficLight {
    private String color;
    private int duration;
    ArrayList<TrafficLight> lights = new ArrayList<TrafficLight>();

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public TrafficLight() {}

    public String getLightDetails() {
        return color + " : " + duration + " seconds";
    }

    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
    }

    public void checkColor() {
        if (color.equalsIgnoreCase("Red")) {
            System.out.println("Stop! It's Red.");
        } else if (color.equalsIgnoreCase("Green")) {
            System.out.println("Go! It's Green.");
        } else {
            System.out.println("Caution! It's " + color + ".");
        }
    }

    public void addLight(TrafficLight light) {
        lights.add(light);
    }

    public void removeLight(TrafficLight light) {
        lights.remove(light);
    }

    public void displayLights() {
        for (TrafficLight light : lights) {
            System.out.println(light.getLightDetails());
        }
    }
}

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TrafficLight t1 = new TrafficLight("Red", 60);
        TrafficLight t2 = new TrafficLight("Green", 45);
        TrafficLight t3 = new TrafficLight("Yellow", 15);

        TrafficLight system = new TrafficLight();
        system.addLight(t1);
        system.addLight(t2);
        system.addLight(t3);

        system.displayLights();
        t1.checkColor();
        t2.checkColor();
        t3.checkColor();

        System.out.println("-------------------------------------");
        t3.changeColor("Green", 30);
        t3.checkColor();
        system.displayLights();
    }
}