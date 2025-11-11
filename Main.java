public class Main {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.createServer("US-East");
        amazon.listServers("US-East");
        amazon.storeFile("report.pdf");
        System.out.println(amazon.getFile("report.pdf"));
        System.out.println("CDN Address: " + amazon.getCDNAddress());

        System.out.println("----------");

        Dropbox dropbox = new Dropbox();
        dropbox.storeFile("abc.png");
        System.out.println(dropbox.getFile("abc.png"));
    }
}
