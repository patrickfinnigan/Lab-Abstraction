package com.patrick.model;

public class Color{
    private int red;
    private int green;
    private int blue;
	public Color(int red, int green, int blue) {
		this.red = red;
		this.blue = blue;
		this.green = green;
	}
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		this.red = red;
	}
	public int getGreen() {
		return green;
	}
	public void setGreen(int green) {
		this.green = green;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		this.blue = blue;
	}
	@Override
	public String toString() {
	    return "Color: [" + this.red + "r, " + this.green + "g, " + this.blue + "]";
	}


}