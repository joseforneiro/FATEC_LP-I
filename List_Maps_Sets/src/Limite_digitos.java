

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Limite_digitos extends PlainDocument{
private int quantidadeMax;
public Limite_digitos(int maxLen) {
	super();
	if(maxLen < 0)
		throw new IllegalArgumentException("Expecifique a quantidade!");
	quantidadeMax = maxLen;
}
	@Override
	public void insertString(int offs, String str, AttributeSet attr) throws BadLocationException{
		if(str==null || getLength() == quantidadeMax)
			return;
		int totalquantia = (getLength() + str.length());
		if (totalquantia <= quantidadeMax) {
			super.insertString(offs, str.replaceAll("[^a-z | ^A-Z]",""), attr);
			return;
		}
		String nova = str.substring(0,getLength() - quantidadeMax);
		super.insertString(offs, nova, attr);
	}
}
