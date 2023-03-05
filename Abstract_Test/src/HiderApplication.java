
public class HiderApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataHiding dataHider = new Hider();
		dataHider.wallet();
		dataHider.photos();
		dataHider.chat();		
		
		
		DataHiding dataHiderPro = new HiderPro();
		dataHiderPro.wallet();
		dataHiderPro.photos();
		dataHiderPro.chat();
		
		

	}

}
