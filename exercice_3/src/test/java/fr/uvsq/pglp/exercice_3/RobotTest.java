package fr.uvsq.pglp.exercice_3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import fr.uvsq.pglp.exercice_4.Robot;
import fr.uvsq.pglp.exercice_4.Robot1;
import fr.uvsq.pglp.exercice_4.Robot2;

public class RobotTest {
	
	

		
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
		
	

}
