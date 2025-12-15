package ex1_2;

public class LambdaIntro {
	public static void main(String[] args) {
		// Implémentation traditionnelle (classe anonyme)
		Calculateur addition = new Calculateur() {
			@Override
			public int calculer(int a, int b) {
				return a + b;
			}
		};

		Calculateur additionLambda = (a, b) -> a + b;

		// Test des deux implémentations
		System.out.println("Addition traditionnelle: " + addition.calculer(5, 3));
		System.out.println("Addition avec lambda: " + additionLambda.calculer(5, 3));
	}
}