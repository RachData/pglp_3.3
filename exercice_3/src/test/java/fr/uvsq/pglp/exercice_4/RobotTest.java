import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class RobotTest {
	
	@Test
	public void Test() {
		ArrayList<Robot> Robots=new ArrayList<Robot>();
		Robots.add(new Robot1(20));
		Robots.add(new Robot2(20));
		for(int i=0;i<Robots.size();i++)
			Robots.get(i).avance();
		for(int i=0;i<Robots.size();i++)
			System.out.println("position Robot de type "+(i+1)+Robots.get(i).position);
	}
	
/*
	@Test
	void test() {
		fail("Not yet implemented");
	}*/

}
