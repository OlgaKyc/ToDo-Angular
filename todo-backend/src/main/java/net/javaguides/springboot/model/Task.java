package net.javaguides.springboot.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long id;
	
	@Column(name = "title_column")
	private String title;
	
	@Column(name = "description_column")
	private String description;
	
	@Column(name = "due_date_column")
	private Date due_date;
	
	@Column(name = "type_column")
	private String type;
	
	public Task() {
		
	}
	
	
	public Task(String title, String description, Date due_date, String type) {
		super();
		this.title = title;
		this.description = description;
		this.due_date = due_date;
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
