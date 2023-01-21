package ru.alishev.springcourse.FirstRestApp.util;

public class PersonNotCreateException extends RuntimeException{

public PersonNotCreateException(String msg){
    super(msg);
}
}
