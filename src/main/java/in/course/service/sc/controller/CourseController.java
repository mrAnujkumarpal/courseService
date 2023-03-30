package in.course.service.sc.controller;

import in.course.service.sc.domain.Course;
import in.course.service.sc.service.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course/")
public class CourseController {

    @Autowired
    private ICourse courseService;

    @GetMapping("all")
    public ResponseEntity<List<Course>> allCourses() {
        return ResponseEntity.ok(this.courseService.allCourses());

    }

    @PostMapping("new")
    public ResponseEntity<Course> newCourse(@RequestBody Course course) {
        Course newCourse = this.courseService.newCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCourse);
    }

    @GetMapping("{courseId}/view")
    public ResponseEntity<Course> getCourse(@PathVariable String courseId) {
        return ResponseEntity.ok(this.courseService.courseById(courseId));
    }

}
