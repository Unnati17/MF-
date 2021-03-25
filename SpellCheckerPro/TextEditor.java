package SpellCheckerPro;

public class TextEditor{
	
	private IFortune fort;
	
	public IFortune getFort() {
		return fort;
	}

	public void setFort(IFortune fort) {
		System.out.println("Inside fortune setter");
		this.fort = fort;
	}

//	private SpellChecker sc;
//	
//	public TextEditor(SpellChecker sc)
//	{
//		this.sc=sc;
//	}
//	
//	public void spellChecker()
//	{
//		sc.display();
//	}

}
