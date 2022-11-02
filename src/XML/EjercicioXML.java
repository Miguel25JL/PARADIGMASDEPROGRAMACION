package XML;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


public class EjercicioXML {
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "concesionario", null);
            documento.setXmlVersion("1.0");

            Element coches = documento.createElement("coches");
            Element coche = documento.createElement("coche");

            Element matricula = documento.createElement("matricula");
            Text textMatricula = documento.createTextNode("111AAA");
            matricula.appendChild(textMatricula);
            coche.appendChild(matricula);


            Element marca = documento.createElement("marca");
            Text textMarca = documento.createTextNode("AUDI");
            marca.appendChild(textMarca);
            coche.appendChild(marca);

            Element precio = documento.createElement("precio");
            Text textPrecio = documento.createTextNode("30000");
            precio.appendChild(textPrecio);
            coche.appendChild(precio);

            coches.appendChild(coche);

            documento.getDocumentElement().appendChild(coches);

            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("concesionario.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);



        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}