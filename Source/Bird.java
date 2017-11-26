/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 *
 * Programming Assignment #4
 * 
 *
 * --- Veterinarian Scheduler ---
 *           Bird.java
 * ------------------------------
 * Steven Oseguera - scoseguera@cpp.edu
 *
 */

public class Bird extends Animal
{
	private enum birdType { UMBRELLACOCKATOO, AFRICANGRAY, CONURE, COCKATIEL, PARAKEET }
	Bird(String name, int age)
	{
		super(name,age);
	}
}
