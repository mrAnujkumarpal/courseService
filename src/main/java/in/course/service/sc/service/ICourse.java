package in.course.service.sc.service;

import in.course.service.sc.domain.Course;

import java.util.List;

public interface ICourse {
    Course newCourse(Course course);

    List<Course> allCourses();

    Course courseById(String courseId);


}
