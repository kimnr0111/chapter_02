package com.javaex.ex12;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on) {
		if(power == true) {
			this.power = false;
		} else {
			this.power = true;
		}
		
	}
	
	public void channel(int channel) {
		if(channel>=1 && channel<=255) {
			this.channel = channel;
		}
	}
	
	public void channel(boolean up) {
		if(up == true) {
			channel(this.channel+1);
		} else {
			channel(this.channel-1);
		}
	}
	
	public void volume(int volume) {
		if(volume>=0 && volume<=100) {
			this.volume = volume;
		}
	}
	
	public void volume(boolean up) {
		if(up == true) { 
			volume(this.volume+1);
		} else {
			volume(this.volume-1);
		}
	}
	
	
	public void status() {
		//System.out.println("채널:" + getChannel() + "번 " + " " + " 음량:" + getVolume() + " " + " 전원:" + isPower());
		System.out.println("채널:" + channel + "번 " + " " + " 음량:" + volume + " " + " 전원:" + power);
	}

	

}
