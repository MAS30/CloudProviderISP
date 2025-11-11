public class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {

    @Override
    public void createServer(String region) {
        System.out.println("Amazon server created in region: " + region);
    }

    @Override
    public void listServers(String region) {
        System.out.println("Listing Amazon servers in region: " + region);
    }

    @Override
    public String getCDNAddress() {
        return "cdn.amazon.com";
    }

    @Override
    public void storeFile(String name) {
        System.out.println("File stored on Amazon S3: " + name);
    }

    @Override
    public String getFile(String name) {
        return "File retrieved from Amazon S3: " + name;
    }
}
