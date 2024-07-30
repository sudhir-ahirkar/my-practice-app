package com.test.application;

import java.time.LocalDate;


public class DateDTO {
  
  private LocalDate startDate;
  private LocalDate endDate;
  private Integer lenghtOfMonth;
  private Integer month;
  
  
 
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }
  public Integer getLenghtOfMonth() {
    return lenghtOfMonth;
  }
  public void setLenghtOfMonth(Integer lenghtOfMonth) {
    this.lenghtOfMonth = lenghtOfMonth;
  }
  public Integer getMonth() {
    return month;
  }
  public void setMonth(Integer month) {
    this.month = month;
  }
  @Override
  public String toString() {
    return "DateDTO [startDate=" + startDate + ", endDate=" + endDate + ", lenghtOfMonth="
        + lenghtOfMonth + ", month=" + month + ", getStartDate()=" + getStartDate()
        + ", getEndDate()=" + getEndDate() + ", getLenghtOfMonth()=" + getLenghtOfMonth()
        + ", getMonth()=" + getMonth() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
        + ", toString()=" + super.toString() + "]";
  }
  
  
  
}

