package org.pregen.hsqldb;

// Generated Jul 16, 2012 4:51:41 PM by Hibernate Tools 4.0.0

/**
 * Kunde generated by hbm2java
 */
public class Kunde implements java.io.Serializable {

	private long id;
	private String art;

	public Kunde() {
	}

	public Kunde(long id, String art) {
		this.id = id;
		this.art = art;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArt() {
		return this.art;
	}

	public void setArt(String art) {
		this.art = art;
	}

}
