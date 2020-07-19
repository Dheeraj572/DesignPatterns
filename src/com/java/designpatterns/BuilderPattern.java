package com.java.designpatterns;

public class BuilderPattern {

	public static class Builder{
		
		private String name;
		private Integer salary;
		private String designation;
		private String company;
		
		public Builder() {
			
		}
		
		public Builder name(String name) {
			this.name=name;
			return this;
			
		}
		
		public Builder salary(Integer salary) {
			this.salary = salary;
			return this;
		}
		
		public Builder designation(String designation) {
			this.designation = designation;
			return this;
		}
		
		public Builder company(String company) {
			this.company = company;
			return this;
		}
		
		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
	}
	
	private BuilderPattern(Builder builder) {
		this.name = builder.name;
		this.company= builder.company;
		this.designation = builder.designation;
		this.salary = builder.salary;
	}
	
	public BuilderPattern() {
		
	}
	
	private String name;
	private Integer salary;
	private String designation;
	private String company;
	
	
	
	
	public String getName() {
		return name;
	}
	
	public Integer getSalary() {
		return salary;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "BuilderPattern [name=" + name + ", salary=" + salary + ", designation=" + designation + ", company="
				+ company + "]";
	}
		
	
}
