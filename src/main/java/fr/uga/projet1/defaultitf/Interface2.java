package fr.uga.projet1.defaultitf;

public interface Interface2 {
	default void m1() {
		System.out.println("Coucou itf2::m1");
	}
	void m3();
}
