package DeviceController;

class Heating {
  private String description;
  int usedEnergy=0;
  public Heating(String description) {
       this.description=description;
  }

  public void on() {
      System.out.println(description + " Heating on.");
        usedEnergy=2;
  }

  public void off() {
      System.out.println(description + " Heating off.");

  }

  public int getUsedEnergy() {
    return usedEnergy;
}
}
