package com.patrick.model;

public class Package {
    private Content content;
    private Color color;
    private Dimension dimension;
 public Package(Content content, Color color, Dimension dimension) {
		// TODO Auto-generated constructor stub
	}
Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	@Override
	public String toString() {
	    return "This is the package: [Content: " + this.content + ", Color: " + this.color + ", Dimensions: " + this.dimension + "]";
	}

}