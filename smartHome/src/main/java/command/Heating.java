package command;

class Heating {
  private String description;

  public Heating(String description) {
       this.description=description;
  }

  public void on() {
      System.out.println(description + " Heating on.");
  }

  public void off() {
      System.out.println(description + " Heating off.");
  }

}
