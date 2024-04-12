public class BluetoothSpeaker implements AudioDevice {
    @Override
    public void play() {
        System.out.println("Playing audio through Bluetooth speakers...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio through Bluetooth speakers...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio through Bluetooth speakers...");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Setting volume to " + level + " on Bluetooth speakers...");
    }
}
