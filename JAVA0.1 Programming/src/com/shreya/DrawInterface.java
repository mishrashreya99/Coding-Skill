package com.shreya;

	public interface DrawInterface
	{
		public abstract void draw();
		default void display()
    {
    	System.out.println("display method running inside draw interface");
    }
}
