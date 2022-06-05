package DeviceController;

class Refrigerator {
  private String description;
  int usedEnergy=0;
  
  public Refrigerator(String description) {
       this.description=description;
  }

  public void on() {
      System.out.println(description + " Refrigerator on.");
      usedEnergy=10;
  }

  public void off() {
      System.out.println(description + " Refrigerator off.");

  }

  public void up() {
      System.out.println(description + " Refrigerator up.");
  }

  public void down() {
      System.out.println(description + " Refrigerator down.");
  }
public int getUsedEnergy() {
    return usedEnergy;
}
}