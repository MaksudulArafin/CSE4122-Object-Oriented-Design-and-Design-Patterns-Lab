public class Car implements Engine,MusicSystem {

    @Override
    public void startEngine() {
        System.out.println("Engine Started.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music.");
    }
    
}
