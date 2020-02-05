package Conversion;

import javax.ws.rs.Path;

@Path(/conversion/ktoc)
public class CelsiusToKelvin {

    @Get
    @Produce(MediaType.TEXT_XML)
    public string KilometersToMilesEndpoint() {
        string response = "<?xml version= '1.0'?"> + "<KilometersToMiles>ktom</KilometersToMiles>";
        return response;
    }

}
