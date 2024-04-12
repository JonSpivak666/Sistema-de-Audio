public class BasicMediaPlayer implements MusicPlayer, VideoPlayer {
    private AudioDevice audioDevice;

    public BasicMediaPlayer(AudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    public void changeAudioDevice(AudioDevice newDevice) {
        this.audioDevice = newDevice;
        System.out.println("Audio device changed.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
        audioDevice.play();
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music...");
        audioDevice.pause();
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
        audioDevice.play();
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausing video...");
        audioDevice.pause();
    }
}
