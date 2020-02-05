import model.Advertisment;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.LinkedList;
import java.util.List;

public class Parsing {

    private  String URL = "https://auto.ria.com/uk/search/?year[0].gte=2016&categories.main.id=1&brand.id[0]=62&model.id[0]=586&price.currency=1&abroad.not=0&custom.not=1&page=0&size=10";

    public  List<Advertisment> getInfo() {
        List<Advertisment> list = new LinkedList<>();
        try {
            Document doc = Jsoup.connect(URL).get();
            Elements elements = doc.getElementsByAttributeValue("class", "content");
            elements.forEach(element -> {
                String name = element.child(0).getElementsByAttributeValue("class", "address").attr("title");
                String price = element.child(1).getElementsByAttributeValue("class", "bold green size22").text();
                list.add(new Advertisment(name, price));
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}
