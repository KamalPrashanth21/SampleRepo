// Sample Change

interface beverages {
    void make();
}
class coffee implements beverages{
    public void make(){
        System.out.println("Making Coffee");
    }
}
class tea implements beverages{
    public void make(){
        System.out.println("Making tea");
    }
}
class juice implements beverages{
    public void make(){
        System.out.println("Making juice");
    }
}
class FactoryClass{      //creating a factoryclass to create objects
    public static beverages makeBeverages(String val){
        if(val.equalsIgnoreCase("Coffee")){
            return new coffee(); // returns an object
        }
        else if(val.equalsIgnoreCase("tea")){
            return new tea(); // returns an object
        }
        //now if i want to create a new object called juice
        else if(val.equalsIgnoreCase("juice")){
            return new juice();
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        beverages coffee = FactoryClass.makeBeverages("coffee"); //obj coffee is created using the factory class
        coffee.make();
        beverages tea = FactoryClass.makeBeverages("tea"); //obj tea is created using the factory class
        tea.make();
        // juice object is created and make method is called
        beverages juice = FactoryClass.makeBeverages("juice");
        juice.make();
    }
}