package meserakov_misha.Task02;

import java.io.*;


 /**
 * The class Thesecond implements serializable
 */ 
public class Thesecond implements Serializable {
    private transient String name; // transient поле
    private int age;


/** 
 *
 * Thesecond
 *
 * @param name  the name
 * @param age  the age
 * @return public
 */
    public Thesecond(String name, int age) { 

        this.name = name;
        this.age = age;
    }


/** 
 *
 * Save state
 *
 * @param filename  the filename
 * @throws   IOException 
 */
    public void saveState(String filename) throws IOException { 

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
        }
    }


/** 
 *
 * Load state
 *
 * @param filename  the filename
 * @throws   IOException
 * @throws  ClassNotFoundException 
 */
    public void loadState(String filename) throws IOException, ClassNotFoundException { 

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Thesecond restored = (Thesecond) in.readObject();
            this.name = restored.name;
            this.age = restored.age;
        }
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Name: " + name + ", Age: " + age;
    }
}


