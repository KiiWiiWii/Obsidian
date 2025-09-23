public static void main(String args[]){

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
    
}

/**
 * The benefit of using interfaces is so we can toss different data
 * types at it and it'll still work. They can also be manipulated and
 * changeed. I cant fucking hear the lecturer!!!
 */