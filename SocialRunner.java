public class SocialRunner {
    public static void main(String[] args) {
        Social social1 = new Social("463-44-5678");
        System.out.println(social1.validate());

        Social social2 = new Social("46-144-5678");
        System.out.println(social2.validate());

        Social social3 = new Social("111-44-5678");
        System.out.println(social3.validate());

        Social social4 = new Social("463044-5678");
        System.out.println(social4.validate());

        Social social5 = new Social("463-99-8888");
        System.out.println(social5.validate());

        Social social6 = new Social("123-11-5323");
        System.out.println(social6.validate());

        Social social7 = new Social("463-4-55678");
        System.out.println(social7.validate());

        Social social8 = new Social("46314415678");
        System.out.println(social8.validate());
    }
}