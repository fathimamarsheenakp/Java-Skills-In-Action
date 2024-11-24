
public class AthleticCompetetion {

	public static void main(String[] args) {
		
		float athlete1Weight = 68.45f;
		float athlete2Weight = 70.55f;
		System.out.println("Weight of Athlete 1: " + athlete1Weight + "kg \nWeight of Athlete 2: " + athlete2Weight + "kg.");
		
		double athlete1Time = 9.8576341234;
		double athlete2Time = 10.0012345678;
		System.out.println("Time of Athlete 1: " + athlete1Time + " seconds");
		System.out.println("Time of Athlete 2: " + athlete2Time + " seconds");
		
		String winner = athlete1Time < athlete2Time ? "Athlete 1" : "Athlete 2" ;
		System.out.println("Winner of the race: " + winner);


	}

}
