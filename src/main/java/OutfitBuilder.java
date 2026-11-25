import java.util.ArrayList;

public class OutfitBuilder {

    public static void main(String[] args) {
        double temp = getAvgTemp();
        ArrayList<String> outfits = getOutfits(temp);
    }

    public static double getAvgTemp() {
        //format: call api, get temperature by hour
        //find temperature for current day from 6 am local time to 8 pm (20 pm) local time, store in array
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