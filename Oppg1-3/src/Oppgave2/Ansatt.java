package Oppgave2;

import Oppgave2.Kjonn;

public class Ansatt {

	
		public String fornavn;
		public String etternavn;
		public Kjonn kjonn;
		public String stilling;
		public int aarslonn;

		public Ansatt(String fornavn, String etternavn, Kjonn kjonn, String stilling, int aarslonn) {
			this.fornavn = fornavn;
			this.etternavn = etternavn;
			this.kjonn = kjonn;
			this.stilling = stilling;
			this.aarslonn = aarslonn;
		}

		@Override
		public String toString() {
			return "Navn: " + fornavn + " " + etternavn + ", " + "Kjønn: " + kjonn + ", "
					+ "Stilling: " + stilling + ", Årslønn: " + aarslonn;
		}

		public String getFornavn() {
			return fornavn;
		}

		public void setFornavn(String fornavn) {
			this.fornavn = fornavn;
		}

		public String getEtternavn() {
			return etternavn;
		}

		public void setEtternavn(String etternavn) {
			this.etternavn = etternavn;
		}

		public Kjonn getKjonn() {
			return kjonn;
		}

		public void setKjonn(Kjonn kjonn) {
			this.kjonn = kjonn;
		}

		public String getStilling() {
			return stilling;
		}

		public void setStilling(String stilling) {
			this.stilling = stilling;
		}

		public int getAarslonn() {
			return aarslonn;
		}

		public int setAarslonn(int aarslonn) {
			return this.aarslonn = aarslonn;
		}
}
