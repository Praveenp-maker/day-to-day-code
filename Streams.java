package com.workout.dayToDay;

public class Streams {

	private int no;
	private String name;
	private String work;
	private String group;
	private boolean have;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public boolean isHave() {
		return have;
	}
	public void setHave(boolean have) {
		this.have = have;
	}
	@Override
	public String toString() {
		return "Streams [no=" + no + ", name=" + name + ", work=" + work + ", group=" + group + ", have=" + have + "]";
	}
	public Streams(int no, String name, String work, String group, boolean have) {
		super();
		this.no = no;
		this.name = name;
		this.work = work;
		this.group = group;
		this.have = have;
	}

	
	
		
		


}
