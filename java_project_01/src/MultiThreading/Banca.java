package MultiThreading;

import java.util.ArrayList;

public class Banca {
	private static class CC {
		private int saldo;
		private int coordinate;

		public CC(int saldo, int coordinate) {
			this.saldo = saldo;
			this.coordinate = coordinate;
		}

		public int getSaldo() {
			return saldo;
		}

		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}

		public int getCoordinate() {
			return coordinate;
		}

		public void setCoordinate(int coordinate) {
			this.coordinate = coordinate;
		}
	}

	private final ArrayList<CC> conti = new ArrayList<>();

	public Banca() {
		for (int i = 0; i < 10; i++) {
			conti.add(new CC(5000, i));
		}
	}
}
