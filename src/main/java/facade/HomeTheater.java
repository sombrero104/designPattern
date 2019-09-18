package facade;

/**
 * 퍼사드 패턴 (Facade Pattern)
 * 어떤 서브시스템에 대한 간단한 인터페이스를 제공하기 위한 용도.
 */
public class HomeTheater {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheater(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    /**
     * 영화를 본다.
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie..");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd();
        amplifier.setSurroundSound();
        amplifier.setVolume();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    /**
     * 영화를 끈다.
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down..");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

}
