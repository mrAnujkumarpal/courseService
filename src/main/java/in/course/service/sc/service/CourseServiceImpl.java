package in.course.service.sc.service;

import in.course.service.sc.domain.Course;
import in.course.service.sc.exception.ResourseNotFoundException;
import in.course.service.sc.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImpl implements ICourse {

    @Autowired
    private CourseRepository repository;

    @Override
    public Course newCourse(Course course) {
        course.setCourseId(UUID.randomUUID().toString());

        return this.repository.save(course);
    }


    @Override
    public List<Course> allCourses() {
        return this.repository.findAll();
    }

    @Override
    public Course courseById(String courseId) {
        return this.repository.findById(courseId).orElseThrow(() -> new ResourseNotFoundException("This is not available is system " + courseId));
    }
}
