package fr.uvsq.pglp.exercice_4;

public class Robot {
	
	public int position;
	public Robot(int position) {
		this.position=position;
	}
	
	public void avance() {
		this.position+=10;
	}

}
