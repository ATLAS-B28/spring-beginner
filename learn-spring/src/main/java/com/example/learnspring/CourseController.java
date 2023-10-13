package com.example.learnspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/*
* dummy data
* [
*  {
*    id: 1,
*    name: "java",
*    description: "java course",
*    price: 100,
*  }
* ]
* */
@RestController
public class CourseController {
    //create a simple controller class
    //courses
    //using this annotation we expose the controller to the web url
    @RequestMapping(value = "/courses",method = RequestMethod.GET)
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "java", "java course", 100),
                new Course(2, "spring", "spring course", 200),
                new Course(3, "react", "react course", 300),
                new Course(4, "angular", "angular course", 400)
        );
    }
}
