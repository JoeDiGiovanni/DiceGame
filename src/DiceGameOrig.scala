import scala.util.Random

object DiceGameOrig {
	var random = new Random()
	val diceEV: Double = 3.5

	def playGame(totalRolls: Int): Unit = {
		var diceSum: Int = 0
		for (r <- 1 to totalRolls) {
			var remainRolls = totalRolls - r
			var dieRoll = random.nextInt(5) + 1 // returns between 0 and 5 so add 1
			var addBonus = false
			var sumWithBonus = diceSum + (dieRoll * 10)

			if ((remainRolls * diceEV) < (100 - sumWithBonus)) {
				addBonus = true
			}

			if (addBonus) {
				diceSum = diceSum + (dieRoll * 10)
			} else {
				diceSum = diceSum + dieRoll
			}

			Console.println(s"Die: $dieRoll  Total: $diceSum")
		}
	}
}
