package exercises.school;

import java.util.ArrayList;

public class Course {

    private final int courseId;
    private String courseName;
    private ArrayList<Student> roster;


    public Course(int courseId, String courseName,ArrayList<Student> roster ) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.roster = roster;

    }



    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    private void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public ArrayList getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> aRoster) {
        roster = aRoster;
    }


}
