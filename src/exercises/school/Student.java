package exercises.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private float numberOfCredits;
    private float gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, float gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String getName() {
        return name;
    }

    private void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public float getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(float aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float aGpa) {
        gpa = aGpa;
    }

    public void addGrade(Float grade, Float credits){
        float currentQualityScore = getGpa() * getNumberOfCredits();
        float newCurrentQualityScore = currentQualityScore + grade;
        float totalNumberOfCredits = getNumberOfCredits() + credits;
        float newGpa = newCurrentQualityScore/totalNumberOfCredits;

        setNumberOfCredits(totalNumberOfCredits);
        setGpa(newGpa);

    }

    public String getGradeLevel(){
        float numberOfCredits = getNumberOfCredits();
        if(numberOfCredits >= 90){
            return "Senior";
        }
        else if(numberOfCredits >= 60){
            return "Junior";
        }
        else if(numberOfCredits >= 30){
            return "Sophomore";
        }
        else{
            return "Freshman";
        }
    }

    public String toString(){
        return name + "{Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o){
        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }
}
