import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class StudentTest {


    @Test
    public void testGetId() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(95);
        grades.add(100);
        Student firstStudent = new Student(1, "oscar", grades);
        assertEquals(firstStudent.id, firstStudent.getId());
}

    @Test
    public void testGetName() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(95);
        grades.add(100);
        Student firstStudent = new Student(1, "oscar", grades);
        assertEquals(firstStudent.name, firstStudent.getName());
    }

    @Test
    public void testAddGrade() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(95);
        grades.add(100);
        Student firstStudent = new Student(1, "oscar", grades);

    }

    @Test
    public void testGetGrade() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(95);
        grades.add(100);
        Student firstStudent = new Student(1, "oscar", grades);
        assertEquals(firstStudent.grades, firstStudent.getGrades());
    }


    @Test
    public void testGradeAverage() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(95);
        grades.add(100);
        Student firstStudent = new Student(1, "oscar", grades);
        assertEquals(95, firstStudent.getGradeAverage(), 0.01);
    }



}
