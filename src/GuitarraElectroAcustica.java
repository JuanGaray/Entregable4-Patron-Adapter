
public class GuitarraElectroAcustica extends Guitarra {

		GuitarraAcustica acoustic = new GuitarraAcustica();
 
		public void onGuitar() {
			acoustic.play();
		}
 
		public void offGuitar() {
			acoustic.leaveGuitar();
		}
	
}
