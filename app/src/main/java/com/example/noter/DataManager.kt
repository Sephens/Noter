package com.example.mynotes

class DataManager {
    val courses=HashMap<String,CourseInfo>()
    val notes=ArrayList<NoteInfo>()


    //Initializer Block
    init {
        initializeCourses()
    }

   private fun initializeCourses(){
       var course=CourseInfo("BIT 421","Software Project Management")
       courses.set(course.courseId,course)

       course=CourseInfo("BIT 422","Electronic Commerce")
       courses.set(course.courseId,course)

       course=CourseInfo("BIT 423","IT Project")
       courses.set(course.courseId,course)

       course=CourseInfo("BIT 424","Management Information Systems")
       courses.set(course.courseId,course)

       course=CourseInfo("BIT 425","Simulation And Modelling")
       courses.set(course.courseId,course)
   }
}