
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared){
        Song song = (Song) compared;
        return this.artist.equals(song.getArtist())
                && this.name.equals(song.getName())
                && this.durationInSeconds == song.getDuration();
    }
    
    
    
    public String getArtist(){
        return this.artist;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDuration(){
        return this.durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
