package util;

import java.io.File;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@JsonPropertyOrder(
//		value= {
//				"teamSize",
//				"createdBy",
//				"status",
//				"projectName"
//				
//		})
//
//@JsonIgnoreProperties(
//		value={
//			"createdBy"
//		},allowSetters = true)
public

class Project{
	//POJO CLASS plain old java object
	private String projectName;
	private String createdBy;
	@JsonProperty(value="team Size")
	private  int teamSize;
	private String status;
	
	public Project()
	{
		
	}
	public Project(String projectName, String createdBy, int teamSize, String status) {
		
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		

	
}



