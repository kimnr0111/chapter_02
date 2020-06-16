package com.javaex.ex09;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Song iu = new Song();
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear("2010");
		iu.setTrack(3);
		iu.setComposer("이민수");
		iu.showInfo();
		
		Song bb = new Song("BIGBANG", "거짓말", "Always", "2007", "G-DRAGON");
		bb.setTrack(2);
		bb.showInfo();
		
		
		Song bus = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", "2012", 4, "장범준");
		bus.showInfo();
	
		
		

	}

}
