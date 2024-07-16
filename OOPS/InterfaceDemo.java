// NOTE: All the methods inside interface is made abstract but after JAVA 8 we can create Concrerte Methods also but the access modifier should be Default and Static Methods with Access Modifier as public as same level Access Modifier.

class phone{
    void call(){}
    void sms(){}
}

interface camera{
    public abstract void click(); // it is public abstract((Internal Details is Hidden and showing only required features))
    void record();
    public static final int a=10; // it is made static and final because no object can be created and value cannot be changed ((feild inside interface))
}
interface multiplayer{
    void play();
    void pause();
    void stop();
}

public class InterfaceDemo extends phone implements camera,multiplayer  {
    //All the methods inside inteface should be overrided inside class implementing interface
    public void click(){}
    public void record(){}
    public void play(){}
    public void  pause(){}
    public void  stop(){}

}
