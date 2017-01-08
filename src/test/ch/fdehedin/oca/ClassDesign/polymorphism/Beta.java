package ch.fdehedin.oca.ClassDesign.polymorphism;

public class Beta extends Baap{
	public int h = 44;

	public int getH() throws Exception{
		System.out.println("Beta " + h);
		return h;
	}
	
	public static void main(String[] args) throws Exception{
		Baap p = new Beta();
		System.out.println(p.h + " " +p.getH());
		System.out.println(p.h);
		Beta b = new Beta();
	//	System.out.println(b.h);
	}
}
