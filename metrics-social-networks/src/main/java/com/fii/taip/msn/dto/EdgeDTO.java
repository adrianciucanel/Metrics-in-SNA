package com.fii.taip.msn.dto;

import java.util.Objects;

import com.fii.taip.msn.dbmodel.FacebookUser;

public class EdgeDTO {
	
	private String id;

	private String target;
	
	private String source;
	
	private String label;
	
	public EdgeDTO(String id, FacebookUser user1, FacebookUser user2) {
		this.id = id;
		this.target = user1.getId();
		this.source = user2.getId();
		this.label = String.valueOf(0);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.target, this.source);
	}
	
	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if (object == null) {
			return true;
		}
		if (this.getClass() != object.getClass()) {
			return false;
		}
		EdgeDTO edge = (EdgeDTO)object;
		return Objects.equals(this.target, edge.getFirstID()) && Objects.equals(this.source, edge.source);
	}

	public String getFirstID() {
		return target;
	}

	public void setFirstID(String firstID) {
		this.target = firstID;
	}

	public String getSecondID() {
		return source;
	}

	public void setSecondID(String secondID) {
		this.source = secondID;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
