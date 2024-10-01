package inheritance;
import java.util.*;
public class Matrix {
  private int row;
  private int col;
  private int row1;
  private int col1;
  private int arr[][];
  private int arr1[][];
  private int result[][];
  
  Scanner sc=new Scanner(System.in);
	public Matrix(int row, int col, int row1, int col1, int[][] arr, int[][] arr1, int[][] result) {
	super();
	this.row = row;
	this.col = col;
	this.row1 = row1;
	this.col1 = col1;
	this.arr = arr;
	this.arr1 = arr1;
	this.result = result;
}
	  public void getrow() {
		  System.out.println("Enter Rows");
		  System.out.println("Rows are:"+row);
		  System.out.println("Enter Rows1");
		  System.out.println("Rows are:"+row1);
	  }
	  public void getcol() {
		  System.out.println("Enter col");
		  System.out.println("Col are:"+col);
		  System.out.println("Enter Col1");
		  System.out.println("Col are:"+col1);
	  }
	  public void accept() {
		  if(row==row1 && col==col1) {
		  System.out.println("Enter the arr");
		  for(int i=0;i<arr.length;i++) {
		     for(int j=0;j<arr.length;j++) {
		    	 arr[i][j]=sc.nextInt();
		     }
	  }
		  System.out.println("Enter the arr1");
		  for(int i=0;i<arr1.length;i++) {
		     for(int j=0;j<arr1.length;j++) {
		    	 arr[i][j]=sc.nextInt();
		     }
	  }
		  }
		  else
			  System.out.println("Matrix will not formed ");
	  }
	  public void cal() {
		  for(int i=0;i<arr.length;i++) {
			     for(int j=0;j<arr.length;j++) {
			    	 result[i][j]=arr[i][j]+arr1[i][j];
			     }}
		  
	  }
	  public void display() {
		  for(int i=0;i<arr.length;i++) {
			     for(int j=0;j<arr.length;j++) {
			    	 System.out.println(result[i][j]);
			     }}
	  }
	  

	public static void main(String[] args) {
		int row,row1;
		row=sc.next
		Matrix m=new Matrix();
		m.getrow();
		m.getcol();
		m.accept();
		m.cal();
		m.display();
	}

}
