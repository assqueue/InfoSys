package q3;

import java.util.ArrayList;

//starting code
public class TemperatureAlert implements Subject {
    private int temperature;
    private ArrayList<Observer> observers = new ArrayList<>();

    public TemperatureAlert() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }


    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            if (temperature > 35 || temperature < 10)
                o.update(temperature);
        }
    }
}
