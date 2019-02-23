
public class JamesBond {
int findCode(Vault vinney) {
	for(int i=0; i<=1000000; i++) {
		if(vinney.tryCode(i)) {
			return i;
		}
	}
	return -1;
}


}


