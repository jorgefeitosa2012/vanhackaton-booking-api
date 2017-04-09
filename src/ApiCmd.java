

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/experiment")
public class ApiCmd {
	
	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {
		String result = "Error! Insert a valid ID!";
		return Response.status(200).entity(result).build();
	}

	@Path("{id}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("id") float id) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", id);
		jsonObject.put("probability", id);
		jsonObject.put("totalOccurrence", id);

		return Response.status(200).entity(jsonObject.toString()).build();
	}

	@Path("{id}/alternative/{alternativeId}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput2(@PathParam("alternativeId") float alternativeId) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", alternativeId);
		jsonObject.put("probability", alternativeId);
		jsonObject.put("totalOccurrence", alternativeId);

		return Response.status(200).entity(jsonObject.toString()).build();
	}

	@POST
	@Path("post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response convertFtoCfromInput3(ApiKeys sampleObject) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", sampleObject.getId());
		jsonObject.put("alternative", sampleObject.getAlternativeId());
		jsonObject.put("totalOccurrence", sampleObject.getOccurenceId());
		jsonObject.put("status", "success");

		return Response.status(200).entity(jsonObject.toString()).build();
	}

}