// HomeTheaterFacade.java
// Facade class to simplify the interaction with the home theater system

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    // Method to start the home theater system
    public void startMovie() {
        dvdPlayer.on();
        projector.on();
        soundSystem.on();
        dvdPlayer.play();
        System.out.println("Movie is starting...");
    }

    // Method to stop the home theater system
    public void endMovie() {
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
        System.out.println("Movie has ended.");
    }
}
