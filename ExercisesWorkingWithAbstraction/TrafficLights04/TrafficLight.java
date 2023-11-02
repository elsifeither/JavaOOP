package ExercisesWorkingWithAbstraction.TrafficLights04;

import ExercisesWorkingWithAbstraction.TrafficLights04.Color;

public class TrafficLight {

    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.name();
    }

    public void changeColor() {
        switch (color) {
            case RED:
                color = Color.GREEN;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
            case YELLOW:
                color = Color.RED;
                break;
        }

    }
}
