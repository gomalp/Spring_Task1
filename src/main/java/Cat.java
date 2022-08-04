public class Cat {
    private String message;
    private String name;
    Cat(String name, String message){
        this.name = name;
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat "+name+" says: "+ message;
    }
}
