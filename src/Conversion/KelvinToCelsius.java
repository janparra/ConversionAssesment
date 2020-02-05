package Conversion;

import javax.ws.rs.Path;

@Path(/conversion/ktoc)
public class KelvinToCelsius {

    @Get
    @Produce(MediaType.TEXT_XML)
    public string ConvertKelvinToCelsiusEndpoint() {
        string response = "<?xml version= '1.0'?"> + "<KelvinToCelsius>ktoc</KelvinToCelsius>";
        return response;
    }

}
