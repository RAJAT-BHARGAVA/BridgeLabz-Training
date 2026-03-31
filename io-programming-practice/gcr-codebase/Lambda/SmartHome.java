interface LightAction {
    void run();
}

public class SmartHome {

    public static void main(String[] args) {

        LightAction motion = () ->
                System.out.println("Motion detected, lights on at full brightness");

        LightAction night = () ->
                System.out.println("Night time mode, lights on at low brightness");

        LightAction voice = () ->
                System.out.println("Voice command received, ambient lighting enabled");

        activate(motion);
        activate(night);
        activate(voice);
    }

    static void activate(LightAction action) {
        action.run();
    }
}