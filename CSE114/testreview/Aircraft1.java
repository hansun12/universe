
public class Aircraft {
       private String modelName;
       private int hoursBetweenOverhaul;
       private int hoursFlownSinceOverhaul;
       private String owner;

       public Aircraft(String iModelName, int iHoursBO, int hoursFlown, String iOwner) {
	   modelName = iModelName;
	   hoursBetweenOverhaul = iHoursBO;
	   hoursFlownSinceOverhaul = hoursFlown;
	   owner = iOwner;
       }

    public String getModelName() { return modelName; }

    public void setModelName(String newModelName) {
	modelName = newModelName;
    }


    public boolean needsOverhaul() {
	return (hoursBetweenOverhaul = hoursFlownSinceOverhaul) < 100;
    }

    public String toString() {
	return ("Aircraft: (" + modelName + " " + owner + " " + hoursFlownSinceOverhaul + ")" );
    }

}
