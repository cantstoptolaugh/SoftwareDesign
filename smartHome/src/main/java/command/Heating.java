package command;

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
  public void up() {
      System.out.println(description + " Heating up.");
  }

  public void down() {
      System.out.println(description + " Heating down.");
  }
  public int getUsedEnergy() {
    return usedEnergy;
}
}
