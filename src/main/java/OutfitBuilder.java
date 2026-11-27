import java.io.IOException;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import com.google.gson.Gson;

public class OutfitBuilder {

    public static void main(String[] args) {
        double temp = getAvgTemp();
        ArrayList<String> outfits = getOutfits(temp);
    }

    public static double getAvgTemp() {
        //format: call api, get temperature by hour
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m")).GET().build();
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            //find temperature for current day from 6 am local time to 8 pm (20 pm) local time, store in array

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //get average temperature of the day
        double avgTemp = 0.0;
        return avgTemp;
    }

    public static ArrayList<String> getOutfits(double avgTemp) {
        //see which temperature category avgTemp falls into
        //
        ArrayList<String> outfits = new ArrayList<>();
        String tempCategory = "";
        if (avgTemp <= 0.0) {
            tempCategory = "freezing";
        } else if (avgTemp <= 10.0) {
            tempCategory = "cold";
        } else if (avgTemp <= 15.0) {
            tempCategory = "cool";
        } else if (avgTemp <= 20.0) {
            tempCategory = "pleasant";
        } else {
            tempCategory = "warm";
        }
        return outfits;
    }
}