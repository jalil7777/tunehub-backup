package com.kodnest.tunehub.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.Entity.Song;
import com.kodnest.tunehub.Repository.SongRepository;
import com.kodnest.tunehub.Service.SongService;
@Service
public class SongServiceImpl implements SongService{
	@Autowired
	SongRepository songRepository;
	
	public String addSong(Song song) {
	songRepository.save(song);
	return "SONG ADD SUCCESSFULLY";
}

	@Override
	public boolean songExists(String name) {
		Song song=songRepository.findByName(name);
		if(song==null) {
			return false;
		}
		else {
			return true;
		}
			
	}

	@Override
	public List<Song> fetchAllSongs() {
		List<Song> songs=songRepository.findAll();
		return songs;
	}

	public void updateSong(Song s) {
		// TODO Auto-generated method stub
		songRepository.save(s);
		
	}
}
