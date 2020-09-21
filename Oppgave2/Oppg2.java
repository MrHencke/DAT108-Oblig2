package Oppgave2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import Oppgave2.Kjonn;
public class Oppg2 {

	public static void main(String[] args) {
		
		List<Ansatt> ansatte = Arrays.asList(new Ansatt("Henrik", "Slegge", Kjonn.MANN, "CEO", 800000),
				new Ansatt("Nils", "Nilsen", Kjonn.MANN, "Frontend", 410000),
				new Ansatt("Helene", "Gardreim", Kjonn.KVINNE, "Driftskonsulent", 590000),
				new Ansatt("Bjørnar", "Nilsen", Kjonn.MANN, "Fullstack", 480000),
				new Ansatt("Kjartan", "Kjerrgard", Kjonn.MANN, "Konsulent", 420000));
		
		
		Function<Ansatt, Integer> kroneTillegg = (a) -> a.setAarslonn(a.getAarslonn() + 10000); 
		Function<Ansatt, Integer> prosentTillegg = (a) -> a.setAarslonn((int) (a.getAarslonn() * 1.02)); 
		Function<Ansatt, Integer> kroneTilleggForLavLonn = (a) -> a.setAarslonn(a.getAarslonn() + 20000); 
		Function<Ansatt, Integer> kroneTilleggForMenn = (a) -> a.setAarslonn(a.getAarslonn() + 10000); 
		
		lonnsoppgjor(ansatte, kroneTillegg);
		lonnsoppgjor(ansatte, prosentTillegg);
		
		List<Ansatt> ansattLavLonn = ansatte.stream().filter(a -> a.getAarslonn() < 500000).collect(Collectors.toList());
		lonnsoppgjor(ansattLavLonn, kroneTilleggForLavLonn);
		
		List<Ansatt> ansattMenn = ansatte.stream().filter(a -> a.getKjonn().equals(Kjonn.MANN)).collect(Collectors.toList());
		lonnsoppgjor(ansattMenn, kroneTilleggForMenn);
		
		
		skrivUtAlle(ansatte);
	}
	

	private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> func) {
		for(Ansatt a : ansatte) func.apply(a);
	}
	
	private static void skrivUtAlle(List<Ansatt> ansatte) {
		for(Ansatt a : ansatte) System.out.println(a.toString());
	}

}
