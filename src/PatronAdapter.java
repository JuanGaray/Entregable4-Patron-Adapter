
public class PatronAdapter {
	public static void main(String args[]){
		Guitarra eGuitar = new GuitarraElectrica();
		eGuitar.onGuitar();
		eGuitar.offGuitar();
		Guitarra eAGuitar = new GuitarraElectroAcustica();
		eAGuitar.onGuitar();
		eAGuitar.offGuitar();
	}
 
 

	
}
