package javastudy;

public class Course {

	private int id;
	private String name;
	private String type;
	private int hours;
	private Teacher teacher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", type=" + type + ", hours=" + hours + ", teacher=" + teacher
				+ "]";
	}
	
	
}