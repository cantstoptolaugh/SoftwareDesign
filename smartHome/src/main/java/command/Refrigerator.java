package command;

class Refrigerator {
  private String description;

  public Refrigerator(String description) {
       this.description=description;
  }

  public void on() {
      System.out.println(description + " Refrigerator on.");
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

}
