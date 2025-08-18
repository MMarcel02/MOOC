
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Song song) {
        if (this == song) {
            return true;
        }

        if (!(song instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) song;
        if (name.equals(comparedSong.name) &&
            durationInSeconds == comparedSong.durationInSeconds &&
            artist.equals(comparedSong.artist)) {
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
