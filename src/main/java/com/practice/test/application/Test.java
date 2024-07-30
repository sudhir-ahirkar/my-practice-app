package com.practice.test.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Test {
  public static final Integer ZERO = 0;
  public static final Integer ONE = 1;

	public static void main(String[] args) {
	  int dayOfMonth=LocalDate.now().getDayOfMonth();
	  System.out.println("dayOfMonth===>"+dayOfMonth);
	  int f=0;
	  int s=1;
	  System.out.println(f/s);
	  double d=0d;
	  d=f;
	  System.out.println(d);
	  
	  double l=1;
	  Double g=31d;
	  g=l;
	  Float a =(float) ((l/g)*100);
	  System.out.println(a);
	  
	  LocalDate today = LocalDate.now();
	  
	  String strDate = "28/05/2018";
	  List<String> list=new ArrayList<String>();
	  
	  list.add("08/02/2019");
	  list.add("08/14/2019");
	  list.add("08/10/2019");
	  list.add("07/04/2019");
	  list.add("07/01/2019");
	  DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	  com.test.application.DateDTO dateDTO=new com.test.application.DateDTO();
	  dateDTO.setStartDate(LocalDate.parse("07/01/2019",format));
	  dateDTO.setEndDate(LocalDate.parse("07/31/2019",format));
	  
	  List<LocalDate> complianceDayCompleted = list.stream()
	        .map(complianceDate ->LocalDate.parse(complianceDate,format)).filter(date->getFilterDate(date,dateDTO)).collect(Collectors.toList());
	 Long count = list.stream()
          .map(complianceDate ->LocalDate.parse(complianceDate,format)).filter(date->getFilterDate(date,dateDTO)).count();

System.out.println("complianceDayCompleted===>"+complianceDayCompleted);
System.out.println("count===>"+count);

	  
//	  LocalDate localDate = LocalDate.parse(strDate, format);
//	  System.out.println(localDate.getMonth());
//Integer i=2;
//int a=1;
//		if(a<i) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//
//		Set<String> set=new HashSet<>();
		
//		set.addconcat(":")+null);
	  
//	  if(today.getDayOfMonth()>2)
	  
//	  List<Long> st=new ArrayList<Long>();
//	  
//	  st.add(12l);
//	  st.add(120l);
//	  st.add(1245l);
//	  st.add(12l);
//	  System.out.println(st);
//	  System.out.println(st.toString());
	  
//	  LocalDate sdate = LocalDate.now();
//	  sdate = sdate.withDayOfMonth(1);
//	  sdate = sdate.minusMonths(1);
//      LocalDate edate = sdate.withDayOfMonth(sdate.lengthOfMonth());
//      System.out.println("edate==2==>"+edate);
//      LocalDate edate = LocalDate.now().plusDays(6);
//      System.out.println("edate====>"+edate);
//    String sDate1="31/12/1998";  
//    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
//    System.out.println(sDate1+"\t"+date1); 
      
   

    
//          //default time zone
//          ZoneId defaultZoneId = ZoneId.systemDefault();
//              
//          //creating the instance of LocalDate using the day, month, year info
//              LocalDate localDate = LocalDate.of(2016, 8, 19);
//              
//              //local date + atStartOfDay() + default time zone + toInstant() = Date
//              Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
//              
//              //Displaying LocalDate and Date
//              System.out.println("LocalDate is: " + localDate);
//              System.out.println("Date is: " + date);
//              
              
              
//              Integer dayOfMonth = LocalDate.now().getDayOfMonth();
//              if (8 < 8) {
//
//                LocalDate sdate =
//                    LocalDate.now().withDayOfMonth(1).minusMonths(1);
//                LocalDate edate = sdate.withDayOfMonth(sdate.lengthOfMonth());
//                System.out.println(sdate);
//                System.out.println(edate);
//                
//
//              } else {
//                LocalDate startdate = LocalDate.now().withDayOfMonth(1);
//                LocalDate enddate = startdate.withDayOfMonth(startdate.lengthOfMonth());
//                System.out.println(startdate);
//                System.out.println(enddate);
//
//              }
              
            
         }

  public static boolean getFilterDate(LocalDate date, com.test.application.DateDTO dateDTO) {
   
   if((date.compareTo(dateDTO.getStartDate())>=0 && date.compareTo(dateDTO.getEndDate())<=0)) {
     return true;
   }
   
 
//   if((date.isAfter(dateDTO.getStartDate()) || (date.compareTo(dateDTO.getStartDate())<=0)) {
//     return true;
//   }
   
   return false;
  }
	
	
//	 ArgumentDTO argumentDTO=new ArgumentDTO();
	   
	    
//	    return argumentDTO;

}
