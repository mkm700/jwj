package dotComGame;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "6";
		String result = dot.checkYourself(userGuess);

	}

}
