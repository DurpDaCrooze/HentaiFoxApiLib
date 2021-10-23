public class test {
    public static void main(String[] args){
        nHentai HFA = new nHentai();
        nHentai.ip = "http://nhentai-grabber.herokuapp.com";
        nHentai.token = "testoken";
        System.out.println(HFA.name(24));
        System.out.println(HFA.author(24));
        System.out.println(HFA.img(24));
    }
}
