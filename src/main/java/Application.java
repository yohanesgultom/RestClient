import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

public class Application {

	public static void main(String[] args) {
		DimanaService service = JAXRSClientFactory.create("http://crosscode.tk", DimanaService.class, Arrays.asList(new Object[]{ new JacksonJsonProvider()}));
		WebClient.client(service).accept(MediaType.APPLICATION_JSON).header("Content-Type", MediaType.APPLICATION_JSON);
		ClientConfiguration config = WebClient.getConfig(service);
		config.getInInterceptors().add(new LoggingInInterceptor());
		config.getOutInterceptors().add(new LoggingOutInterceptor());

		Dimana dimana1 = service.example("sesuatu");
		System.out.println(dimana1);
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map;
		map = new HashMap<String, String>();
		map.put("item", "Nasi Goreng");
		map.put("qty", "3");
		list.add(map);
		map = new HashMap<String, String>();
		map.put("item", "Cumi Goreng Tepung");
		map.put("qty", "2");
		list.add(map);
		Dimana dimana = service.example(list);
		System.out.println(dimana);
	}

}
