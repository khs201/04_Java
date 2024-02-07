package edu.kh.poly.pack1.model.dto;

public class Iphone extends SmartPhone {

	private int iosVersion; // IOS 운영체제 버전

	public int getIosVersion() {
		return iosVersion;
	}

	public void setIosVersion(int iosVersion) {
		this.iosVersion = iosVersion;
	}

	public Iphone() {
	}

	public Iphone(int iosVersion) {
		super();
		this.iosVersion = iosVersion;
	}

	public Iphone(String display, String newsAgency, String ap, int iosVersion) {
		super(display, newsAgency, ap);
		this.iosVersion = iosVersion;
	}

	@Override
	public String toString() {
		return "IOS Version : " + iosVersion + " / " + super.toString();
	}
}
