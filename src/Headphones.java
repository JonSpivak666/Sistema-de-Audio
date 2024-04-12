public class Headphones implements AudioDevice {
    @Override
    public void play() {
        System.out.println("Playing audio through headphones...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio through headphones...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio through headphones...");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Setting volume to " + level + " on headphones...");
    }
}
