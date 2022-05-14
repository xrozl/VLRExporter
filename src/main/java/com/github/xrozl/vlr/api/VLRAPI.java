package com.github.xrozl.vlr.api;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VLRAPI {

    public static final String URL_RESULTS = "https://www.vlr.gg/matches/results";

    public static List<ValorantMatch> getResults(int page) {
        List<ValorantMatch> matches = new ArrayList<>();
        try {
            String html = Jsoup.connect(URL_RESULTS).get().html();
            //System.out.println(html);
            Document doc = Jsoup.parse(html);
            int c = 0;
            for (Element element : doc.getElementsByClass("match-item-event text-of")) {
                String n = element.toString().split("</div>")[1].replaceFirst(" ", "").replaceAll("\n", "");
                ValorantMatch mt = new ValorantMatch();
                mt.setName_tournament(n);
                matches.add(mt);
            }
            for (Element element : doc.getElementsByClass("match-item-event-series text-of")) {
                matches.get(c).setName_series(element.text());
                c++;
            }
            c = 0;
            for (Element element : doc.getElementsByClass())
        } catch (Exception e) {
            e.printStackTrace();
        }
        return matches;
    }
}
