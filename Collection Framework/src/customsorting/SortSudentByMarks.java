package customsorting;

import java.util.Comparator;

public class SortSudentByMarks implements Comparator<Student> {
  @Override
  public int compare(Student x,Student y) {
	  return x.marks-y.marks;
  }
}
// --->x.marks- Current Object to be Inserted
// --->y.marks- Already Existing Object