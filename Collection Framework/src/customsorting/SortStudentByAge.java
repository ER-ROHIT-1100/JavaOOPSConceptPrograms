package customsorting;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student>{
    @Override
    public int compare(Student x,Student y){
    	return x.age-y.age;
    }  
}
// --> Current object to be inserted.
// --> Already Existing Object.

