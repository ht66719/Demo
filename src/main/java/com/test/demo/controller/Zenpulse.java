package com.test.demo.controller;

public class Zenpulse {

	private int id;
	private String rank;
	private int projectsCount;
	private String resourcesHead;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getProjectsCount() {
		return projectsCount;
	}

	public void setProjectsCount(int projectsCount) {
		this.projectsCount = projectsCount;
	}

	public String getResourcesHead() {
		return resourcesHead;
	}

	public Zenpulse(int id, String rank, int projectsCount, String resourcesHead) {
		super();
		this.id = id;
		this.rank = rank;
		this.projectsCount = projectsCount;
		this.resourcesHead = resourcesHead;
	}

	public void setResourcesHead(String resourcesHead) {
		this.resourcesHead = resourcesHead;
	}

}
