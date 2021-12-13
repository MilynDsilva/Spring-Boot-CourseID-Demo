package com.springapi.springapi.CourseServicePk;

import com.springapi.springapi.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServicerimpl implements CourseService {

    List<Course> list;

    public CourseServicerimpl(){
       list= new ArrayList<>();
       //list.add(1,"jvc","Test");
       list.add(new Course(1,"jvc","course details.."));
       list.add(new Course(2,"lvc","cse details.."));

    }

    @Override
    public List<Course> getCourses(){
        return list;
    }

    @Override
    public Course getCourse(long courseId) {

        Course c = null;
        //arr trav
        for (Course course:list) {
            if(course.getId()==courseId)
            {
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
