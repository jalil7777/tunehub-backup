package com.kodnest.tunehub.Service;

import java.util.List;

import com.kodnest.tunehub.Entity.Song;

public interface SongService {

	public String addSong(Song song);

	public boolean songExists(String name);

	public List<Song> fetchAllSongs();


	public void updateSong(Song s);

	

}
