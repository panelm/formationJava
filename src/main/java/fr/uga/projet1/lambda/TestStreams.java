package fr.uga.projet1.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) {

		// Opérateur ternaire
		// affectation conditionnelle : variable = (condition)?rés si vrai : rés si
		// faux;
		int y = 5;
		int y2 = (y > 0) ? 23 : 48;

		Etudiant e1 = new Etudiant("panel", "mathieu", 20.0);
		Etudiant e2 = new Etudiant("fernandes", "alexandre", 0.0);
		Etudiant e3 = new Etudiant("fleury", "tristan", 11.0);
		Etudiant e4 = new Etudiant("Paul", "jean", 11.0);

		List<Etudiant> le = Arrays.asList(e1, e2, e3, e4);
		// System.out.println(le.toString());
		// liste trié par moyenne
		List<Etudiant> ltm = le.stream().sorted(Comparator.comparing(Etudiant::getMoyenne))
				.collect(Collectors.toList());
		// System.out.println(ltm.toString());

		// Etudiants qui ont la moyenne en liste
		List<Etudiant> ltqom = le.stream().filter(e -> e.getMoyenne() >= 10.0).collect(Collectors.toList());
		// System.out.println(ltqom.toString());

		// Etudiants qui ont la moyenne
		String l = le.stream().filter(e -> e.getMoyenne() >= 10.0).map(Etudiant::getNom)
				.collect(Collectors.joining(";"));
		// System.out.println(l);

		// Moyenne general
		Double moyenneG = le.stream().collect(Collectors.averagingDouble(Etudiant::getMoyenne));
		// System.out.println(moyenneG);

//		e -> {
//			return (e.getMoyenne()<10)?"Recalé":((t.getMoyenne() >= 10 && t.getMoyenne() <= 12)?"":"");
//		}
		
		
		Map<String, List<Etudiant>> m = le.stream().collect(Collectors.groupingBy(new Function<Etudiant, String>() {
			public String apply(Etudiant t) {
				if (t.getMoyenne() < 10) {
					return "recalé";
				} else if (t.getMoyenne() >= 10 && t.getMoyenne() <= 12) {
					return "passable";

				} else if (t.getMoyenne() >= 12 && t.getMoyenne() <= 18) {
					return "bon";

				} else {
					return "Tres bon";
				}
			};

		}, Collectors.toList()));

		m.forEach((k,v) -> {
			System.out.println(k);
			v.forEach(e -> System.out.println( e.getNom() )  );
		} );
		
		
		System.out.println(m.toString());
	}

}
