
package coursescheduler;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseScheduler {

    public static void main(String[] args) {
        
   ArrayList<Course> courses = new ArrayList<>();
   
   readCourseData(courses, "coursedata.txt");
  
   for(int i=0; i<courses.size();i++){
   
   System.out.print(courses.get(i).toString());
   
   }
        
        
    /*
    Instructor inst1 = new Instructor();
    Instructor inst2 = new Instructor("Kelvin", "Bryant", "Cherry", 124);
    
   /* System.out.println(inst1.toString());
    System.out.println(inst2.toString());
    
    Textbook text1 = new Textbook();
    Textbook text2 = new Textbook("COMP167 Textbook", "NCAT Publisher", 3);
    
    System.out.println(text1.toString());
    System.out.println(text2.toString());
    
    Course cour = new Course("COMP167", "Spring", inst1, text1);
    System.out.println(cour.getName()+ ","+cour.getSemester()+"\n" + inst1.toString() + "\n" + text2.toString());
    */
    
    }
    public static void readCourseData(ArrayList courses, String filename){
        try{
            Scanner read = new Scanner (new File(filename));
            while(read.hasNext()){
            Course cour = new Course();
            Instructor inst = new Instructor();
            Textbook text = new Textbook();
            
            String[] oneLine2 = read.nextLine().split(",");
            cour.setName(oneLine2[0]);
            cour.setSemester(oneLine2[1]);
            
            

            String[] oneLine = read.nextLine().trim().split("\\*");
            
            
            
            inst.setFirstname(oneLine[0]);
            inst.setLastname(oneLine[1]);
            inst.setOfficeBuilding(oneLine[2]);
            inst.setRoomNumber(oneLine[3]);
            cour.setInstructor(inst);
            
            text.setTitle(read.nextLine());
            text.setPublisher(read.nextLine());
            text.setEdition(Integer.parseInt(read.nextLine()));
            cour.setTextbook(text);
            
            courses.add(cour);
            
            }
        }
        catch(java.io.FileNotFoundException ex){
            System.err.printf("could not open file");
            System.exit(-1);
        }
    }
    
}
