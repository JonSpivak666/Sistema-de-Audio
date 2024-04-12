public class Main {
    public static void main(String[] args) {
        //instancias de dispositivos de audio
        AudioDevice speakers = new Speaker();
        AudioDevice headphones = new Headphones();
        AudioDevice bluetoothSpeakers = new BluetoothSpeaker();

        // instancias de BasicMediaPlayer usando diferentes dispositivos de audio
        BasicMediaPlayer player1 = new BasicMediaPlayer(speakers);
        BasicMediaPlayer player2 = new BasicMediaPlayer(headphones);
        BasicMediaPlayer player3 = new BasicMediaPlayer(bluetoothSpeakers);

        // Probar reproducción de música y video con diferentes dispositivos
        System.out.println("Testing Speaker:");
        player1.playMusic();
        player1.playVideo();
        player1.pauseMusic();

        System.out.println("\nTesting Headphones:");
        player2.playMusic();
        player2.playVideo();
        player2.pauseMusic();

        System.out.println("\nTesting Bluetooth Speaker:");
        player3.playMusic();
        player3.playVideo();
        player3.pauseMusic();

        // Cambio de dispositivo de audio en tiempo de ejecución
        System.out.println("\nChanging device on player1 to Bluetooth Speaker:");
        player1.changeAudioDevice(bluetoothSpeakers);
        player1.playMusic();
    }
}
