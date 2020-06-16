package com.javaex.ex09;

public class Song {
	
	String title, artist, album, composer, year;
	int track;
	
	public Song() {
		System.out.println("Song(0)");
		
	}
	
	public Song(String artist, String title, String album, String year, String composer) {
		System.out.println("Song(5)");
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.composer = composer;
	}
	
	public Song(String artist, String title, String album, String year, int track, String composer) {
		//생성자 오버로딩
		this(artist,title,album,year,composer);
		this.track = track;
		System.out.println("Song(6)");
	}
	
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	
	public void showInfo() {
		System.out.println(artist + "," + title + " ( " + album + "," + year + "," + track + "번 track" + "," + composer + " 작곡 )");
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	

}
