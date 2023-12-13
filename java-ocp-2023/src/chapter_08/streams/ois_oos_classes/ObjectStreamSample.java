package chapter_08.streams.ois_oos_classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * A very important example of using ObjectOutputStream wrapping the BufferedOutputStream which
 * wraps the FileOutputStream.
 * <p>
 * ObjectInputStream, BufferedInputStream and FileInputStream are used to read Animal objects
 * from the file.
 */
public class ObjectStreamSample {
    public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile))
        )) {
            for (Animal animal : animals) {
                objectOutputStream.writeObject(animal);
            }
        }
    }

    public static List<Animal> getAnimals(File dataFile) throws IOException,
            ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(dataFile))
        )) {
            while (true) {
                Object animal = objectInputStream.readObject();
                if (animal instanceof Animal) {
                    animals.add((Animal) animal);
                }
            }
        } catch (EOFException eofEx) {
            //System.out.println(eofEx.getMessage());
        }
        return animals;
    }

    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Tommy Tiger", 5, 'T'));
        animals.add(new Animal("Peter Penguin", 8, 'P'));
        File dataFile = new File("E:\\animal.txt");
        createAnimalsFile(animals, dataFile);
        System.out.println(getAnimals(dataFile));
    }

}
