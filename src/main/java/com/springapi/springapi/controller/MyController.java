package com.springapi.springapi.controller;

import com.springapi.springapi.CourseServicePk.CourseService;
import com.springapi.springapi.entities.Course;
//import com.springapi.springapi.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//representational state transfer
@RestController
public class MyController {

    @Autowired
    private CourseService courseSerivice;

    @GetMapping("/home")
    public String home(){
        return "Welcome!!";
    }

    //get courses
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseSerivice.getCourses();
    }
    @GetMapping("/courses/{courseId}")

    public  Course getCourse(@PathVariable String courseId)
    {
        return this.courseSerivice.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")

//    @PostMapping(path = "/courses",consumes = "application/json")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseSerivice.addCourse(course);
    }
}
