package org.SearchBreed;

import org.ListOfAllBreeds.ListOfAllBreeds;

public class SearchBreed {
	
	public boolean searchBreed(String breed) throws Exception
	{
		boolean flag = false;
		
		ListOfAllBreeds lsb = new ListOfAllBreeds();
		String breeds = lsb.getAllBreeds();
		
		if(breeds.contains(breed))
		{
			flag = true;
		}
		
		return flag;
	}

}
