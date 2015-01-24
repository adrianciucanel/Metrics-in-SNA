package com.fii.taip.msn.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fii.taip.msn.dbmodel.FacebookUser;


public class NodeDTO {
	
	private String id;
	
	private String label;
	
	public static List<NodeDTO> createNodesFrom(List<FacebookUser> users) {
		List<NodeDTO> nodes = new ArrayList<NodeDTO>();
		for(FacebookUser user : users) {
			nodes.add(new NodeDTO(user));
		}
		return nodes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, label);
	}
	
	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (this.getClass() != object.getClass()) {
			return false;
		}
		NodeDTO otherNode = (NodeDTO)object;
		return Objects.equals(this.id, otherNode.getId()) &&
				Objects.equals(this.label, otherNode.getLabel());
	}
	
	public NodeDTO() {
		//no default values.
	}
	
	public NodeDTO(FacebookUser  user) {
		this.id = user.getId();
		this.label = user.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String name) {
		this.label = name;
	}
}
