package javaProject;


import uca.jetty.Container;

public class Driver 
{
	public static void main(String[] args) 
	{

		Container.startServer(80);
		Container.addHandler(new StoreJSON(),"/orderjson");
		Container.addHandler(new CustomerJSON(),"/customerjson");
		//Container.addHandler(new StoreHTML(), "/html");
		Container.addHandler(new Receipt(), "/Receipt");
		Container.addHandler(new PlacingOrder(), "/Order");
	}	//end main
}//Driver
