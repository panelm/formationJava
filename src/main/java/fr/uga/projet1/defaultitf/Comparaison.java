package fr.uga.projet1.defaultitf;

public interface Comparaison<T> extends Comparable<T> {
	
	
	default boolean indentique(T o) {
		if (this.compareTo(o)==0)
			return true;
		else
			return false;
	
	}
	
	default boolean plusGrandQue(T o) {
		if (this.compareTo(o)>0)
			return true;
		else
			return false;		
	}
	default boolean plusPetitQue(T o) {
		if (this.compareTo(o)<0)
			return true;
		else
			return false;
		
	}
	
	

}
