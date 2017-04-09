import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName(value = "sampleObject")
public class ApiKeys {

	private long id;
	private long alternativeId;
	private long occurenceId;

	public long getOccurenceId() {
		return occurenceId;
	}

	public void setOccurenceId(long occurenceId) {
		this.occurenceId = occurenceId;
	}

	public long getAlternativeId() {
		return alternativeId;
	}

	public void setAlternativeId(long alternativeId) {
		this.alternativeId = alternativeId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
