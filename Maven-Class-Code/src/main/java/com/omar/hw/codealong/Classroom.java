package com.omar.hw.codealong;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Classroom {

    private Teacher teacher;
    private List<Student> students;

    public Classroom(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public List<Student> findStudentsBelowAge(int age){
        return students.stream()
                .filter(student->student.getAge()<age)
                .toList();
    }

    public List<Student> getHighAchievers(double minGrade){
        return students.stream()
                .filter(student -> student.getGrade()>minGrade)
                .toList();
    }

    public List<Student> getHalfTeacherAgeStudents(){
        return students.stream()
                .filter(student -> student.getAge()<= (teacher.getAge()/2))
                .toList();
    }

    public Double calculateAverageGrade(){
        return students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
    }

    public String getStudentNames(){
        return students.stream()
                .map(student -> student.getName())
                .collect(Collectors.joining(", "));
    }

    public Map<Character,List<Student>> getGradesMap(){
        return students.stream()
                .collect(Collectors.groupingBy(student->{
                    if(student.getGrade()>= 90){
                        return 'A';
                    }
                    else if(student.getGrade()>=80){
                        return 'B';
                    }
                    else if(student.getGrade()>=70){
                        return 'C';
                    }
                    else{
                        return 'D';
                    }
                }));
    }

    public List<Student> sortStudentsByAge(){
        return students.stream()
                .sorted(Comparator.comparingInt(student-> student.getAge()))
                .toList();
    }

    public List<Student> sortStudentsByGrade(){
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .toList();
    }

    public List<Student> findTopPerformers(int count){
       return sortStudentsByGrade().stream()
               .limit(count)
               .toList();
    }

    public Map<String, List<Student>> studentsByCity(){
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCity));
    }

    public Map<String,Student> getUniqueStudentsByCity(){



        return students.stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toMap(Student::getCity,student -> student));
    }
}
