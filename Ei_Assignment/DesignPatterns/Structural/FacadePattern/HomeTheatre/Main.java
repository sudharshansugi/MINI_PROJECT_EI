public class Main {
    public static void main(String[] args) {
        // Create the subsystem components
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        // Use the facade to start and end the movie
        homeTheater.startMovie();
        homeTheater.endMovie();
    }
}
