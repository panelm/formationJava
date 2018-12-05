package fr.uga.projet1.defaultitf;

public interface Interface1 {
	default void m1() {
		System.out.println("Coucou itf1::m1");
	}
	void m2();
}
