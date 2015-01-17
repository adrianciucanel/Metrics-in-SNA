package com.fii.taip.msn.dto;

import java.util.ArrayList;
import java.util.List;

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
