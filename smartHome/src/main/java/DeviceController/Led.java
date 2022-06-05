package DeviceController;

class Led {
  private String description;
  int usedEnergy=0;
  public  Led(String description) {
      this.description=description;
  }

  public void on() {
      System.out.println(description + " Led on.");
      usedEnergy=1;
  }

  public void off( ) {
        System.out.println(description + " Led off.");
  }

  public int getUsedEnergy() {
    return usedEnergy;
}
}
