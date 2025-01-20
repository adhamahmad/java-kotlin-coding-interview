# Rock Paper Scissors Game

This is a Kotlin-based implementation of the Rock, Paper, Scissors game where two players compete in multiple rounds. One player always chooses Rock, and the other makes random choices. The game simulates 100 rounds, evaluates the result (Win, Draw, Lose) for each round, and calculates the total number of wins and draws.

## Requirements

- One player (Player A) always chooses Rock.
- The other player (Player B) chooses randomly.
- The game should play 100 rounds.
- The application should evaluate the result of each round and display the total number of wins, losses, and draws for each player.

## Features

- Simulates 100 rounds of the game.
- Calculates and prints the number of wins, losses, and draws for both players.
- Written in Kotlin with a focus on clean code and test-driven development (TDD).
- High test coverage for the game logic and player behavior.

## Project Structure

- `Player` class: Represents a player in the game, with a name, game stats (wins, losses, draws) and a method to make moves.
- `RockPlayer`: A subclass of `Player` that always chooses Rock.
- `RandomPlayer`: A subclass of `Player` that makes a random choice.
- `Game`: A class to simulate the game and evaluate the result.
- `Move`: An enum to represent the possible moves (Rock, Paper, Scissors).
- `Result`: An enum to represent the result of a round (Win, Lose, Draw).

## How to Run

To run the game Follow these steps:

1. **Clone the repository** to your local machine (if you haven't already):

2. **Build the project** and run the game using Gradle:

This will simulate 100 rounds of the game and print the results.

### Command to Run the Game

If you want to run the game directly from the command line (on a Unix-based system like macOS or Linux), you can use:

```bash
./gradlew run
```

## Running Tests

The project is equipped with unit tests for the game logic and player behavior. To run all tests, use the following command:

```bash
./gradlew test
```

## Output Example
```
Player A wins 31 of 100 games
Player B wins 37 of 100 games
Draws: 32 of 100 games
```
## Development

The project follows a test-driven development approach. You can add new tests or modify existing ones by editing the test files in the src/test directory.

## Technologies Used

- Kotlin
- JUnit 5 (for testing)
- Gradle (build tool)




