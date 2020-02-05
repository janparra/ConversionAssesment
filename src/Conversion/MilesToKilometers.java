package Conversion;

import javax.ws.rs.Path;

@Path(/conversion/mtok)
public class MilesToKilometers {

    @Get
    @Produce(MediaType.TEXT_XML)
    public string ConvertMilesToKilometersEndpoint() {
        string response = "<?xml version= '1.0'?"> + "<MilesToKilometers>mtok</MilesToKilometers>";
        return response;
    }

}
