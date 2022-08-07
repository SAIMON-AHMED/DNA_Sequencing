public class DNA {
 //this program determines whether there is a protein in a strand of DNA.

  
  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    System.out.println(dna.length());
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    int startCodon = dna.indexOf("ATG");
    int stopCodon = dna.indexOf("TGA");
    System.out.println(startCodon);
    System.out.println(stopCodon);
    if ((startCodon != -1 && stopCodon != -1) && ((stopCodon-startCodon) % 3 == 0)) {
      String protein = dna.substring(startCodon + 3, stopCodon);
      System.out.println(protein);
    } else {
      System.out.println("No protein");
    }
  }
 
}
