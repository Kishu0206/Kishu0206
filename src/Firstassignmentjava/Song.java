package Firstassignmentjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    private String name;
    private String artist;
    private String album;
    private int duration;

    public Song(String name, String artist, String album, int duration) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", duration=" + duration +
                '}';
    }
}

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added song: " + song.getName() + " to playlist: " + name);
    }

    public void removeSong(Song song) {
        if (songs.remove(song)) {
            System.out.println("Removed song: " + song.getName() + " from playlist: " + name);
        } else {
            System.out.println("Song: " + song.getName() + " not found in playlist: " + name);
        }
    }

    public void play() {
        System.out.println("Playing playlist: " + name);
        for (Song song : songs) {
            System.out.println("Now playing: " + song.getName() + " - " + song.getArtist());
        }
    }
}

class MusicStreamingService {
    private List<Playlist> playlists;

    public MusicStreamingService() {
        this.playlists = new ArrayList<>();
    }

    public void createPlaylist(String name) {
        Playlist playlist = new Playlist(name);
        playlists.add(playlist);
        System.out.println("Created playlist: " + name);
    }

    public void addSongToPlaylist(String playlistName, Song song) {
        Playlist playlist = findPlaylistByName(playlistName);
        if (playlist != null) {
            playlist.addSong(song);
        } else {
            System.out.println("Playlist: " + playlistName + " not found.");
        }
    }

    public void removeSongFromPlaylist(String playlistName, Song song) {
        Playlist playlist = findPlaylistByName(playlistName);
        if (playlist != null) {
            playlist.removeSong(song);
        } else {
            System.out.println("Playlist: " + playlistName + " not found.");
        }
    }

    public void playPlaylist(String playlistName) {
        Playlist playlist = findPlaylistByName(playlistName);
        if (playlist != null) {
            playlist.play();
        } else {
            System.out.println("Playlist: " + playlistName + " not found.");
        }
    }

    private Playlist findPlaylistByName(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(playlistName)) {
                return playlist;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MusicStreamingService streamingService = new MusicStreamingService();

        // Create playlists
        streamingService.createPlaylist("Favorites");
        streamingService.createPlaylist("Workout");

        // Create songs
        Song song1 = new Song("Song 1", "Artist 1", "Album 1", 180);
        Song song2 = new Song("Song 2", "Artist 2", "Album 2", 240);
        Song song3 = new Song("Song 3", "Artist 3", "Album 3", 200);
        Song song4 = new Song("Song 4", "Artist 4", "Album 4", 210);

        // Add songs to playlists
        streamingService.addSongToPlaylist("Favorites", song1);
        streamingService.addSongToPlaylist("Favorites", song2);
        streamingService.addSongToPlaylist("Workout", song3);

        // Remove a song from a playlist
        streamingService.removeSongFromPlaylist("Favorites", song2);

        // Play a playlist
        streamingService.playPlaylist("Favorites");
    }
}

//Remove the character from the playList ("Sendkey","addSongsToplaylist)
//streaming the character playList (Stream.sendKeys)
//External the charcter playlist (stream.visualtreat)
//External the character playlist (stream.visual)
//External the character playlist ("Sendkeys).(stream.h)
//External the character playlist ("Sendkeys.stream)
//External character playlist ("Sendkeys.stream)
//playlist playPlaylist("sendkeys.stream)
//playlist playPlaylist("sendKeys.stram)
//
