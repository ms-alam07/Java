// A Class which has to serialize must implements Serializable interface.

import java.io.Serializable;

public class SerializationDemo implements Serializable{
    public String name="Aadi";
     transient public String password="pass";
}
