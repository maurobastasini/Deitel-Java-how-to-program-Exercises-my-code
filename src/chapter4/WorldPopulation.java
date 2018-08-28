package chapter4;
//complete and functional
public class WorldPopulation {

	public static void main(String[] args) {
		double currentPopulation = 7500;
		double rate = 1.18;
		int year = 2017;
		double increment;
		int counter;
		double newPopulation = 7500;
		System.out.printf("%s%30s%20s%n", "Year", "World population", "Increase");
		System.out.printf("%4d%,30.2f%20s%n", year, currentPopulation, "-");
		year++;
		while (year < 2092){
	
			newPopulation *= 1 + (rate / 100);
			increment = newPopulation - currentPopulation;
			System.out.printf("%4d%,30.2f%,20.2f%n", year, newPopulation, increment);
			currentPopulation = newPopulation;
			year++;
		}
		
		
	}

}
