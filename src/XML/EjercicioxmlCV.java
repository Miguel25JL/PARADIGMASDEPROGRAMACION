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

public class EjercicioxmlCV {
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "curriculumv", null);
            documento.setXmlVersion("1.0");

            Element datosM = documento.createElement("datosM");
            Element MiguelML = documento.createElement("MiguelML");

            Element nombre = documento.createElement("nombre");
            Text textNombre = documento.createTextNode("Miguel Monroy Lopez");
            nombre.appendChild(textNombre);
            MiguelML.appendChild(nombre);

            Element formacionAcad = documento.createElement("formacionAcademica");
            Text textFormacionAcad = documento.createTextNode("Ingenieria en Computacion");
            formacionAcad.appendChild(textFormacionAcad);
            MiguelML.appendChild(formacionAcad);

            Element fechaN = documento.createElement("fechadeNacimiento");
            Text textFechaN = documento.createTextNode("25/03/2003");
            fechaN.appendChild(textFechaN);
            MiguelML.appendChild(fechaN);

            Element direccion = documento.createElement("direccion");
            Text textDireccion = documento.createTextNode("Jocotitlan");
            direccion.appendChild(textDireccion);
            MiguelML.appendChild(direccion);

            Element telefono = documento.createElement("telefono");
            Text textTelefono = documento.createTextNode("7122583776");
            telefono.appendChild(textTelefono);
            MiguelML.appendChild(telefono);

            Element correo = documento.createElement("correo");
            Text textCorreo = documento.createTextNode("miguelmonroy2003lop@gmail.com");
            correo.appendChild(textCorreo);
            MiguelML.appendChild(correo);

            Element nacionalidad = documento.createElement("nacionalidad");
            Text textNacionalidad = documento.createTextNode("mexicana");
            nacionalidad.appendChild(textNacionalidad);
            MiguelML.appendChild(nacionalidad);

            datosM.appendChild(MiguelML);

            documento.getDocumentElement().appendChild(datosM);

            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("curriculumv.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}