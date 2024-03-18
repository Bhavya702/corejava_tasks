package task1;

public class Course {
	
			private int courseid;
		   private String coursename;
		    private int courseduaration;
			public Course(int courseid, String coursename, int courseduaration) {
				super();
				this.courseid = courseid;
				this.coursename = coursename;
				this.courseduaration = courseduaration;
			}
			public int getCourseid() {
				return courseid;
			}
			public void setCourseid(int courseid) {
				this.courseid = courseid;
		}
			public String getCoursename() {
				return coursename;
			}
			public void setCoursename(String coursename) {
				this.coursename = coursename;
			}
			public int getCourseduaration() {
				return courseduaration;
			}
			public void setCourseduaration(int courseduaration) {
				this.courseduaration = courseduaration;
			}
			@Override
			public String toString() {
				return "Course [courseid=" + courseid + ", coursename=" + coursename + ", courseduaration="
						+ courseduaration + "]";
			}
			

	


}
