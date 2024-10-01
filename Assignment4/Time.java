/*6.    Write a class Time with three data members to store hr, min and seconds.
 *  Create two constructors and apply checks to set valid time.
 *   (hr<24, min<60, sec<60).
 *   Also create display function which displays all data members.
 */
package userinterface;

public class Time {
  private int hrs;
  private int min;
  private int sec;
  public Time() {
	  hrs=0;
	  min=0;
	  sec=0;
  }
  public Time(int hrs,int min,int sec) {
	  this.hrs=hrs;
	  this.min=min;
	  this.sec=sec;
  }
  public void check() {
	  if(hrs<24&& min<60 &&sec<60) {
		  System.out.println("Valid");
	  }
	  else
		  System.out.println("Invalid");
  }
	public static void main(String[] args) {
			Time t=new Time(12,58,35);
			t.check();

	}

}
