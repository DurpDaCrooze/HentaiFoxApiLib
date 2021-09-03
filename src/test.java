public class test {
    public static void main(String[] args){
        app HFA = new app();
        app.ip = "http://localhost:5000";
        app.token = "testoken";
        System.out.println(HFA.name(24));
        System.out.println(HFA.author(24));
        System.out.println(HFA.img(24));
    }
}
