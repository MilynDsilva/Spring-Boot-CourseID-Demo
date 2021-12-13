package com.springapi.springapi.CourseServicePk;

import com.springapi.springapi.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);
}
