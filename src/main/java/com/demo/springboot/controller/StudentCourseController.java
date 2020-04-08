package com.demo.springboot.controller;

import com.demo.springboot.pojo.StudentCourse;
import com.demo.springboot.service.CourseService;
import com.demo.springboot.service.StudentCourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/student_course")
public class StudentCourseController {


    @Autowired
    private StudentCourseService studentCourseService;

    Logger logger = LoggerFactory.getLogger(PersonController.class);

    /**
     * 加入我的课程列表
     * @param student_id
     * @param course_id
     * @return
     */
    @GetMapping(value = "/insert")
    public String insert(@RequestParam("student_id") String student_id, @RequestParam("course_id") String course_id) {
        logger.info("course student_id=" + student_id + "course_id=" + course_id);
        if (StringUtils.isEmpty(student_id) || StringUtils.isEmpty(course_id))
            return "error";
        studentCourseService.insert(student_id, course_id);
        return "Saved";
    }

    /**
     * [{"id":null,"studentId":1,"studentName":"Android","courseName":"iOS成大神之路","courseId":1,"visible":null},{"id":null,"studentId":1,"studentName":"Android","courseName":"Android第一行代码","courseId":6,"visible":null}]
     * @param student_id
     * @return
     */
    @GetMapping(value = "/getCourseByStudent")
    public List<StudentCourse> insert(@RequestParam("student_id") String student_id) {
        logger.info("course student_id=" + student_id);
        if (!StringUtils.isEmpty(student_id)) {
            List<StudentCourse> courses = studentCourseService.getCourseByStudent(student_id);
            if(courses==null||courses.size()==0)
                throw new IllegalArgumentException("学生id不存在");
            return courses;
        }else{
            throw new IllegalArgumentException("学生id有误");
        }
    }

}
