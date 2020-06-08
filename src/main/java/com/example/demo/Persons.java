package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
@Document(collection="Persons")
public class Persons {
@Id
private int pid;
private String pname;
private int age;
private String gender;
private String admDate;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAdmDate() {
	return admDate;
}
public void setAdmDate(String admDate) {
	this.admDate = admDate;
}
@Override
public String toString() {
	return "Persons [pid=" + pid + ", pname=" + pname + ", age=" + age + ", gender=" + gender + ", admDate=" + admDate
			+ "]";
}
public boolean checkDays(String date) {
    int dd=Integer.parseInt(date.substring(0,2));
    int mm=Integer.parseInt(date.substring(3,5));
    int yy=Integer.parseInt(date.substring(6));
    LocalDate dateBefore = LocalDate.of(yy, mm, dd);
    LocalDate dateAfter = LocalDate.now();
    long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
    if(noOfDaysBetween>=14)
    	return true;
    else
    return false;
}

}
