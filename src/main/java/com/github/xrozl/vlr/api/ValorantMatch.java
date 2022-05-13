package com.github.xrozl.vlr.api;

public class ValorantMatch {

    private String name_tournament;
    private String name_series;
    private String url_match;
    private String[] teams;

    public ValorantMatch() {
        this.name_tournament = "";
        this.name_series = "";
        this.url_match = "";
        this.teams = new String[2];
    }

    public String getName_tournament() {
        return name_tournament;
    }

    public void setName_tournament(String name_tournament) {
        this.name_tournament = name_tournament;
    }

    public String getName_series() {
        return name_series;
    }

    public void setName_series(String name_series) {
        this.name_series = name_series;
    }

    public String getUrl_match() {
        return url_match;
    }

    public void setUrl_match(String url_match) {
        this.url_match = url_match;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "ValorantMatch [name_tournament=" + name_tournament + ", name_series=" + name_series + ", url_match=" + url_match + ", teams=" + teams + "]";
    }

}
