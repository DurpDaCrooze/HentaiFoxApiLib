public class test {
    public static void main(String[] args){
        nHentai HFA = new nHentai();
        bedmcDB db = new bedmcDB();
        Pool pool = new Pool();

        pool.set("http://localhost:5000", "#x7C93NbfL2W_NYNy6yqR=Kp@AVa$kSna7Ryw49ZUsmjDzF!Defdy_TscNRSxP=K%?2PdF^Mdsavvd5xL3NVhfxP5#_n=Z#w@NmMkkfHPgaBCeM+L=N9wctd9rn#Rn57BELV$pyTMQv4v4HvzcL*HmxxT$-+SGsxzZfQDr+=rKEMBt28fU&d^vjB?hVj!EQ6#fNLswmmCHYmy!v&2x-E?PXyqV4bTHa?P=@m%c$S_qGGh6QsB!7GzQNpFrQHCeHb");
        HFA.set(pool);
        db.set(pool);

        System.out.println(HFA.name(24));
        System.out.println(HFA.author(24));
        System.out.println(HFA.img(24));

        System.out.println(bedmcDB.sendData("joemama", "6942"));


    }
}
