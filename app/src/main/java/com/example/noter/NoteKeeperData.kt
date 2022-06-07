package com.example.mynotes
class CourseInfo(val courseId:String, val courseTitle:String)
class NoteInfo(var course:CourseInfo,var noteTitle:String,var noteText:String)