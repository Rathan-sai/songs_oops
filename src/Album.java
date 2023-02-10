import java.util.*;

public class Album {

    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public boolean findSong(String title)
    {
        for(Song s : songs){
            if(s.getTitle().equals(title))
            {
                return true;
            }
        }
        return false;
    }
    void addSongstoAlbum(String title, double duration){
        Song s= new Song(title, duration);
        if(findSong(s.getTitle()))
        {
            System.out.println("Song already present in album");
        }
        else{
            songs.add(s);
            System.out.println("New Song is added in the album");
        }
    }

    //polymorphism
    public void addToPlayListFromAlbum(String title, LinkedList<Song> playlist){
        if(findSong(title))
        {
            for(Song song : songs)
            {
                if(song.getTitle().equals(title))
                {
                    playlist.add(song);
                    System.out.println("Song has been added to your playlist.");
                    break;
                }
            }
        }
        else {
            System.out.println("Song is not present in the album.");
        }
        return;
    }

    public void addToPlayListFromAlbum(int trackNo, LinkedList<Song> playlist){
        int index = trackNo - 1;
        if(index > 0 && index < songs.size())
        {
            playlist.add(songs.get(index));
            System.out.println("Song has been added to your playlist.");
        }

        else {
            System.out.println("Invalid trackNO.");
        }
    }
}
