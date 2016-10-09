package ch.fdehedin.oca.buildingblocks;

public class ImmutableString {

	public static void main (final String[] args){
	String s = "1";
		for(int i=1; i<10; i++){
			s = s+ String.valueOf(i);
			System.out.println(s+ " code: "+s.hashCode());
		}
	}
	
}
