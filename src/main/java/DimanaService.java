import java.util.List;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/dimana/api")
public interface DimanaService {
	@POST
	@Path("/example")
	Dimana example(@FormParam("list") List<Map<String, String>> list);

	@GET
	@Path("/example")
	Dimana example(@QueryParam("code") String code);

}
