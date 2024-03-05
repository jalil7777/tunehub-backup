package com.kodnest.tunehub.Service;

import java.util.List;

import com.kodnest.tunehub.Entity.Playlist;



public interface PlaylistService {

	public void addplaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();


}