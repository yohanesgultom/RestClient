import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dimana {
	private String method;
	private String verb;
	private List<Map<String, String>> args;
	private Object request;
	private String endpoint;
	private String file;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}
	
	public Object getRequest() {
		return request;
	}

	public void setRequest(Object request) {
		this.request = request;
	}

	public void setArgs(List<Map<String, String>> args) {
		this.args = args;
	}

	public List<Map<String, String>> getArgs() {
		return args;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public String toString() {
		String str = "";
		str += "method : " + this.method + "\n";
		str += "verb : " + this.verb + "\n";
		str += "args : " + this.args + "\n";
		str += "request : " + this.request + "\n";
		str += "endpoint : " + this.endpoint + "\n";
		str += "file : " + this.file + "\n";
		return str;
	}
}
