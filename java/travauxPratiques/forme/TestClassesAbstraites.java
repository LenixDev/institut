package forme;
class TestClassesAbstraites {
  public static void main(String[] args) {
		//Forme forme = new Forme("rouge",0,0);//❌ERREUR
    Forme rectangle = new Rectangle(5, 3, "bleu", 10, 10);
    Forme cercle = new Cercle(4, "rouge", 0, 0);
    Forme triangle = new Triangle("vert", 5, 5, 6, 4, 5, 5, 6);

    Forme[] polymorphe = new Forme[]{rectangle, cercle, triangle};

    for (Forme forme : polymorphe) {
      forme.afficherInfo();
    }
    if (rectangle instanceof Rectangle) {
      Rectangle newRectangle = (Rectangle) rectangle;
      System.out.println("est carre: " + newRectangle.estCarre());
    }
	}
}