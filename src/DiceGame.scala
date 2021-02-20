import scala.util.Random

object DiceGame {
	var random = new Random()
	val diceEV: Double = 3.5

	def playGame(totalRolls: Int): Unit = {
		var score = rollDice(totalRolls, 0)
		Console.println(s"Score: $score")
	}

	private def rollDice(remainRolls: Int, currentSum: Int): Int = {
		var dieRoll = random.nextInt(5) + 1 // returns between 0 and 5 so add 1
		if (remainRolls > 0) {
			if ((remainRolls * diceEV) < (100 - (currentSum + (dieRoll * 10)))) {
				Console.println(s"Die: $dieRoll  Total: ${currentSum + (dieRoll * 10)}")
				rollDice(remainRolls - 1, currentSum + (dieRoll * 10))
			} else {
				Console.println(s"Die: $dieRoll  Total: ${currentSum + dieRoll}")
				rollDice(remainRolls - 1, currentSum + dieRoll)
			}
		}
		else {
			currentSum
		}
	}
}
