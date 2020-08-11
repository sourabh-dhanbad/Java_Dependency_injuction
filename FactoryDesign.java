

package interfaceexample;



public class FactoryDesign {

    //Iwriter iwrit;

    public static Iwriter getInstance(String classname)
    {

        if(classname.equals("PDFwriter"))
        {
            return new PDFwriter();
        }
        else
        {
             return new HTMLwriter();
        }

    }

}
