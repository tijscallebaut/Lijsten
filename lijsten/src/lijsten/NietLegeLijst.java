package lijsten;

import java.util.Objects;

public class NietLegeLijst extends Lijst {
	
	public final int kop;
	public final Lijst staart;
	
	public NietLegeLijst(int kop, Lijst staart) {
		this.kop = kop;
		this.staart = staart;
	}
	
	@Override
	public int getLength() {
		return 1 + staart.getLength();
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof NietLegeLijst nll &&
				kop == nll.kop &&
				staart.equals(nll.staart);
	}
	@Override
	public int hashCode() {
		return Objects.hash(kop,staart);
	}
	@Override
	public String toString() {
		if (staart instanceof LegeLijst)
			return "[" + kop + "]" ;
		else 
			return "[" + kop + "," + staart.toString().substring(1);
	}

}
