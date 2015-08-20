package homework16;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by yura on 20.08.15.
 */
public class AppObjectToXML {


    public static void main(String[] args) {
        Test personOne = new Test("Yura", 10);
        Path path = Paths.get("test.xml");
        JAXBContext jaxbContext = null;
        try {
            jaxbContext= JAXBContext.newInstance(Test.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(personOne, path.toFile());
            jaxbMarshaller.marshal(personOne, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Test personeOne = (Test) jaxbUnmarshaller.unmarshal(path.toFile());
            System.out.println(personeOne);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
