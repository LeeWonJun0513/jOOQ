package org.jooq.conf;


import java.io.Serializable;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings({
	"all"
})

/* Extract 	Superclass 
 * MappedSchemaClass and MappedTable looks similar
 * so create superclass then, move common features to the superclass
*/

public class MappedBase
extends SettingsBase
implements Serializable, Cloneable{

	private static final long serialVersionUID = 31100L;
	protected String input;
	@XmlElement(type = String.class)
	@XmlJavaTypeAdapter(RegexAdapter.class)
	protected Pattern inputExpression;
	protected String output;

	public String getInput() {
		return input;
	}
	public void setInput(String value) {
		this.input = value;
	}

	public Pattern getInputExpression() {
		return inputExpression;
	}

	public void setInputExpression(Pattern value) {
		this.inputExpression = value;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String value) {
		this.output = value;
	}

}