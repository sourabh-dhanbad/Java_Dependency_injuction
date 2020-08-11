
package interfaceexample;

public class Main {

  
    public static void main(String[] args) {

       Iwriter wr=FactoryDesign.getInstance("PDFwriter");
       wr.writter();

    }

}
