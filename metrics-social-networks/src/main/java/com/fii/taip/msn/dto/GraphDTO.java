package com.fii.taip.msn.dto;

import java.util.List;

public class GraphDTO {

	private List<NodeDTO> nodes;
	private List<EdgeDTO> edges;
	
	public List<NodeDTO> getNodes() {
		return nodes;
	}
	public void setNodes(List<NodeDTO> vertices) {
		this.nodes = vertices;
	}
	public List<EdgeDTO> getEdges() {
		return edges;
	}
	public void setEdges(List<EdgeDTO> edges) {
		this.edges = edges;
	}
	
	
}
