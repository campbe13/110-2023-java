public class Demoif {
	public static void main(String args[]) {
		//System.out.println("1,5" + isBigger(1,5));
	  //System.out.println("5,1"+ isBigger(5,1));
	  System.out.println("5 "+ ageCategory2(5));
	  System.out.println("15 "+ ageCategory2(15));
	  System.out.println("35 "+ ageCategory2(35));
	  if (ageCategory2(35) == "adult") {
		  System.out.println("age 35 test OK");
	  } else {
		  System.out.println("age 35 test BAD");
	  }
		int x = 5, y = 10;
	  // if 1 is true expression is true
	  if  (x == 5 || x == 10) {
		    System.out.println("x = 10 or 5");
 	  } else {
			System.out.println("nope x = 10 or 5");
	  }

	  // both must be true
	  if  (x == 5 && x == 10) {
		  System.out.println("x = 10 and 5");
	  } else {
			System.out.println("nope x = 10 and 5");
	  }
  }
/**
  < 13 child
  13-19 teen  
  >19 adult
  @return string
	@author pmc
*/
  	public static String ageCategory(int age) {
	  	if (age < 13) {
		  	return "child";
		  } else if (age < 20) {
			  	return "teen";
		  } else {
				return "adult";
		  }
	  }
	  public static String ageCategory2(int age) {
		  String category = "adult";
		  if (age < 13) {
			  category = "child";
		  } else  if (age < 20) {
			  category = "teen";
		  }
		  return category;
	  }
/**
* check that 2nd param is > 1st
* @author PMCampbell
*/
public static boolean isBigger(int n1, int n2) {
	boolean tf = false;
	if (n2 > n1) {
		tf = true;
	}
	return tf;
	}
}
public static boolean isBigger2(int n1, int n2) {
	if (n2 > n1) {
		return true;
	}
	return false;
	}
}
/* 
int  number = -1;
	if (number > 0 ) {
		System.out.println ("+ve");
	}else if (number < 0) {
		System.out.println("-ve");
	} else {
		System.out.println("zero");
	
	} */
