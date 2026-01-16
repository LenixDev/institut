class TestAccess {
  public static void main(String[] arg) {
    PersonneTask p = new PersonneTask("lenix", 20);
    System.out.println(p.getNom());
    System.out.println(p.getAge());
  }
}