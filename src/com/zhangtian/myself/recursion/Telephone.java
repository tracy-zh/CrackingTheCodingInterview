package com.zhangtian.myself.recursion;

public class Telephone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {2,3,4};
		StringBuilder output = new StringBuilder();
		//getCharKey(5, 2);

		telephoneNumber(number, output, 0);
	}
	
	static void telephoneNumber(int[] number, StringBuilder output, int current){
		if(current == number.length) 
			System.out.println(output);
		else {
			for(int i = 1; i <= 3; i++) {
				int n = number[current];
				output.append(getCharKey(n, i));
				telephoneNumber(number, output, current + 1);
				output.deleteCharAt(output.length() - 1);
			}
		}
	}

	static Character getCharKey(int telephoneKey, int place) {
		char c = 0;
		if(telephoneKey == 2){
			if(place == 1)
				c = 'A';
			else if(place == 2)
				c =  'B';
			else if(place == 3)
				c =  'C';
		}
		else if(telephoneKey == 3){
			if(place == 1)
				c =  'D';
			else if(place == 2)
				c =  'E';
			else if(place == 3)
				c =  'F';
		}
		else if(telephoneKey == 4){
			if(place == 1)
				c =  'G';
			else if(place == 2)
				c =  'H';
			else if(place == 3)
				c =  'I';
		}
		else if(telephoneKey == 5){
			if(place == 1)
				c =  'J';
			else if(place == 2)
				c =  'K';
			else if(place == 3)
				c =  'L';
		}
		else if(telephoneKey == 6){
			if(place == 1)
				c =  'M';
			else if(place == 2)
				c =  'N';
			else if(place == 3)
				c =  'O';
		}
		else if(telephoneKey == 7){
			if(place == 1)
				c =  'P';
			else if(place == 2)
				c =  'R';
			else if(place == 3)
				c =  'S';
		}
		else if(telephoneKey == 8){
			if(place == 1)
				c =  'T';
			else if(place == 2)
				c =  'U';
			else if(place == 3)
				c =  'V';
		}
		else if(telephoneKey == 9){
			if(place == 1)
				c =  'W';
			else if(place == 2)
				c =  'X';
			else if(place == 3)
				c =  'Y';
		}
		return c;
	}

}
