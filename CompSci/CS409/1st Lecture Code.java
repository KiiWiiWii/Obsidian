public static void main(String args[]){
    MediaPlaylist playlist;
    playlist = buildPlaylist();

    SimplePlayListIterator = simpleIterator = playlist.createIterator("simple");
    while(simpleIterator.hasNext()){
        // TODO: make it acutally do something
    }
    // Would do the same hting with the "shiffled" option if you wanted a shiffled playlist
}

// This is the inrerface for the iterator
public interface playListIterator{
    boolean hasnext();
    String next();
}
public interface MediaPlaylist{
    playListIterator createIterator(String s);
}

public class SimplePlayListIterator implements playListIterator{
    private Playlist playlist;
    private int index;
    public SimplePlayListIterator(Playlist p){
        this.playlist=p;
        this.index=0;
    }

    @java.lang.Override
    public boolean hasnext() {
        public boolean hasNext(){
            return index < playlist.getSongs().size();
        }
    }

    @java.lang.Override
    public String next() {
        return null;
    }
}

public class Playlist implements MediaPlaylist{
    private ArrayList<String> songs;
    public Playlist() {
        songs new ArrayList<>();
    }
    public void addSong(String song) {
        songs.add(song);
    }
    public PlaylistIterator crestelterator(String type) (
            switch (type) {
        case "simple":
            return new SimplePlaylistIterator(this);
        case "shuffled":
            return new ShuffledPlaylistIterator(this);
        case "favorites":
            return new Favorites PlaylistIterator(this);
        default:
            return null;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }
}


/**
 * The benefit of using interfaces is so we can toss different data
 * types at it and it'll still work. They can also be manipulated and
 * changeed. I cant fucking hear the lecturer!!!
 *
 * Gonna just do this myself cause this is scuffed but this is the basic idea of it
 */