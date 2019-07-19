import java.util.HashSet;
import java.util.Set;

/*
A playlist is considered a repeating playlist if any of the songs 
containa reference to a previous song in the playlist.
Otherwise, the playlist will end with the last song which points to null.

Implement a function isRepeatingPlaylist that, efficiently with respect to time used, returns true if a playlist is repeating or false if it is not.

For example, the following code prints "true" as both songs point to each other.

Song first = new Song("Hello");
Song second = new Song("Eye of the tiger");
    
first.setNextSong(second);
second.setNextSong(first);
    
System.out.println(first.isRepeatingPlaylist());
*/


public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
    	Set<String> songnames = new HashSet<String>();
    	Song next = this;
    	while(next !=null) {
    		if(songnames.contains(next.name)) return true;
    		else {

    			songnames.add(next.name);
    			next = next.nextSong;
    		}
    	}
    	
    	return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
        //Song third = new Song("Hymn for the weekend");

        first.setNextSong(second);
        second.setNextSong(first);
        //third.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}