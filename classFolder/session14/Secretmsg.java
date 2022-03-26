package classFolder.session14;

public class Secretmsg {
    public static void main(String[] args) {
        String secretMessage = "Bzwarz!1It9is3java2whzn1you5arz4using3phonzs8during1thz9szssions";
        String temp = secretMessage.replace('z', 'e');
        temp = temp.replaceAll("\\d", " ");
        temp = temp.replaceFirst("java", "obvious");
        System.out.println(temp);
    }
}
