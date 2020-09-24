package phases;

import java.util.*;
import java.util.stream.*;

public class Phase1 {
	
	static List<String> femaleNames = Arrays.asList("Ali", "Sophia", "Helena", "Valentina", "Laura", "Isabella", "Manuela", "Júlia", "Heloísa", "Luiza", "Maria Luiza", "Lorena", "Lívia", "Giovanna", "Maria Eduarda", "Beatriz", "Maria Clara", "Cecília", "Eloá", "Lara", "Maria Júlia", "Isadora", "Mariana", "Emanuelly", "Ana Júlia", "Ana Luiza", "Ana Clara", "Melissa", "Yasmin", "Maria Alice", "Isabelly", "Lavínia", "Esther", "Sarah", "Elisa", "Antonella", "Rafaela", "Maria Cecília", "Liz", "Marina", "Nicole", "Maitê", "Isis", "Alícia", "Luna", "Rebeca", "Agatha", "Letícia", "Maria-", "Gabriela", "Ana Laura", "Catarina", "Clara", "Ana Beatriz", "Vitória", "Olívia", "Maria Fernanda", "Emilly", "Maria Valentina", "Milena", "Maria Helena", "Bianca", "Larissa", "Mirella", "Maria Flor", "Allana", "Ana Sophia", "Clarice", "Pietra", "Maria Vitória", "Maya", "Laís", "Ayla", "Ana Lívia", "Eduarda", "Mariah", "Stella", "Ana", "Gabrielly", "Sophie", "Carolina", "Maria Laura", "Maria Heloísa", "Maria Sophia", "Fernanda", "Malu", "Analu", "Amanda", "Aurora", "Maria Isis", "Louise", "Heloise", "Ana Vitória", "Ana Cecília", "Ana Liz", "Joana", "Luana", "Antônia", "Isabel", "Bruna");
	static List<String> maleNames = Arrays.asList("Miguel", "Art", "Bernardo", "Heitor", "Dav", "Lorenzo", "Téo", "Pedro", "Gabriel", "Enzo", "Matheus", "Lucas", "Benjamin", "Nicolas", "Guilherme", "Rafael", "Joaquim", "Samuel", "Enzo Gabriel", "João Miguel", "Henrique", "Gustavo", "Murilo", "Pedro Henrique", "Pietro", "Lucca", "Felipe", "João Pedro", "Isaac", "Benício", "Daniel", "Anthony", "Leonardo", "Davi Lucca", "Bryan", "Eduardo", "João Lucas", "Victor", "João", "Cauã", "Antônio", "Vicente", "Caleb", "Gael", "Bento", "Caio", "Emanuel", "Vinícius", "João Guilherme", "Davi Lucas", "Noah", "João Gabriel", "João Victor", "Luiz Miguel", "Francisco", "Kaique", "Otávio", "Augusto", "Levi", "Yuri", "Enrico", "Thiago", "Ian", "Victor Hugo", "Thomas", "Henry", "Luiz Felipe", "Ryan", "Arthur Miguel", "Davi Luiz", "Nathan", "Pedro Lucas", "Davi Miguel", "Raul", "Pedro Miguel", "Luiz Henrique", "Luan", "Erick", "Martin", "Bruno", "Rodrigo", "Luiz Gustavo", "Arthur Gabriel", "Breno", "Kauê", "Enzo Miguel", "Fernando", "Arthur Henrique", "Luiz Otávio", "Carlos Eduardo", "Tomás", "Lucas Gabriel", "André", "José", "Yago", "Danilo", "Anthony Gabriel", "Ruan", "Miguel Henrique", "Oliver");
	static List<Integer> list1To100 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);
	
	/**
	 * Method that returns a list of all strings that start 
	 * with the letter 'A' (uppercase) and have exactly 3 letters. 
	 * @param list of string
	 * @return list of string
	 */
	public static List<String> listBeginsAsize3char(List<String> list) {
		return list.stream()
			.filter(x -> x.startsWith("A"))
			.filter(x -> x.length() == 3)
			.collect(Collectors.toList());
	}
	
	
	/**
	 * Method that returns a comma-separated string based on a list of 
	 * Integers. Each element should be preceded by the letter "e" if 
	 * the number is even, and preceded by the letter "o" if the number is odd.
	 * @param list if integers
	 * @return string
	 */
	public static String evenORodd(List<Integer> list) {
		return list.stream()
	            .map(x -> (x % 2 == 0 ? "e" : "o") + x)
	            .collect(Collectors.joining(", "));
	}
	
	
	/**
	 * Method that returns a list of all strings that contain the letter ‘o’
	 * @param list of string
	 * @return list of string
	 */
	public static List<String> listConteinOchar(List<String> list) {
		return list.stream()
			.filter(x -> x.matches(".*[o].*"))
			.collect(Collectors.toList());
	}
	
	/**
	 * Method that returns a list of all strings that contain the letter ‘o’
	 * and have more then 5 letters. 
	 * @param list of string
	 * @return list of string
	 */
	public static List<String> listConteinOsize5char(List<String> list) {
		return list.stream()
				.filter(x -> x.matches(".*[o].*"))
				.filter(x -> x.length() > 5)
				.collect(Collectors.toList());
	}
	
	/**
	 * Prints all items less than thirteen in the list with a lambda.
	 * @param list of integer
	 */
	public static void monthsYear(List<Integer> list) {
		list.stream()
				.filter(x -> x<13)
				.map(x -> (x < 12 ? x + ", " : x)) 	//to separate the items 
				.forEach(x -> System.out.print(x));	//to be printed on the same line
	}
	
	/**
	 * Prints all items less than thirteen in the list with a lambda.
	 * by method reference.
	 * @param list of integer
	 */
	public static void monthsYearReferenceMethod(List<Integer> list) {
		list.stream()
		.filter(x -> x<14)
		.map(x -> (x <= 12 ? " - " + x : "\n"))	//to separate the items 
		.forEach(System.out::print);			//to be printed on the same line
	}
	
	

}
