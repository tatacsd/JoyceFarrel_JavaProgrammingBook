package chapter10;

public class ProfessionalBaseballPlayer extends BaseballPlayer {

	double salary;
	
	// It is static so it cannot be overrided by the subclass non-static method
	// and it cannot also be overrided by a static method in the subclass, because you cannot add a super in a static method
	
	//solution: a child class can access its parent's nonprivate, static method
	public static void showOrigins() {
		BaseballPlayer.showOrigins();
		System.out.println("The first professional " +
		"major league baseball game was played in 1897");
		
	}
	
	public final void display(BaseballPlayer bbplayer) {
		bbplayer.displayMessage();
	}
}
