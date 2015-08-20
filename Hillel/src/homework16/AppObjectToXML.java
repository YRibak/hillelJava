package homework16;

import com.thoughtworks.xstream.XStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
//---------- To XML with Xstream library -----------------
        List list = new ArrayList<>();
        list.add(personOne);
        list.add(personOne);
        list.add(personOne);
        list.add("Hello");
        list.add(1212);

        XStream xstream = new XStream();
        ObjectOutputStream out = null;
        try {
            out = xstream.createObjectOutputStream(new FileWriter("list.xml"));
            out.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ObjectInputStream in = null;
        List newList = null;
        try {
            in = xstream.createObjectInputStream(new FileReader("list.xml"));
            try {
                newList = (List) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (newList!=null){
            System.out.println(newList.size());
            System.out.println(list.get(1));
        }
    }

}
