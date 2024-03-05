package com.kodnest.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub.Entity.Playlist;



public interface PlaylistRepository 
	extends JpaRepository<Playlist, Integer>{

}