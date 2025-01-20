import players.Player

fun printMatchResults(playerA: Player, playerB: Player) {
    val totalGames = playerA.gamesWon + playerA.gamesLost + playerA.gamesDrawn // total number of games played

    println("${playerA.name} wins ${playerA.gamesWon} of $totalGames games")
    println("${playerB.name} wins ${playerB.gamesWon} of $totalGames games")
    println("Draws: ${playerA.gamesDrawn} of $totalGames games")
}
