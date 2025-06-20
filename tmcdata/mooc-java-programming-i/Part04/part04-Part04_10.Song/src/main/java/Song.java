public class Song {
    private String name;
    private int length;

    public Song(String initialName, int duration) {
        this.name = initialName;
        this.length = duration;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
