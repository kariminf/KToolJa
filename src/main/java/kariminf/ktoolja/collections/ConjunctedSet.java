package kariminf.ktoolja.collections;

import java.util.ArrayList;
import java.util.HashSet;


public class ConjunctedSet<T> extends HashSet<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArrayList<T> getSubstances(){
		ArrayList<T> result = new ArrayList<>();
		result.addAll(this);
		return result;
	}
	
	public ConjunctedSet<T> fuse(ConjunctedSet<T> cs){
		ConjunctedSet<T> result = new ConjunctedSet<>();
		result.addAll(cs);
		return result;
	}

}
