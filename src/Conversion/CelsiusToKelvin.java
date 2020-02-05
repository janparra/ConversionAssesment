package Conversion;

import javax.ws.rs.Path;

@Path(/conversion/ctok)
public class CelsiusToKelvin {

    @Get
    @Produce(MediaType.TEXT_XML)
    public string ConvertCelsuisToKelvinEndpoint() {
        string response = "<?xml version= '1.0'?"> + "<CelsiusToKelvin>ctok</CelsiusToKelvin>";
        return response;
    }

}
