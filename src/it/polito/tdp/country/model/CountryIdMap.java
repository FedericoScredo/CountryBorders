package it.polito.tdp.country.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CountryIdMap {
	
	private Map<Integer,Country> map ;
	
	public CountryIdMap() {
		map = new HashMap<>() ;
	}
	
	public Country get(Integer ccode) {
		return map.get(ccode) ;
	}
	
	public void put(Country c) {
		map.put(c.getcCode(), c) ;
	}
	
	public void put(Collection<Country> coll) {
		for(Country c : coll) {
			this.put(c);
		}
	}

}
