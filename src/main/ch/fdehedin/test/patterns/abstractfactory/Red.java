package ch.fdehedin.test.patterns.abstractfactory;

public class Red implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Red::fill() method.");
	   }
	}