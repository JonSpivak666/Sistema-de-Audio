public class Speaker implements AudioDevice {
    @Override
    public void play() {
        System.out.println("Playing audio through speakers...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio through speakers...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio through speakers...");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Setting volume to " + level + " on speakers...");
    }
}
