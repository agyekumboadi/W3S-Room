/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room;

/**
 *
 * @author agyek
 */
public class ClassRoom extends Room {
    private int numStudents;
    
    public ClassRoom(double a, double b, int c, int d){
        
        if(a>b){
            this.setLength(a);
            this.setWidth(b);
            this.setFloor(c);
            this.numStudents = d;
        }
            else{
                    this.setLength(b);
                    this.setWidth(a);
                    this.setFloor(c);
                     this.numStudents = d;
                    }
           
        
  
             public String toString(){
                return String.format(super.toString() + ",capacity = " + numStudents + "students");
                
            }
            
            public static ArrayList<Classroom> myClassrooms(ArrayList<Room> rooms){
                
                ArrayList<Classroom> classroomlist = new ArrayList<Classroom>();
                
                for(Room oneroom: rooms){
                    if (oneroom instanceof Classroom){
                        classroomlist.add(new Classroom(oneroom.get(0), oneroom.get(1), oneroom.get(2), oneroom.get(3)));
                    }
                    }
                return classroomlist;
    
}
            
            
        }
    }
}
