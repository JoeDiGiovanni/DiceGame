import scala.util.Random

object Main {

	// Possible Command Line Parameters: Total Rolls, Max Total, # Sides Die
	def main(args: Array[String]): Unit = {

		val totalRolls = 10
		DiceGame.playGame(totalRolls)
	}
}
