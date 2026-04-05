package Nested_Classes;

// LOGIC TEST -----------
class Playlist {
    String[] songs = new String[10];
    int count = 0;

    void addSong(String name) {
        if (count < songs.length) {
            songs[count] = name;
            count++;
        } else {
            System.out.println("Playlist is full!");
        }
    }

    class Player {
        int currentIndex;
        
        boolean hasNext() {
            return currentIndex < count;
        }

        void playNext() {
            if (hasNext()) {
                System.out.println("Playing: " + songs[currentIndex]);
                currentIndex++;
            } else {
                System.out.println("No more songs.");
            }
        }
    }
}
public class NSIC_practice3 {
    public static void main(String[] args) {
        Playlist p = new Playlist();

        // Adding 4 songs
        p.addSong("Song 1");
        p.addSong("Song 2");
        p.addSong("Song 3");
        p.addSong("Song 4");

        // Create Player
        Playlist.Player player = p.new Player();

        // Play songs using while loop
        while (player.hasNext()) {
            player.playNext();
        }
    }
}
