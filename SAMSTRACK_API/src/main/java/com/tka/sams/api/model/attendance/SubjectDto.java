package com.tka.sams.api.model.attendance;
public class SubjectDto {
    private Long id;
    private String name;

    public SubjectDto() {
		// TODO Auto-generated constructor stub
	}

	public SubjectDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
