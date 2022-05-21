package decorator;

public abstract class ManagementFee {

    public String description = "Unknown ManagementFee";

    public abstract double bill();

    public String getDescription() {
        return description;
    }

}
