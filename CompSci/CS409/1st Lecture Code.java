public static void main(String args[]){
    System.out.println("Heeewo :3");
}


// This is the inrerface for the iterator
public interface playListIterator{
    boolean hasnext();
    String next();
}
public interface MediaPlaylist{
    playListIterator createIterator(String s);
}

/**
 * Whats the benefit of using interfaces is so 
 */