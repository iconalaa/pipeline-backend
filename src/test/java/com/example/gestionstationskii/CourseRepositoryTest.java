package com.example.gestionstationskii;

import com.example.gestionstationskii.entities.Course;
import com.example.gestionstationskii.entities.Support;
import com.example.gestionstationskii.entities.TypeCourse;
import com.example.gestionstationskii.services.ICourseServices;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CourseRepositoryTest {

    @Autowired
    private ICourseServices courseRepository;

    @Test
    public void testAddCourse() {
        Course course = new Course();
        course.setLevel(3);
        course.setTypeCourse(TypeCourse.COLLECTIVE_CHILDREN);
        course.setSupport(Support.SKI);
        course.setPrice(120.5f);
        course.setTimeSlot(2);

//        Course savedCourse = courseRepository.addCourse(course);

        log.info("Saved course: {}", savedCourse);

        assertNotNull(savedCourse.getNumCourse());
        assertEquals(3, savedCourse.getLevel());
        assertEquals(Support.SKI, savedCourse.getSupport());

    }
}
