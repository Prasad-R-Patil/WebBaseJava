package com.app;

public class Heart {
	
	String NameofAnimal;
	int NoOfHeart;
	
	public Heart()
	{System.out.println("In Constructor Heart");}
	

	public Heart(String nameofAnimal, int noOfHeart) {
		super();
		NameofAnimal = nameofAnimal;
		NoOfHeart = noOfHeart;
		System.out.println("In Param Const Heart");
	}


	public void Pumping() 
	{
		
		System.out.println("Your Heart Is Pumping....");
		System.out.println("You are Alive");
		
	}

	public String getNameofAnimal() {
		return NameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		NameofAnimal = nameofAnimal;
	}

	public int getNoOfHeart() {
		return NoOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		NoOfHeart = noOfHeart;
	}

	
	

}
