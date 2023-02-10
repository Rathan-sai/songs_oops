import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<Album> albumList = new ArrayList<>();
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Album dsp = new Album("moos", "sib samosa");
        dsp.addSongstoAlbum("295", 4.05);
        dsp.addSongstoAlbum("ListRide", 5.5);
        dsp.addSongstoAlbum("so High", 4.55);

        Album thaman = new Album("Arijith Songs", "Arijith Singh");
        thaman.addSongstoAlbum("kesariya", 3.43);
        thaman.addSongstoAlbum("Geena Geena", 4.05);
        thaman.addSongstoAlbum("geruva", 4.44);

        albumList.add(dsp);
        albumList.add(thaman);

        System.out.println(dsp.findSong("geruva"));

        LinkedList<Song> playlist = new LinkedList<>();
        
        dsp.addToPlayListFromAlbum("295", playlist);
        dsp.addToPlayListFromAlbum(2, playlist);
    }
}