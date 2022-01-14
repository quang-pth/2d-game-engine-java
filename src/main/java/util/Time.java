package util;

public class Time {
    public static float timeStarted = System.nanoTime(); // init when the application start up

    public static float getTime() {
        return (float)((System.nanoTime() - timeStarted) * 1E-9); // convert nanosecond to second
    }
}
