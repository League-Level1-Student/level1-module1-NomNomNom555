import java.util.Random;

public class Vault {
	Vault(int k){
		secretCode=  k;
	}
		int secretCode;
		boolean tryCode( int guess ) {
			if(guess== secretCode) {
				return true;
			}
			else {
				return false;
			}
		}
}

	
	//1. We need a Vault object that contains a secret code.
	//It also contains a tryCode() method that takes a number as a parameter and returns true if that number opens the vault, false otherwise.

	//2. Test the vault object using a main method.

	//3. Make a James Bond class that has a method findCode() that takes a Vault as a parameter.
	//The codes are between 0 and 1 million. This method tries all the codes, and returns the first code that opens the vault, or -1 if no code opened the vault.

	//4. Test your code by instantiating the JamesBond and Vault classes.

	//5. Add a constructor for Vault so that you can easily set the secret code. 


