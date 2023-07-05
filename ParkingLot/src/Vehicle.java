public abstract class Vehicle {
    // fields

    protected Type type;

    // methods

    public Vehicle(Type type){
        this.type = type;
    }

    public Type getType(){
        return type;
    }
}
