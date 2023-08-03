package CSE114.classwork.lecture21;

import java.util.ArrayList;


public class TestAL {

    public static void main(String[] args) {
	ArrayList<Point> pointList = new ArrayList<Point>();

	pointList.add(new Point(44, 33));
	pointList.add(new Point(33, 43));
	pointList.add(new Point(3, 4));
	pointList.add(new Point(30, 40));
	pointList.add(new Point(4, 3));
	pointList.add(new Point(3, 4));
	pointList.add(new Point(5, 3));

	System.out.println(pointList);

	if (pointList.contains(new Point(3,4))) {
	    System.out.println("Yes!!!");
	}
	System.out.println("Location of Point(3,4): " + pointList.indexOf(new Point(3,4)));



	// ArrayList<int>
	// xxxxxx
	ArrayList<Integer> intList = new ArrayList<Integer>();
	intList.add(5);
	intList.add(10);
	intList.add(3);
	intList.add(20);
	intList.add(310);
	intList.add(10);
	System.out.println(intList);
	//intList.remove(3);
	intList.remove( (Integer)(3));
	System.out.println(intList);
	
    }

}
