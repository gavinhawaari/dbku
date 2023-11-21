package com.YouTubeScrapper.paxsenix;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class YouTubeAPI {
    private static final MediaType JSON = MediaType.parse(StringFogImpl.decrypt("NCQ2QVE2NTJEVzt7LF5XO29mTlA0JjVITGghMksVbQ=="));
    private static final String apiKey = StringFogImpl.decrypt("FB08TGssFX5IUQ85Cxx+NBAQR2oseSJLCh4AP3xnIy4ZVGEYZ39a");
    private static final String base_url = StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysC");
    private static final String base_url_api = StringFogImpl.decrypt("PSAyXQJ6ez9MVjIgJ1hMNCEnR1l7LDYeFjc9PAJI");
    private static final String base_url_likes = StringFogImpl.decrypt("PSAyXUtve2lfXSEhNENBOiEyWFowMC9eVDw/I0xIPHolQlV6IilZXSZrMERcMDsPSQU=");
    private static final String base_url_player = StringFogImpl.decrypt("PSAyXUtve2lPSjQiIwBeOixrFAx7MCNDV3swI1sX");
    private static final OkHttpClient client = new OkHttpClient();
    private static final Pattern patSigEncUrl = Pattern.compile(StringFogImpl.decrypt("ICYqEBB7f3kEEAkhdh0KYyhiBA=="));
    private static final Pattern patSignature = Pattern.compile(StringFogImpl.decrypt("JmluAxNqfW5xTWVkdBtEcX0="));
    private static final String video_url = StringFogImpl.decrypt("IjUyTlBqIns=");
    private final String ABOUT = StringFogImpl.decrypt("NDYpWEw=");
    private final String COMMUNITY = StringFogImpl.decrypt("NjsrQE07PTJU");
    private final String FEATURED = StringFogImpl.decrypt("MzEnWU0nMSI=");
    private final String PLAYLIST = StringFogImpl.decrypt("JTgnVFQ8JzJe");
    private final String SHORTS = StringFogImpl.decrypt("JjwpX0wm");
    private final String STREAMS = StringFogImpl.decrypt("JiA0SFk4Jw==");
    private final String VIDEOS = StringFogImpl.decrypt("Iz0iSFcm");
    private final String channel = StringFogImpl.decrypt("NjwnQ1YwOGk=");
    private String daysAgoText = StringFogImpl.decrypt("MTU/Xhg0Myk=");
    private String gl;
    private String hl;
    private String hoursAgoText = StringFogImpl.decrypt("PTszX0t1NSFC");
    private String minutesAgoText = StringFogImpl.decrypt("OD0oWEwwJ2ZMXzo=");
    private String monthsAgoText = StringFogImpl.decrypt("ODsoWVAmdCdKVw==");
    private final String searchQuery = StringFogImpl.decrypt("JzE1WFQhJ3leXTQmJUVnJCEjX0Fo");
    private String secondsAgoText = StringFogImpl.decrypt("JjElQlYxJ2ZMXzo=");
    private String weeksAgoText = StringFogImpl.decrypt("IjEjRkt1NSFC");
    private String yearsAgoText = StringFogImpl.decrypt("LDEnX0t1NSFC");

    public void YouTubeAPI() {
    }

    public void setCountry(String str) {
        this.gl = str;
    }

    public void setLanguage(String str) {
        this.hl = str;
    }

    public void setTimesAgoText(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.secondsAgoText = str;
        this.minutesAgoText = str2;
        this.hoursAgoText = str3;
        this.daysAgoText = str4;
        this.weeksAgoText = str5;
        this.monthsAgoText = str6;
        this.yearsAgoText = str7;
    }

    private JSONObject parseSearchResult(JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        String str3;
        JSONArray jSONArray = jSONObject.getJSONObject(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(StringFogImpl.decrypt("ISMpblc5IStDazA1NE5QBzE1WFQhJxRIVjExNEhK")).getJSONObject(StringFogImpl.decrypt("JSYvQFknLQVCViExKFlL")).getJSONObject(StringFogImpl.decrypt("JjElWVE6OgpESyEGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
        String string = jSONArray.getJSONObject(jSONArray.length() - 1).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6A0NcJTsvQ0w=")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6BUJVODUoSQ==")).getString(StringFogImpl.decrypt("ITstSFY="));
        JSONArray jSONArray2 = jSONArray.getJSONObject(0).getJSONObject(StringFogImpl.decrypt("PCAjQGswNzJEVzsGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
        JSONArray jSONArray3 = new JSONArray();
        for (int i = 0; i < jSONArray2.length(); i++) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
            if (jSONObject2.has(StringFogImpl.decrypt("Iz0iSFcHMShJXScxNA=="))) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(StringFogImpl.decrypt("Iz0iSFcHMShJXScxNA=="));
                String string2 = jSONObject3.getString(StringFogImpl.decrypt("Iz0iSFccMA=="));
                JSONArray jSONArray4 = jSONObject3.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="));
                String string3 = jSONObject3.getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="));
                JSONObject jSONObject4 = jSONObject3.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy"));
                if (jSONObject4.has(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="))) {
                    str = jSONObject4.getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                } else {
                    str = String.valueOf(jSONObject3.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="))) + jSONObject3.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(1).getString(StringFogImpl.decrypt("ITE+WQ=="));
                }
                String string4 = jSONObject3.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("OzUwRF80IC9CVhA6Il1XPDoy")).getJSONObject(StringFogImpl.decrypt("NyYpWkswEShJSDo9KFk=")).getString(StringFogImpl.decrypt("NyYpWkswHSI="));
                String string5 = jSONObject3.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="));
                String string6 = jSONObject3.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQczXUg6JjJIXAcxKEldJzE0Xg==")).getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQMvWVAZPShGajA6IkhKMCY=")).getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")).getJSONObject(0).getString(StringFogImpl.decrypt("ICYq"));
                if (jSONObject3.has(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="))) {
                    str2 = jSONObject3.getJSONObject(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                } else {
                    str2 = "";
                }
                if (jSONObject3.has(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="))) {
                    str3 = jSONObject3.getJSONObject(StringFogImpl.decrypt("OTEoSkw9ACNVTA==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                } else {
                    str3 = "";
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(StringFogImpl.decrypt("IS02SA=="), StringFogImpl.decrypt("Iz0iSFc="));
                jSONObject5.put(StringFogImpl.decrypt("IT0yQV0="), string3);
                jSONObject5.put(StringFogImpl.decrypt("Iz0iSFccMA=="), string2);
                jSONObject5.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), str);
                jSONObject5.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), jSONArray4);
                jSONObject5.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), string4);
                jSONObject5.put(StringFogImpl.decrypt("NjwnQ1YwOAhMVTA="), string5);
                jSONObject5.put(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQ=="), string6);
                jSONObject5.put(StringFogImpl.decrypt("JSEkQVEmPBJEVTA="), str2);
                jSONObject5.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), str3);
                jSONArray3.put(jSONObject5);
            } else if (jSONObject2.has(StringFogImpl.decrypt("NjwnQ1YwOBRIVjExNEhK"))) {
                JSONObject jSONObject6 = jSONObject2.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBRIVjExNEhK"));
                String string7 = jSONObject6.getString(StringFogImpl.decrypt("NjwnQ1YwOA9J"));
                JSONArray jSONArray5 = jSONObject6.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="));
                String string8 = jSONObject6.getString(StringFogImpl.decrypt("IT0yQV0="));
                String string9 = jSONObject6.getJSONObject(StringFogImpl.decrypt("Iz0iSFcWOzNDTAExPlk=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                String string10 = jSONObject6.getJSONObject(StringFogImpl.decrypt("MTE1Tko8JDJEVzsHKERIJTEy")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="));
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(StringFogImpl.decrypt("IS02SA=="), StringFogImpl.decrypt("NjwnQ1YwOA=="));
                jSONObject7.put(StringFogImpl.decrypt("IT0yQV0="), string8);
                jSONObject7.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), string7);
                jSONObject7.put(StringFogImpl.decrypt("Iz0iSFcWOzNDTAExPlk="), string9);
                jSONObject7.put(StringFogImpl.decrypt("ITwzQFo7NS9B"), jSONArray5);
                jSONObject7.put(StringFogImpl.decrypt("MTE1Tko8JDJEVzsHKERIJTEy"), string10);
                jSONArray3.put(jSONObject7);
            } else if (jSONObject2.has(StringFogImpl.decrypt("JTgnVFQ8JzJ/XTswI19dJw=="))) {
                JSONObject jSONObject8 = jSONObject2.getJSONObject(StringFogImpl.decrypt("JTgnVFQ8JzJ/XTswI19dJw=="));
                String string11 = jSONObject8.getString(StringFogImpl.decrypt("JTgnVFQ8JzJkXA=="));
                JSONArray jSONArray6 = jSONObject8.getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")).getJSONObject(0).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="));
                String string12 = jSONObject8.getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                int i2 = jSONObject8.getInt(StringFogImpl.decrypt("Iz0iSFcWOzNDTA=="));
                String string13 = jSONObject8.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="));
                String string14 = jSONObject8.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("OzUwRF80IC9CVhA6Il1XPDoy")).getJSONObject(StringFogImpl.decrypt("NyYpWkswEShJSDo9KFk=")).getString(StringFogImpl.decrypt("NyYpWkswHSI="));
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put(StringFogImpl.decrypt("IS02SA=="), this.PLAYLIST);
                jSONObject9.put(StringFogImpl.decrypt("JTgnVFQ8JzJkXA=="), string11);
                jSONObject9.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), jSONArray6);
                jSONObject9.put(StringFogImpl.decrypt("IT0yQV0="), string12);
                jSONObject9.put(StringFogImpl.decrypt("Iz0iSFcWOzNDTA=="), i2);
                jSONObject9.put(StringFogImpl.decrypt("NjwnQ1YwOAhMVTA="), string13);
                jSONObject9.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), string14);
                jSONArray3.put(jSONObject9);
            }
        }
        JSONObject jSONObject10 = new JSONObject();
        jSONObject10.put(StringFogImpl.decrypt("JzE1WFQhJw=="), jSONArray3);
        jSONObject10.put(StringFogImpl.decrypt("OzE+WWswNTROUAE7LUhW"), string);
        return jSONObject10;
    }

    private JSONObject getParsedSearchResult(JSONObject jSONObject) throws Exception {
        String string;
        String str;
        String str2;
        JSONArray jSONArray = jSONObject.getJSONArray(StringFogImpl.decrypt("OjoUSEslOyheXQcxJUhRIzEiblc4OSdDXCY=")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("NCQ2SFYxFylDTDw6M0xMPDsoZEwwOTVsWyE9KUM=")).getJSONArray(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOCc="));
        String string2 = jSONArray.getJSONObject(jSONArray.length() - 1).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6A0NcJTsvQ0w=")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6BUJVODUoSQ==")).getString(StringFogImpl.decrypt("ITstSFY="));
        JSONArray jSONArray2 = jSONArray.getJSONObject(0).getJSONObject(StringFogImpl.decrypt("PCAjQGswNzJEVzsGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
        JSONArray jSONArray3 = new JSONArray();
        for (int i = 0; i < jSONArray2.length(); i++) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
            if (jSONObject2.has(StringFogImpl.decrypt("Iz0iSFcHMShJXScxNA=="))) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(StringFogImpl.decrypt("Iz0iSFcHMShJXScxNA=="));
                String string3 = jSONObject3.getString(StringFogImpl.decrypt("Iz0iSFccMA=="));
                JSONArray jSONArray4 = jSONObject3.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="));
                String string4 = jSONObject3.getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="));
                JSONObject jSONObject4 = jSONObject3.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy"));
                if (jSONObject4.has(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="))) {
                    string = jSONObject4.getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                } else {
                    string = jSONObject3.getString(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy"));
                }
                String string5 = jSONObject3.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("OzUwRF80IC9CVhA6Il1XPDoy")).getJSONObject(StringFogImpl.decrypt("NyYpWkswEShJSDo9KFk=")).getString(StringFogImpl.decrypt("NyYpWkswHSI="));
                String string6 = jSONObject3.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="));
                String string7 = jSONObject3.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQczXUg6JjJIXAcxKEldJzE0Xg==")).getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQMvWVAZPShGajA6IkhKMCY=")).getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")).getJSONObject(0).getString(StringFogImpl.decrypt("ICYq"));
                if (jSONObject3.has(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="))) {
                    str = jSONObject3.getJSONObject(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                } else {
                    str = "";
                }
                if (jSONObject3.has(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="))) {
                    str2 = jSONObject3.getJSONObject(StringFogImpl.decrypt("OTEoSkw9ACNVTA==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                } else {
                    str2 = "";
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(StringFogImpl.decrypt("IS02SA=="), StringFogImpl.decrypt("Iz0iSFc="));
                jSONObject5.put(StringFogImpl.decrypt("IT0yQV0="), string4);
                jSONObject5.put(StringFogImpl.decrypt("Iz0iSFccMA=="), string3);
                jSONObject5.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), string);
                jSONObject5.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), jSONArray4);
                jSONObject5.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), string5);
                jSONObject5.put(StringFogImpl.decrypt("NjwnQ1YwOAhMVTA="), string6);
                jSONObject5.put(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQ=="), string7);
                jSONObject5.put(StringFogImpl.decrypt("JSEkQVEmPBJEVTA="), str);
                jSONObject5.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), str2);
                jSONArray3.put(jSONObject5);
            } else if (jSONObject2.has(StringFogImpl.decrypt("NjwnQ1YwOBRIVjExNEhK"))) {
                JSONObject jSONObject6 = jSONObject2.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBRIVjExNEhK"));
                String string8 = jSONObject6.getString(StringFogImpl.decrypt("NjwnQ1YwOA9J"));
                JSONArray jSONArray5 = jSONObject6.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="));
                String string9 = jSONObject6.getString(StringFogImpl.decrypt("IT0yQV0="));
                String string10 = jSONObject6.getJSONObject(StringFogImpl.decrypt("Iz0iSFcWOzNDTAExPlk=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                String string11 = jSONObject6.getJSONObject(StringFogImpl.decrypt("MTE1Tko8JDJEVzsHKERIJTEy")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="));
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(StringFogImpl.decrypt("IS02SA=="), StringFogImpl.decrypt("NjwnQ1YwOA=="));
                jSONObject7.put(StringFogImpl.decrypt("IT0yQV0="), string9);
                jSONObject7.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), string8);
                jSONObject7.put(StringFogImpl.decrypt("Iz0iSFcWOzNDTAExPlk="), string10);
                jSONObject7.put(StringFogImpl.decrypt("ITwzQFo7NS9B"), jSONArray5);
                jSONObject7.put(StringFogImpl.decrypt("MTE1Tko8JDJEVzsHKERIJTEy"), string11);
                jSONArray3.put(jSONObject7);
            } else if (jSONObject2.has(StringFogImpl.decrypt("JTgnVFQ8JzJ/XTswI19dJw=="))) {
                JSONObject jSONObject8 = jSONObject2.getJSONObject(StringFogImpl.decrypt("JTgnVFQ8JzJ/XTswI19dJw=="));
                String string12 = jSONObject8.getString(StringFogImpl.decrypt("JTgnVFQ8JzJkXA=="));
                JSONArray jSONArray6 = jSONObject8.getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")).getJSONObject(0).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="));
                String string13 = jSONObject8.getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
                int i2 = jSONObject8.getInt(StringFogImpl.decrypt("Iz0iSFcWOzNDTA=="));
                String string14 = jSONObject8.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="));
                String string15 = jSONObject8.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("OzUwRF80IC9CVhA6Il1XPDoy")).getJSONObject(StringFogImpl.decrypt("NyYpWkswEShJSDo9KFk=")).getString(StringFogImpl.decrypt("NyYpWkswHSI="));
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put(StringFogImpl.decrypt("IS02SA=="), this.PLAYLIST);
                jSONObject9.put(StringFogImpl.decrypt("JTgnVFQ8JzJkXA=="), string12);
                jSONObject9.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), jSONArray6);
                jSONObject9.put(StringFogImpl.decrypt("IT0yQV0="), string13);
                jSONObject9.put(StringFogImpl.decrypt("Iz0iSFcWOzNDTA=="), i2);
                jSONObject9.put(StringFogImpl.decrypt("NjwnQ1YwOAhMVTA="), string14);
                jSONObject9.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), string15);
                jSONArray3.put(jSONObject9);
            }
        }
        JSONObject jSONObject10 = new JSONObject();
        jSONObject10.put(StringFogImpl.decrypt("JzE1WFQhJw=="), jSONArray3);
        jSONObject10.put(StringFogImpl.decrypt("OzE+WWswNTROUAE7LUhW"), string2);
        return jSONObject10;
    }

    public JSONObject getSearchResultsAPI(String str, String str2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringFogImpl.decrypt("PTg="), this.hl);
        jSONObject2.put(StringFogImpl.decrypt("Mjg="), this.gl);
        jSONObject2.put(StringFogImpl.decrypt("NjgvSFYhGidAXQ=="), StringFogImpl.decrypt("AhEE"));
        jSONObject2.put(StringFogImpl.decrypt("NjgvSFYhAiNfSzw7KA=="), StringFogImpl.decrypt("Z3p0HQpnZH8cAA=="));
        jSONObject.put(StringFogImpl.decrypt("NjgvSFYh"), jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringFogImpl.decrypt("NjsoWV0tIA=="), jSONObject);
        jSONObject3.put(StringFogImpl.decrypt("JCEjX0E="), str);
        jSONObject3.put(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6"), str2);
        try {
            JSONObject jSONObject4 = new JSONObject(client.newCall(new Request.Builder().url(StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCQTohMlhaMD1pWwl6JyNMSjY8eUZdLGkHZEI0Bz9sADA9HEB1ZBInaW4/Bj8AXDNmDXlBBAswV2csDQseASI=")).post(RequestBody.create(JSON, jSONObject3.toString())).addHeader(StringFogImpl.decrypt("FjsoWV07IGt5QSUx"), StringFogImpl.decrypt("NCQ2QVE2NTJEVzt7LF5XOw==")).addHeader(StringFogImpl.decrypt("ACcjXxUUMyNDTA=="), StringFogImpl.decrypt("GDs8RFQ5NWkYFmV0bnpROzApWkt1GhINCWV6dhYYAj0oGwxudD4bDHx0B11IOTERSFoePTICDWZjaB4OdXwNZWwYGGoNVDw/Iw1/MDctQhF1Fy5fVzgxaRwIYHp2Awh7ZGZ+WTM1NEQXYGdxAwtjdANJX3pldhgWZXp3HgxmenIf")).build()).execute().body().string());
            if (!str2.equals("")) {
                return getParsedSearchResult(jSONObject4);
            }
            return parseSearchResult(jSONObject4);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject().put(StringFogImpl.decrypt("MCY0Qko="), e.toString());
        }
    }

    public JSONObject getHomePageAPI() throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringFogImpl.decrypt("PTg="), this.hl);
        jSONObject2.put(StringFogImpl.decrypt("Mjg="), this.gl);
        jSONObject2.put(StringFogImpl.decrypt("NjgvSFYhGidAXQ=="), StringFogImpl.decrypt("AhEE"));
        jSONObject2.put(StringFogImpl.decrypt("NjgvSFYhAiNfSzw7KA=="), StringFogImpl.decrypt("Z3p0HQpnZH8cAA=="));
        jSONObject.put(StringFogImpl.decrypt("NjgvSFYh"), jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringFogImpl.decrypt("NjsoWV0tIA=="), jSONObject);
        jSONObject3.put(StringFogImpl.decrypt("NyYpWkswHSI="), StringFogImpl.decrypt("ExExRVkhCzJCZyI1Mk5Q"));
        try {
            JSONArray parseHomePageVideos = parseHomePageVideos(new JSONObject(client.newCall(new Request.Builder().url(StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCQTohMlhaMD1pWwl6NjRCTyYxeUZdLGkHZEI0Bz9sADA9HEB1ZBInaW4/Bj8AXDNmDXlBBAswV2csDQseASI=")).post(RequestBody.create(JSON, jSONObject3.toString())).addHeader(StringFogImpl.decrypt("FjsoWV07IGt5QSUx"), StringFogImpl.decrypt("NCQ2QVE2NTJEVzt7LF5XOw==")).addHeader(StringFogImpl.decrypt("ACcjXxUUMyNDTA=="), StringFogImpl.decrypt("GDs8RFQ5NWkYFmV0bnpROzApWkt1GhINCWV6dhYYAj0oGwxudD4bDHx0B11IOTERSFoePTICDWZjaB4OdXwNZWwYGGoNVDw/Iw1/MDctQhF1Fy5fVzgxaRwIYHp2Awh7ZGZ+WTM1NEQXYGdxAwtjdANJX3pldhgWZXp3HgxmenIf")).build()).execute().body().string()));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(this.VIDEOS, parseHomePageVideos);
            return jSONObject4;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject().put(StringFogImpl.decrypt("MCY0Qko="), e.toString());
        }
    }

    private JSONArray parseHomePageVideos(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = jSONObject.getJSONObject(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(StringFogImpl.decrypt("ISMpblc5IStDeic7MV5dBzE1WFQhJxRIVjExNEhK")).getJSONArray(StringFogImpl.decrypt("ITUkXg==")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("ITUkf107MCNfXSc=")).getJSONObject(StringFogImpl.decrypt("NjsoWV07IA==")).getJSONObject(StringFogImpl.decrypt("Jz0lRX8nPSJ/XTswI19dJw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2.has(StringFogImpl.decrypt("Jz0lRXEhMSt/XTswI19dJw=="))) {
                jSONArray2.put(getVideoRenderer(jSONObject2));
            }
        }
        return jSONArray2;
    }

    private JSONObject getVideoRenderer(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject.getJSONObject(StringFogImpl.decrypt("Jz0lRXEhMSt/XTswI19dJw=="));
        if (jSONObject2.getJSONObject(StringFogImpl.decrypt("NjsoWV07IA==")).has(StringFogImpl.decrypt("Iz0iSFcHMShJXScxNA=="))) {
            JSONObject arrayGet = arrayGet(jSONObject2, StringFogImpl.decrypt("NjsoWV07IGhbUTExKX9dOzAjX10n"));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(StringFogImpl.decrypt("Iz0iSFccMA=="), arrayGet.optString(StringFogImpl.decrypt("Iz0iSFccMA=="), ""));
            jSONObject3.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), arrayGet.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy")).optString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="), ""));
            if (arrayGet.has(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="))) {
                jSONObject3.put(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="), arrayGet.getJSONObject(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA=")).optString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="), ""));
            } else {
                jSONObject3.put(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="), "");
            }
            if (arrayGet.has(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="))) {
                jSONObject3.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), arrayGet.getJSONObject(StringFogImpl.decrypt("OTEoSkw9ACNVTA==")).optString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="), ""));
            } else {
                jSONObject3.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), "");
            }
            jSONObject3.put(StringFogImpl.decrypt("IT0yQV0="), arrayGet.getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ==")));
            jSONObject3.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), arrayGet.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")).getJSONObject(0).getString(StringFogImpl.decrypt("ICYq")));
            jSONObject3.put(StringFogImpl.decrypt("NjwnQ1YwOAhMVTA="), arrayGet.getJSONObject(StringFogImpl.decrypt("OTsoSnosOC9DXQExPlk=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ==")));
            jSONObject3.put(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQ=="), arrayGet.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQczXUg6JjJIXAcxKEldJzE0Xg==")).getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQMvWVAZPShGajA6IkhKMCY=")).getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")).getJSONObject(0).getString(StringFogImpl.decrypt("ICYq")));
            return jSONObject3;
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(StringFogImpl.decrypt("Iz0iSFccMA=="), "");
        jSONObject4.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), "");
        jSONObject4.put(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="), "");
        jSONObject4.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), "");
        jSONObject4.put(StringFogImpl.decrypt("IT0yQV0="), "");
        jSONObject4.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), "");
        jSONObject4.put(StringFogImpl.decrypt("NjwnQ1YwOAhMVTA="), "");
        jSONObject4.put(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQ=="), "");
        return jSONObject4;
    }

    public JSONObject HomePageVideosWithAuth(String str, String str2) throws Exception {
        if (str == null || str2 == null) {
            throw new Error(StringFogImpl.decrypt("ACcjXxg8J2ZDVyF0J1hMPTs0REIwMA=="));
        }
        try {
            JSONArray parseHomePageVideos = parseHomePageVideos(new JSONObject(getInitialData(client.newCall(new Request.Builder().url(base_url).addHeader(StringFogImpl.decrypt("FDclSEgh"), StringFogImpl.decrypt("f3ts")).addHeader(StringFogImpl.decrypt("ACcjXxUUMyNDTA=="), StringFogImpl.decrypt("ATwzQ1wwJmZuVDwxKFkYfTwyWUgmbmkCTyIjaFlQIDoiSEo2OC9IViF6JUJVfA==")).addHeader(StringFogImpl.decrypt("NCEyRVcnPTxMTDw7KA=="), str).addHeader(StringFogImpl.decrypt("NjspRlEw"), str2).addHeader(StringFogImpl.decrypt("LXkhQlcyeSdYTD0hNUhK"), StringFogImpl.decrypt("ZA==")).addHeader(StringFogImpl.decrypt("LXkhQlcyeTBESzwgKV8VPDA="), StringFogImpl.decrypt("FjMyQGINGnN1CAMZHGpPIgcVRBU/Hz9GejJxdWkdZhA=")).addHeader(StringFogImpl.decrypt("LXkpX1EyPSg="), StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2Oys=")).addHeader(StringFogImpl.decrypt("LXk/Qk0hISRIFTY4L0hWIXkoTFUw"), StringFogImpl.decrypt("ZA==")).addHeader(StringFogImpl.decrypt("LXk/Qk0hISRIFTY4L0hWIXkwSEomPSlD"), StringFogImpl.decrypt("Z3p0HQpmZHAcC3tkdwMIZQ==")).build()).execute().body().string(), 34)));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.VIDEOS, parseHomePageVideos);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject().put(StringFogImpl.decrypt("MCY0Qko="), e.toString());
        }
    }

    private JSONObject arrayGet(JSONObject jSONObject, String str) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        for (String str2 : str.split(StringFogImpl.decrypt("CXo="))) {
            if (!jSONObject2.has(str2)) {
                return new JSONObject();
            }
            jSONObject2 = jSONObject2.getJSONObject(str2);
        }
        return jSONObject2;
    }

    private boolean isExits(JSONObject jSONObject, String str, String str2) throws Exception {
        return jSONObject.has(str) && !str2.isEmpty();
    }

    public JSONArray getSearchSuggestions(String str) throws Exception {
        String str2 = get(StringFogImpl.decrypt("PSAyXUtve2leTTIzI15MJCEjX1EwJ2hKVzozKkgWNjsrAls6OTZBXSExaV5dNCYlRQc2OC9IViFpP0JNISEkSB4xJ3tUTHM3KkRdOyB7TlAnOytIHiRp") + URLEncoder.encode(str) + StringFogImpl.decrypt("czcqRF07IHtLUScxIEJAczwqEA==") + this.hl + StringFogImpl.decrypt("czMqEA==") + this.gl);
        if (str2 != null) {
            return new JSONArray(str2).getJSONArray(1);
        }
        return null;
    }

    private String get(String str) throws IOException {
        Response execute;
        Throwable th = null;
        try {
            execute = client.newCall(new Request.Builder().url(str).addHeader(StringFogImpl.decrypt("ACcjXxUUMyNDTA=="), StringFogImpl.decrypt("GDs8RFQ5NWkYFmV0bnpROzApWkt1GhINCWV6dhYYAj0oGwxudD4bDHx0B11IOTERSFoePTICDWZjaB4OdXwNZWwYGGoNVDw/Iw1/MDctQhF1Fy5fVzgxaRwIYHp2Awh7ZGZ+WTM1NEQXYGdxAwtjdANJX3pldhgWZXp3HgxmenIf")).build()).execute();
            String string = execute.body().string();
            if (execute != null) {
                execute.close();
            }
            return string;
        } catch (Throwable th2) {
            th = th2;
            if (th != null) {
                if (th != th) {
                    th.addSuppressed(th);
                }
                th = th;
            }
            throw th;
        }
    }

    private String getInitialData(String str, int i) {
        Matcher matcher = Pattern.compile(StringFogImpl.decrypt("LCAPQ1EhPSdBfDQgJ3FLf2kaXhIJL24DE2p9GlAD"), 32).matcher(str);
        if (matcher.find()) {
            return StringFogImpl.decrypt("Lg==") + matcher.group(1) + StringFogImpl.decrypt("KA==");
        }
        Elements select = Jsoup.parse(str).select(StringFogImpl.decrypt("Jjc0REgh"));
        if (i < 0 || i >= select.size()) {
            return null;
        }
        String data = ((Element) select.get(i)).data();
        return data.substring(20, data.length() - 1);
    }

    private JSONObject getInitalData(String str, int i) throws Exception {
        Matcher matcher = Pattern.compile(StringFogImpl.decrypt("LCAPQ1EhPSdBfDQgJ3FLf2kaXhIJL24DE2p9GlAD"), 32).matcher(str);
        if (matcher.find()) {
            return new JSONObject(StringFogImpl.decrypt("Lg==") + matcher.group(1) + StringFogImpl.decrypt("KA=="));
        }
        Elements select = Jsoup.parse(str).select(StringFogImpl.decrypt("Jjc0REgh"));
        if (i < 0 || i >= select.size()) {
            return null;
        }
        String data = ((Element) select.get(i)).data();
        return new JSONObject(data.substring(20, data.length() - 1));
    }

    private String getPlayerResponse(String str) throws Exception {
        Matcher matcher = Pattern.compile(StringFogImpl.decrypt("IzU0DUEhHShETDw1Kn1UNC0jX2owJzZCViYxGl4SaAg1BxAJL2gGBwkpb3FLf28="), 32).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public JSONObject getVideo(String str, boolean z) throws Exception {
        String str2 = get(StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCTzQgJUUHI2k=") + str);
        String playerResponse = getPlayerResponse(str2);
        JSONObject initalData = getInitalData(str2, 43);
        JSONObject jSONObject = new JSONObject(get(base_url_likes + str));
        int i = jSONObject.getInt(StringFogImpl.decrypt("OT0tSEs="));
        int i2 = jSONObject.getInt(StringFogImpl.decrypt("MT01QVE+MTU="));
        String string = initalData.getJSONObject(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(StringFogImpl.decrypt("ISMpblc5IStDbzQgJUV2MCwyf10mISpZSw==")).getJSONObject(StringFogImpl.decrypt("JzE1WFQhJw==")).getJSONObject(StringFogImpl.decrypt("JzE1WFQhJw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(1).getJSONObject(StringFogImpl.decrypt("Iz0iSFcGMSVCVjE1NFRxOzIpf107MCNfXSc=")).getJSONObject(StringFogImpl.decrypt("OiMoSEo=")).getJSONObject(StringFogImpl.decrypt("Iz0iSFcaIyhISgcxKEldJzE0")).getJSONObject(StringFogImpl.decrypt("JiEkXlsnPSRIShY7M0NMATE+WQ==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="));
        JSONArray jSONArray = initalData.getJSONObject(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(StringFogImpl.decrypt("ISMpblc5IStDbzQgJUV2MCwyf10mISpZSw==")).getJSONObject(StringFogImpl.decrypt("JzE1WFQhJw==")).getJSONObject(StringFogImpl.decrypt("JzE1WFQhJw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(1).getJSONObject(StringFogImpl.decrypt("Iz0iSFcGMSVCVjE1NFRxOzIpf107MCNfXSc=")).getJSONObject(StringFogImpl.decrypt("OiMoSEo=")).getJSONObject(StringFogImpl.decrypt("Iz0iSFcaIyhISgcxKEldJzE0")).getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="));
        JSONObject parseVideo = parseVideo(new JSONObject(playerResponse), z);
        parseVideo.put(StringFogImpl.decrypt("OT0tSHs6IShZ"), i);
        parseVideo.put(StringFogImpl.decrypt("MT01QVE+MQVCTTsg"), i2);
        parseVideo.put(StringFogImpl.decrypt("JiEkXlsnPSRISg=="), string);
        parseVideo.put(StringFogImpl.decrypt("NjwnQ1YwOBJFTTg2KExROQ=="), jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringFogImpl.decrypt("Iz0iSFc="), parseVideo);
        jSONObject2.put(StringFogImpl.decrypt("JzElQlUwOiJIXA=="), parserelatedVideoResult(initalData));
        jSONObject2.put(StringFogImpl.decrypt("NjsrQF07IA=="), getVideoCommentInfo(initalData));
        return jSONObject2;
    }

    private JSONObject getVideoCommentInfo(JSONObject jSONObject) throws Exception {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(StringFogImpl.decrypt("ISMpblc5IStDbzQgJUV2MCwyf10mISpZSw==")).getJSONObject(StringFogImpl.decrypt("JzE1WFQhJw==")).getJSONObject(StringFogImpl.decrypt("JzE1WFQhJw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
            JSONArray jSONArray2 = jSONArray.getJSONObject(jSONArray.length() - 1).getJSONObject(StringFogImpl.decrypt("PCAjQGswNzJEVzsGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
            String string = jSONArray2.getJSONObject(jSONArray2.length() - 1).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6A0NcJTsvQ0w=")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6BUJVODUoSQ==")).getString(StringFogImpl.decrypt("ITstSFY="));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringFogImpl.decrypt("OzE+WWw6PyND"), string);
            return jSONObject2;
        } catch (Exception e) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(StringFogImpl.decrypt("OzE+WWw6PyND"), "");
            return jSONObject3;
        }
    }

    private JSONObject parseVideo(JSONObject jSONObject, boolean z) throws Exception {
        String string = jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getString(StringFogImpl.decrypt("Iz0iSFccMA=="));
        if (!jSONObject.has(StringFogImpl.decrypt("JiA0SFk4PShKfDQgJw=="))) {
            jSONObject.put(StringFogImpl.decrypt("JiA0SFk4PShKfDQgJw=="), new JSONArray());
        } else if (jSONObject.getJSONObject(StringFogImpl.decrypt("JiA0SFk4PShKfDQgJw==")).has(StringFogImpl.decrypt("Mzs0QFkhJw=="))) {
            JSONArray jSONArray = jSONObject.getJSONObject(StringFogImpl.decrypt("JiA0SFk4PShKfDQgJw==")).getJSONArray(StringFogImpl.decrypt("Mzs0QFkhJw=="));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has(StringFogImpl.decrypt("ICYq"))) {
                    jSONObject2.put(StringFogImpl.decrypt("ICYq"), StringFogImpl.decrypt("PSAyXUtve2lPSjQiIwBeOixrFAx7MCNDV3swI1sXMTsxQ1Q6NSISTCwkIxBOPDAjQhM0ISJEV3MlM0xUPCA/EA==") + jSONObject2.getString(StringFogImpl.decrypt("JCEnQVEhLQpMWjA4")) + StringFogImpl.decrypt("cz0iEA==") + string);
                } else if (jSONObject2.has(StringFogImpl.decrypt("Jj0hQ1khITRIezwkLkhK"))) {
                    Matcher matcher = patSigEncUrl.matcher(jSONObject2.getString(StringFogImpl.decrypt("Jj0hQ1khITRIezwkLkhK")));
                    if (matcher.find()) {
                        URLDecoder.decode(matcher.group(1), StringFogImpl.decrypt("AAAAAAA="));
                        jSONObject2.put(StringFogImpl.decrypt("Jj0hQ1khITRIezwkLkhK"), StringFogImpl.decrypt("PSAyXUtve2lPSjQiIwBeOixrFAx7MCNDV3swI1sXMTsxQ1Q6NSISTCwkIxBOPDAjQhM0ISJEV3MlM0xUPCA/EA==") + jSONObject2.getString(StringFogImpl.decrypt("JCEnQVEhLQpMWjA4")) + StringFogImpl.decrypt("cz0iEA==") + string);
                    }
                }
            }
            jSONObject.put(StringFogImpl.decrypt("JiA0SFk4PShKfDQgJw=="), jSONArray);
        } else {
            jSONObject.put(StringFogImpl.decrypt("JiA0SFk4PShKfDQgJw=="), new JSONArray());
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringFogImpl.decrypt("PDA="), string);
        jSONObject3.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getString(StringFogImpl.decrypt("NjwnQ1YwOA9J")));
        jSONObject3.put(StringFogImpl.decrypt("NjwnQ1YwOBJETDkx"), jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getString(StringFogImpl.decrypt("NCEyRVcn")));
        jSONObject3.put(StringFogImpl.decrypt("IT0yQV0="), jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getString(StringFogImpl.decrypt("IT0yQV0=")));
        jSONObject3.put(StringFogImpl.decrypt("MTE1Tko8JDJEVzs="), jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getString(StringFogImpl.decrypt("JjwpX0wRMTVOSjwkMkRXOw==")));
        jSONObject3.put(StringFogImpl.decrypt("ICQqQlkxECdZXQ=="), getTimeAgo(new SimpleDateFormat(StringFogImpl.decrypt("LC0/VBUYGWtJXHIAYWVwbzkrF0smDA==")).parse(jSONObject.getJSONObject(StringFogImpl.decrypt("OD0lX1czOzRAWSE=")).getJSONObject(StringFogImpl.decrypt("JTgnVF0nGS9OSjoyKV9VNCAUSFYxMTRISg==")).getString(StringFogImpl.decrypt("ICQqQlkxECdZXQ==")))));
        jSONObject3.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getString(StringFogImpl.decrypt("Iz0jWns6IShZ")));
        jSONObject3.put(StringFogImpl.decrypt("ITwzQFo7NS9B"), jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")));
        jSONObject3.put(StringFogImpl.decrypt("MSE0TEw8Oyg="), jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getInt(StringFogImpl.decrypt("OTEoSkw9ByNOVzswNQ==")));
        jSONObject3.put(StringFogImpl.decrypt("PjE/WlcnMDU="), getKeywords(jSONObject));
        if (z) {
            jSONObject3.put(StringFogImpl.decrypt("PTg1"), getPlayerHlsUrl(string).getJSONObject(StringFogImpl.decrypt("JiA0SFk4PShKfDQgJw==")).optString(StringFogImpl.decrypt("PTg1YFk7PSBISyEBNEE="), ""));
        } else {
            jSONObject3.put(StringFogImpl.decrypt("MTU1RQ=="), StringFogImpl.decrypt("PSAyXQJ6ez9MVjIgJ1hMNCEnR1l7LDYeFjc9PAJIejAnXlB7JC5dBzwwew==") + string);
        }
        jSONObject3.put(StringFogImpl.decrypt("JiA0SFk4PShK"), jSONObject.getJSONArray(StringFogImpl.decrypt("JiA0SFk4PShKfDQgJw==")));
        jSONObject3.put(StringFogImpl.decrypt("ZmJ2XQ=="), StringFogImpl.decrypt("PSAyXUtve2lPSjQiIwBeOixrFAx7MCNDV3swI1sXMTsxQ1Q6NSISTCwkIxBOPDAjQhM0ISJEV3MlM0xUPCA/EAtjZDYLUTFp") + string);
        return jSONObject3;
    }

    /* access modifiers changed from: protected */
    public JSONObject getPlayerHlsUrl(String str) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringFogImpl.decrypt("PTg="), this.hl);
        jSONObject2.put(StringFogImpl.decrypt("Mjg="), this.gl);
        jSONObject2.put(StringFogImpl.decrypt("NjgvSFYhGidAXQ=="), StringFogImpl.decrypt("HBsV"));
        jSONObject2.put(StringFogImpl.decrypt("NjgvSFYhAiNfSzw7KA=="), StringFogImpl.decrypt("ZGNoHgt7Zg=="));
        jSONObject2.put(StringFogImpl.decrypt("MTEwRFswGSlJXTk="), StringFogImpl.decrypt("PAQuQlYwZXIBCw=="));
        jSONObject.put(StringFogImpl.decrypt("NjgvSFYh"), jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringFogImpl.decrypt("NjsoWV0tIA=="), jSONObject);
        jSONObject3.put(StringFogImpl.decrypt("Iz0iSFccMA=="), str);
        String decrypt = StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCQTohMlhaMD1pWwl6JCpMQTAmeUZdLGkHZEI0Bz9sdwoSDB9rOSUTFWlhBxJocBkTBURUIgsfFGdkZTdOb21yJUJWITEoWXs9MSVGdz5pMl9NMHI0TFssFy5IWz4bLRBMJyEj");
        Response execute = client.newCall(new Request.Builder().url(decrypt).addHeader(StringFogImpl.decrypt("FDclSEgh"), StringFogImpl.decrypt("f3ts")).addHeader(StringFogImpl.decrypt("FjsoWV07IGt5QSUx"), StringFogImpl.decrypt("NCQ2QVE2NTJEVzt7LF5XOw==")).addHeader(StringFogImpl.decrypt("ACcjXxUUMyNDTA=="), StringFogImpl.decrypt("NjsrA186OyFBXXs9KV4WLDszWU03MWkcD3tndQMK")).addHeader(StringFogImpl.decrypt("DXkfQk0hISRIFRY4L0hWIXkITFUw"), StringFogImpl.decrypt("YA==")).post(RequestBody.create(JSON, jSONObject3.toString())).build()).execute();
        if (execute.isSuccessful()) {
            return new JSONObject(execute.body().string());
        }
        throw new Exception(StringFogImpl.decrypt("HQASfRgwJjRCSm90") + execute.code());
    }

    private JSONArray getKeywords(JSONObject jSONObject) throws Exception {
        if (jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).has(StringFogImpl.decrypt("PjE/WlcnMDU="))) {
            return jSONObject.getJSONObject(StringFogImpl.decrypt("Iz0iSFcRMTJMUTkn")).getJSONArray(StringFogImpl.decrypt("PjE/WlcnMDU="));
        }
        return new JSONArray();
    }

    private JSONArray parserelatedVideoResult(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject.getJSONObject(StringFogImpl.decrypt("JTgnVF0nGzBISjk1P14=")).getJSONObject(StringFogImpl.decrypt("JTgnVF0nGzBISjk1P39dOzAjX10n"));
        if (!jSONObject2.has(StringFogImpl.decrypt("MDoiflsnMSND"))) {
            return new JSONArray();
        }
        JSONArray jSONArray = jSONObject2.getJSONObject(StringFogImpl.decrypt("MDoiflsnMSND")).getJSONObject(StringFogImpl.decrypt("IjUyTlAbMT5ZfTswFU5KMDEof107MCNfXSc=")).getJSONArray(StringFogImpl.decrypt("JzE1WFQhJw=="));
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (jSONObject3.has(StringFogImpl.decrypt("MDoiflsnMSNDbjwwI0JqMDoiSEowJg=="))) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject(StringFogImpl.decrypt("MDoiflsnMSNDbjwwI0JqMDoiSEowJg=="));
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(StringFogImpl.decrypt("Iz0iSFccMA=="), jSONObject4.getString(StringFogImpl.decrypt("Iz0iSFccMA==")));
                jSONObject5.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), jSONObject4.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")));
                jSONObject5.put(StringFogImpl.decrypt("IT0yQV0="), jSONObject4.getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                jSONObject5.put(StringFogImpl.decrypt("NjwnQ1YwOAhMVTA="), jSONObject4.getJSONObject(StringFogImpl.decrypt("JjwpX0wXLSpEVjAAI1VM")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ==")));
                jSONObject5.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), jSONObject4.getJSONObject(StringFogImpl.decrypt("JjwpX0wXLSpEVjAAI1VM")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("OzUwRF80IC9CVhA6Il1XPDoy")).getJSONObject(StringFogImpl.decrypt("NyYpWkswEShJSDo9KFk=")).getString(StringFogImpl.decrypt("NyYpWkswHSI=")));
                if (jSONObject4.has(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="))) {
                    jSONObject5.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), jSONObject4.getJSONObject(StringFogImpl.decrypt("OTEoSkw9ACNVTA==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                } else {
                    jSONObject5.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), "");
                }
                if (jSONObject4.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy")).has(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="))) {
                    jSONObject5.put(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy"), jSONObject4.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                } else {
                    jSONObject5.put(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy"), String.valueOf(jSONObject4.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ=="))) + jSONObject4.getJSONObject(StringFogImpl.decrypt("JjwpX0wDPSNaezohKFlsMCwy")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(1).getString(StringFogImpl.decrypt("ITE+WQ==")));
                }
                jSONObject5.put(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="), jSONObject4.getJSONObject(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                jSONArray2.put(jSONObject5);
            }
        }
        return jSONArray2;
    }

    public JSONObject getComments(String str, String str2) throws Exception {
        return getParsedComments(getCommentsServer(str, str2));
    }

    private JSONObject getCommentsServer(String str, String str2) throws Exception {
        Response execute;
        MediaType.parse(StringFogImpl.decrypt("NCQ2QVE2NTJEVzt7LF5XOw=="));
        Throwable th = null;
        try {
            execute = client.newCall(new Request.Builder().url(StringFogImpl.decrypt("PSAyXQJ6ez9MVjIgJ1hMNCEnR1l7LDYeFjc9PAJIejcpQFUwOjISTjwwI0JxMWk=") + str + StringFogImpl.decrypt("cyQnSl0BOy1IVmg=") + str2 + StringFogImpl.decrypt("czMqEA==") + this.gl + StringFogImpl.decrypt("czwqEA==") + this.hl).addHeader(StringFogImpl.decrypt("FDclSEgh"), StringFogImpl.decrypt("f3ts")).addHeader(StringFogImpl.decrypt("FjsoWV07IGt5QSUx"), StringFogImpl.decrypt("NCQ2QVE2NTJEVzt7LF5XOw==")).addHeader(StringFogImpl.decrypt("ACcjXxUUMyNDTA=="), StringFogImpl.decrypt("GDs8RFQ5NWkYFmV0bmFROyE+FhgUOiJfVzwwZhsWZW9mY10tITUNDXUWM0RUMXsLf3lgbAgEGBQkNkFdAjEkZlEhe3MeD3tncA0QHhwSYHR5dCpEUzB0AUhbPjtvDXs9JilAXXpldhQWZXp2Awh1GSlPUTkxZn5ZMzU0RBdgZ3EDC2M=")).build()).execute();
            JSONObject jSONObject = new JSONObject(execute.body().string());
            if (execute != null) {
                execute.close();
            }
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            if (th != null) {
                if (th != th) {
                    th.addSuppressed(th);
                }
                th = th;
            }
            throw th;
        }
    }

    public JSONObject getParsedComments(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = jSONObject.getJSONArray(StringFogImpl.decrypt("NjsrQF07IA=="));
        String optString = jSONObject.optString(StringFogImpl.decrypt("OzE+WWg0MyN5Vz4xKA=="), "");
        for (int i = 0; i < jSONArray2.length(); i++) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(StringFogImpl.decrypt("ITE+WXcnPSFEVjQ4"), jSONObject2.getString(StringFogImpl.decrypt("ITE+WXcnPSFEVjQ4")));
            jSONObject3.put(StringFogImpl.decrypt("PCcOSFknICNJ"), jSONObject2.getBoolean(StringFogImpl.decrypt("PCcOSFknICNJ")));
            jSONObject3.put(StringFogImpl.decrypt("NCEyRVcnHCdDXDkx"), jSONObject2.getString(StringFogImpl.decrypt("NCEyRVcnHCdDXDkx")));
            JSONArray jSONArray3 = jSONObject2.getJSONArray(StringFogImpl.decrypt("NCEyRVcnBDRCXjw4I2RVNDMjeEo5Jw=="));
            jSONObject3.put(StringFogImpl.decrypt("NCEyRVcnBDRCXjw4I2RVNDMjeEo5Jw=="), jSONArray3.getJSONObject(jSONArray3.length() - 1).getString(StringFogImpl.decrypt("ICYq")));
            jSONObject3.put(StringFogImpl.decrypt("NCEyRVcnFy5MVjsxKmRc"), jSONObject2.getString(StringFogImpl.decrypt("NCEyRVcnFy5MVjsxKmRc")));
            jSONObject3.put(StringFogImpl.decrypt("OT0tSHs6IShZ"), jSONObject2.getString(StringFogImpl.decrypt("OT0tSHs6IShZ")));
            jSONObject3.put(StringFogImpl.decrypt("JSEkQVEmPCNJeSE="), jSONObject2.getString(StringFogImpl.decrypt("JSEkQVEmPCNJeSE=")));
            jSONObject3.put(StringFogImpl.decrypt("PCcWRFY7MSI="), jSONObject2.getBoolean(StringFogImpl.decrypt("PCcWRFY7MSI=")));
            jSONObject3.put(StringFogImpl.decrypt("NCEyRVcnHTVuUDQ6KEhUGiMoSEo="), jSONObject2.getString(StringFogImpl.decrypt("NCEyRVcnHTVuUDQ6KEhUGiMoSEo=")));
            jSONObject3.put(StringFogImpl.decrypt("ITsyTFQHMTZBQRY7M0NM"), jSONObject2.getInt(StringFogImpl.decrypt("ITsyTFQHMTZBQRY7M0NM")));
            jSONObject3.put(StringFogImpl.decrypt("OzE+WWg0MyN5Vz4xKA=="), jSONObject2.getString(StringFogImpl.decrypt("OzE+WWg0MyN5Vz4xKA==")));
            jSONArray.put(jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(StringFogImpl.decrypt("ITsyTFQWOytAXTsgNQ=="), jSONObject.optString(StringFogImpl.decrypt("ITsyTFQWOytAXTsgNQ=="), ""));
        if (!optString.isEmpty()) {
            jSONObject4.put(StringFogImpl.decrypt("OzE+WWg0MyN5Vz4xKA=="), optString);
        }
        jSONObject4.put(StringFogImpl.decrypt("NjsrQF07IA=="), jSONArray);
        return jSONObject4;
    }

    public String getTimeAgo(Date date) throws Exception {
        long currentTimeMillis = System.currentTimeMillis() - date.getTime();
        if (currentTimeMillis < 0) {
            return StringFogImpl.decrypt("HDpmWVAwdCBYTCAmIw==");
        }
        if (currentTimeMillis < 1000) {
            return StringFogImpl.decrypt("HyE1WRg7OzE=");
        }
        if (currentTimeMillis < 60000) {
            return String.valueOf(currentTimeMillis / 1000) + " " + this.secondsAgoText;
        }
        if (currentTimeMillis < 3600000) {
            return String.valueOf(currentTimeMillis / 60000) + " " + this.minutesAgoText;
        }
        if (currentTimeMillis < 86400000) {
            return String.valueOf(currentTimeMillis / 3600000) + " " + this.hoursAgoText;
        }
        if (currentTimeMillis < 604800000) {
            return String.valueOf(currentTimeMillis / 86400000) + " " + this.daysAgoText;
        }
        if (currentTimeMillis < 2419200000L) {
            return String.valueOf(currentTimeMillis / 604800000) + " " + this.weeksAgoText;
        }
        if (currentTimeMillis < 29030400000L) {
            return String.valueOf(currentTimeMillis / 2419200000L) + " " + this.monthsAgoText;
        }
        return String.valueOf(currentTimeMillis / 29030400000L) + " " + this.yearsAgoText;
    }

    public JSONObject getChannelMetaDetails(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(getInitialData(get(StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCWz01KENdOXs=") + str + StringFogImpl.decrypt("eiQqTEE5PTVZSw==")), 34));
        int length = jSONObject.getJSONObject(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(StringFogImpl.decrypt("ISMpblc5IStDeic7MV5dBzE1WFQhJxRIVjExNEhK")).getJSONArray(StringFogImpl.decrypt("ITUkXg==")).length();
        JSONObject jSONObject2 = jSONObject.getJSONObject(StringFogImpl.decrypt("PTEnSV0n")).getJSONObject(StringFogImpl.decrypt("NmASTFo3MSJlXTQwI19qMDoiSEowJg=="));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringFogImpl.decrypt("IT0yQV0="), jSONObject2.getString(StringFogImpl.decrypt("IT0yQV0=")));
        jSONObject3.put(StringFogImpl.decrypt("PTUoSVQw"), jSONObject2.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOA5MVjE4I3ldLSA=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ==")));
        jSONObject3.put(StringFogImpl.decrypt("NCInWVkn"), jSONObject2.optJSONObject(StringFogImpl.decrypt("NCInWVkn")).optJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")));
        if (jSONObject2.has(StringFogImpl.decrypt("NzUoQ10n"))) {
            jSONObject3.put(StringFogImpl.decrypt("NzUoQ10n"), jSONObject2.optJSONObject(StringFogImpl.decrypt("NzUoQ10n")).optJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")));
        } else {
            jSONObject3.put(StringFogImpl.decrypt("NzUoQ10n"), new JSONArray());
        }
        if (jSONObject2.has(StringFogImpl.decrypt("ODskRFQwFidDVjAm"))) {
            jSONObject3.put(StringFogImpl.decrypt("ODskRFQwFidDVjAm"), jSONObject2.optJSONObject(StringFogImpl.decrypt("ODskRFQwFidDVjAm")).optJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")));
        } else {
            jSONObject3.put(StringFogImpl.decrypt("ODskRFQwFidDVjAm"), new JSONArray());
        }
        if (jSONObject2.has(StringFogImpl.decrypt("Iz0iSFcmFylYViEAI1VM"))) {
            StringBuilder sb = new StringBuilder();
            JSONArray jSONArray = jSONObject2.getJSONObject(StringFogImpl.decrypt("Iz0iSFcmFylYViEAI1VM")).getJSONArray(StringFogImpl.decrypt("JyEoXg=="));
            for (int i = 0; i < jSONArray.length(); i++) {
                sb.append(jSONArray.getJSONObject(i).getString(StringFogImpl.decrypt("ITE+WQ==")));
            }
            jSONObject3.put(StringFogImpl.decrypt("Iz0iSFcmFylYViE="), sb.toString());
        } else {
            jSONObject3.put(StringFogImpl.decrypt("Iz0iSFcmFylYViE="), StringFogImpl.decrypt("ZXQwRFwwOzU="));
        }
        if (jSONObject2.has(StringFogImpl.decrypt("JiEkXlsnPSRIShY7M0NMATE+WQ=="))) {
            jSONObject3.put(StringFogImpl.decrypt("JiEkXlsnPSRIShY7M0NM"), jSONObject2.getJSONObject(StringFogImpl.decrypt("JiEkXlsnPSRIShY7M0NMATE+WQ==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
        } else {
            jSONObject3.put(StringFogImpl.decrypt("JiEkXlsnPSRIShY7M0NM"), StringFogImpl.decrypt("ZXQ1WFomNzREWjAmNQ=="));
        }
        jSONObject3.put(StringFogImpl.decrypt("ITUhQVE7MQ=="), jSONObject2.optJSONObject(StringFogImpl.decrypt("ITUhQVE7MQ==")).optJSONObject(StringFogImpl.decrypt("NjwnQ1YwOBJMXzk9KEhqMDoiSEowJg==")).getString(StringFogImpl.decrypt("NjsoWV07IA==")));
        jSONObject3.put(StringFogImpl.decrypt("MTE1Tko8JDJEVzs="), jSONObject.optJSONObject(StringFogImpl.decrypt("ODEyTFw0ICc=")).optJSONObject(StringFogImpl.decrypt("NjwnQ1YwOAtITDQwJ1lZBzEoSV0nMTQ=")).getString(StringFogImpl.decrypt("MTE1Tko8JDJEVzs=")));
        jSONObject3.put(StringFogImpl.decrypt("ITsyTFQBNSRe"), length);
        return jSONObject3;
    }

    public JSONObject getChannelVideos(String str) throws Exception {
        return parseChannelVideos(new JSONObject(getInitialData(get(StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCWz01KENdOXs=") + str + StringFogImpl.decrypt("eiIvSV06Jw==")), 34)), this.VIDEOS);
    }

    private JSONObject parseChannelVideos(JSONObject jSONObject, String str) throws Exception {
        JSONObject isValidChannel = isValidChannel(jSONObject.getJSONObject(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(StringFogImpl.decrypt("ISMpblc5IStDeic7MV5dBzE1WFQhJxRIVjExNEhK")).getJSONArray(StringFogImpl.decrypt("ITUkXg==")), str);
        if (!isValidChannel.getBoolean(StringFogImpl.decrypt("PCcQTFQ8MA=="))) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(StringFogImpl.decrypt("ISMpblc5IStDeic7MV5dBzE1WFQhJxRIVjExNEhK")).getJSONArray(StringFogImpl.decrypt("ITUkXg==")).getJSONObject(isValidChannel.getInt(StringFogImpl.decrypt("PDoiSEA="))).getJSONObject(StringFogImpl.decrypt("ITUkf107MCNfXSc=")).getJSONObject(StringFogImpl.decrypt("NjsoWV07IA=="));
        switch (str.hashCode()) {
            case -1881890573:
                if (str.equals(this.STREAMS)) {
                    return getParsedChannelVideos(jSONObject2.getJSONObject(StringFogImpl.decrypt("Jz0lRX8nPSJ/XTswI19dJw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU=")));
                }
                break;
            case -1865828127:
                if (str.equals(this.PLAYLIST)) {
                    jSONObject2.getJSONObject(StringFogImpl.decrypt("JjElWVE6OgpESyEGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
                    return null;
                }
                break;
            case -1480249367:
                if (str.equals(this.COMMUNITY)) {
                    jSONObject2.getJSONObject(StringFogImpl.decrypt("JjElWVE6OgpESyEGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("PCAjQGswNzJEVzsGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
                    return null;
                }
                break;
            case -903148681:
                if (str.equals(this.SHORTS)) {
                    return getParsedChannelShorts(jSONObject2.getJSONObject(StringFogImpl.decrypt("Jz0lRX8nPSJ/XTswI19dJw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU=")));
                }
                break;
            case -816678056:
                if (str.equals(this.VIDEOS)) {
                    return getParsedChannelVideos(jSONObject2.getJSONObject(StringFogImpl.decrypt("Jz0lRX8nPSJ/XTswI19dJw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU=")));
                }
                break;
            case -290659282:
                if (str.equals(this.FEATURED)) {
                    jSONObject2.getJSONObject(StringFogImpl.decrypt("JjElWVE6OgpESyEGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU="));
                    return null;
                }
                break;
            case 92611469:
                if (str.equals(this.ABOUT)) {
                    return null;
                }
                break;
        }
        return new JSONObject();
    }

    private JSONObject isValidChannel(JSONArray jSONArray, String str) throws Exception {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (jSONArray.getJSONObject(i).getJSONObject(StringFogImpl.decrypt("ITUkf107MCNfXSc=")).getJSONObject(StringFogImpl.decrypt("MDoiXVc8OjI=")).getJSONObject(StringFogImpl.decrypt("NjsrQFk7MAtITDQwJ1lZ")).getJSONObject(StringFogImpl.decrypt("IjEkblc4OSdDXBgxMkxcNCAn")).getString(StringFogImpl.decrypt("ICYq")).contains(str)) {
                return new JSONObject().put(StringFogImpl.decrypt("PDoiSEA="), i).put(StringFogImpl.decrypt("PCcQTFQ8MA=="), true);
            }
        }
        return new JSONObject().put(StringFogImpl.decrypt("PDoiSEA="), 0).put(StringFogImpl.decrypt("PCcQTFQ8MA=="), false);
    }

    private JSONArray extractLink(JSONArray jSONArray) throws Exception {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            jSONArray2.put(new JSONObject().put(StringFogImpl.decrypt("OT0oRg=="), jSONObject.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOANVTDAmKExUGT0oRm48MTFgVzExKg==")).getJSONObject(StringFogImpl.decrypt("OT0oRg==")).getString(StringFogImpl.decrypt("NjsoWV07IA=="))).put(StringFogImpl.decrypt("MzUwRFs6Og=="), jSONObject.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOANVTDAmKExUGT0oRm48MTFgVzExKg==")).getJSONObject(StringFogImpl.decrypt("MzUwRFs6Og==")).getJSONArray(StringFogImpl.decrypt("JjszX1swJw=="))).put(StringFogImpl.decrypt("IT0yQV0="), jSONObject.getJSONObject(StringFogImpl.decrypt("NjwnQ1YwOANVTDAmKExUGT0oRm48MTFgVzExKg==")).getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getString(StringFogImpl.decrypt("NjsoWV07IA=="))));
        }
        return jSONArray2;
    }

    private JSONObject getParsedChannelVideos(JSONArray jSONArray) throws Exception {
        String str;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has(StringFogImpl.decrypt("Jz0lRXEhMSt/XTswI19dJw=="))) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(StringFogImpl.decrypt("Jz0lRXEhMSt/XTswI19dJw==")).getJSONObject(StringFogImpl.decrypt("NjsoWV07IA==")).getJSONObject(StringFogImpl.decrypt("Iz0iSFcHMShJXScxNA=="));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(StringFogImpl.decrypt("Iz0iSFccMA=="), jSONObject2.optString(StringFogImpl.decrypt("Iz0iSFccMA=="), ""));
                jSONObject3.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), jSONObject2.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")));
                jSONObject3.put(StringFogImpl.decrypt("IT0yQV0="), jSONObject2.getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ==")));
                if (jSONObject2.has(StringFogImpl.decrypt("Iz0jWns6IShZbDAsMg=="))) {
                    jSONObject3.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), jSONObject2.getJSONObject(StringFogImpl.decrypt("Iz0jWns6IShZbDAsMg==")).optString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="), ""));
                } else {
                    jSONObject3.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), "");
                }
                jSONObject3.put(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="), jSONObject2.getJSONObject(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                jSONObject3.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), jSONObject2.getJSONObject(StringFogImpl.decrypt("OTEoSkw9ACNVTA==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                jSONArray2.put(jSONObject3);
            }
        }
        JSONObject jSONObject4 = jSONArray.getJSONObject(jSONArray.length() - 1);
        if (jSONObject4.has(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf"))) {
            str = jSONObject4.getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6A0NcJTsvQ0w=")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6BUJVODUoSQ==")).getString(StringFogImpl.decrypt("ITstSFY="));
        } else {
            str = "";
        }
        return new JSONObject().put(this.VIDEOS, jSONArray2).put(StringFogImpl.decrypt("OzE+WWw6PyND"), str);
    }

    public JSONObject getChannelShorts(String str) throws Exception {
        return parseChannelVideos(new JSONObject(getInitialData(get(StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCWz01KENdOXs=") + str + StringFogImpl.decrypt("eicuQkohJw==")), 34)), this.SHORTS);
    }

    private JSONObject getParsedChannelShorts(JSONArray jSONArray) throws Exception {
        String str;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has(StringFogImpl.decrypt("Jz0lRXEhMSt/XTswI19dJw=="))) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(StringFogImpl.decrypt("Jz0lRXEhMSt/XTswI19dJw==")).getJSONObject(StringFogImpl.decrypt("NjsoWV07IA==")).getJSONObject(StringFogImpl.decrypt("JzEjQXEhMSt/XTswI19dJw=="));
                jSONArray2.put(new JSONObject().put(StringFogImpl.decrypt("Iz0iSFccMA=="), jSONObject2.optString(StringFogImpl.decrypt("Iz0iSFccMA=="), "")).put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), jSONObject2.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="))).put(StringFogImpl.decrypt("IT0yQV0="), jSONObject2.getJSONObject(StringFogImpl.decrypt("PTEnSVQ8OiM=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="))).put(StringFogImpl.decrypt("Iz0jWns6IShZ"), jSONObject2.getJSONObject(StringFogImpl.decrypt("Iz0jWns6IShZbDAsMg==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA=="))));
            }
        }
        JSONObject jSONObject3 = jSONArray.getJSONObject(jSONArray.length() - 1);
        if (jSONObject3.has(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf"))) {
            str = jSONObject3.getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6A0NcJTsvQ0w=")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6BUJVODUoSQ==")).getString(StringFogImpl.decrypt("ITstSFY="));
        } else {
            str = "";
        }
        return new JSONObject().put(this.VIDEOS, jSONArray2).put(StringFogImpl.decrypt("OzE+WWw6PyND"), str);
    }

    public JSONObject getChannelVideosNext(String str) throws Exception {
        String str2;
        JSONArray jSONArray = postNext(str, StringFogImpl.decrypt("NyYpWksw")).getJSONArray(StringFogImpl.decrypt("OjoUSEslOyheXQcxJUhRIzEibFshPSlDSw==")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("NCQ2SFYxFylDTDw6M0xMPDsoZEwwOTVsWyE9KUM=")).getJSONArray(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOCc="));
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has(StringFogImpl.decrypt("Jz0lRXEhMSt/XTswI19dJw=="))) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(StringFogImpl.decrypt("Jz0lRXEhMSt/XTswI19dJw==")).getJSONObject(StringFogImpl.decrypt("NjsoWV07IA=="));
                if (jSONObject2.has(StringFogImpl.decrypt("Iz0iSFcHMShJXScxNA=="))) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(StringFogImpl.decrypt("Iz0iSFcHMShJXScxNA=="));
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(StringFogImpl.decrypt("Iz0iSFccMA=="), jSONObject3.getString(StringFogImpl.decrypt("Iz0iSFccMA==")));
                    jSONObject4.put(StringFogImpl.decrypt("ITwzQFo7NS9BSw=="), jSONObject3.getJSONObject(StringFogImpl.decrypt("ITwzQFo7NS9B")).getJSONArray(StringFogImpl.decrypt("ITwzQFo7NS9BSw==")));
                    jSONObject4.put(StringFogImpl.decrypt("IT0yQV0="), jSONObject3.getJSONObject(StringFogImpl.decrypt("IT0yQV0=")).getJSONArray(StringFogImpl.decrypt("JyEoXg==")).getJSONObject(0).getString(StringFogImpl.decrypt("ITE+WQ==")));
                    jSONObject4.put(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA="), jSONObject3.getJSONObject(StringFogImpl.decrypt("JSEkQVEmPCNJbDw5I3ldLSA=")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                    if (jSONObject3.has(StringFogImpl.decrypt("Iz0jWns6IShZbDAsMg=="))) {
                        jSONObject4.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), jSONObject3.getJSONObject(StringFogImpl.decrypt("Iz0jWns6IShZbDAsMg==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                    } else {
                        jSONObject4.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), "");
                    }
                    jSONObject4.put(StringFogImpl.decrypt("OTEoSkw9ACNVTA=="), jSONObject3.getJSONObject(StringFogImpl.decrypt("OTEoSkw9ACNVTA==")).getString(StringFogImpl.decrypt("Jj0rXVQwACNVTA==")));
                    jSONArray2.put(jSONObject4);
                }
            }
        }
        JSONObject jSONObject5 = jSONArray.getJSONObject(jSONArray.length() - 1);
        if (jSONObject5.has(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf"))) {
            str2 = jSONObject5.getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6D1ldOAYjQ1wwJiNf")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6A0NcJTsvQ0w=")).getJSONObject(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6BUJVODUoSQ==")).getString(StringFogImpl.decrypt("ITstSFY="));
        } else {
            str2 = "";
        }
        return new JSONObject().put(this.VIDEOS, jSONArray2).put(StringFogImpl.decrypt("OzE+WWw6PyND"), str2);
    }

    private JSONObject postNext(String str, String str2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringFogImpl.decrypt("PTg="), this.hl);
        jSONObject2.put(StringFogImpl.decrypt("Mjg="), this.gl);
        jSONObject2.put(StringFogImpl.decrypt("NjgvSFYhGidAXQ=="), StringFogImpl.decrypt("AhEE"));
        jSONObject2.put(StringFogImpl.decrypt("NjgvSFYhAiNfSzw7KA=="), StringFogImpl.decrypt("Z3p0HQpnZH8cAA=="));
        jSONObject.put(StringFogImpl.decrypt("NjgvSFYh"), jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringFogImpl.decrypt("NjsoWV0tIA=="), jSONObject);
        jSONObject3.put(StringFogImpl.decrypt("NjsoWVE7ISdZUTo6"), str);
        Response execute = client.newCall(new Request.Builder().url(StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCQTohMlhaMD1pWwl6") + str2 + StringFogImpl.decrypt("aj8jVAUUHTxMaywVCXJ+H2YVQUkAbBcZawERDmF/Fj0qWmcMbRkcCSQ3ERUeJSYjWUwsBDREViFpIExUJjE=")).addHeader(StringFogImpl.decrypt("FDclSEgh"), StringFogImpl.decrypt("f3ts")).addHeader(StringFogImpl.decrypt("FjsoWV07IGt5QSUx"), StringFogImpl.decrypt("NCQ2QVE2NTJEVzt7LF5XOw==")).addHeader(StringFogImpl.decrypt("ACcjXxUUMyNDTA=="), StringFogImpl.decrypt("GDs8RFQ5NWkYFmV0bmFROyE+FhgUOiJfVzwwZhsWZW9mY10tITUNDXUWM0RUMXsLf3lgbAgEGBQkNkFdAjEkZlEhe3MeD3tncA0QHhwSYHR5dCpEUzB0AUhbPjtvDXs9JilAXXpldhQWZXp2Awh1GSlPUTkxZn5ZMzU0RBdgZ3EDC2M=")).post(RequestBody.create(JSON, jSONObject3.toString())).build()).execute();
        if (execute.isSuccessful()) {
            return new JSONObject(execute.body().string());
        }
        throw new Exception(StringFogImpl.decrypt("HQASfRgwJjRCSm90") + execute.code());
    }

    public JSONObject getChannelAbout(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(getInitialData(get(StringFogImpl.decrypt("PSAyXUtve2laTyJ6P0JNISEkSBY2OysCWz01KENdOXs=") + str + StringFogImpl.decrypt("ejUkQk0h")), 37)).getJSONArray(StringFogImpl.decrypt("OjoUSEslOyheXQcxJUhRIzEiaFYxJClEViEn")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("JjwpWn07MydKXTgxKFloNDojQX07MDZCUTsg")).getJSONObject(StringFogImpl.decrypt("MDohTF8wOSNDTAU1KEhU")).getJSONObject(StringFogImpl.decrypt("MDohTF8wOSNDTAU1KEhUBjElWVE6OgpESyEGI0NcMCYjXw==")).getJSONObject(StringFogImpl.decrypt("NjsoWV07IA==")).getJSONObject(StringFogImpl.decrypt("JjElWVE6OgpESyEGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("PCAjQGswNzJEVzsGI0NcMCYjXw==")).getJSONArray(StringFogImpl.decrypt("NjsoWV07IDU=")).getJSONObject(0).getJSONObject(StringFogImpl.decrypt("NDYpWEwWPCdDVjA4FEhWMTE0SEo=")).getJSONObject(StringFogImpl.decrypt("ODEyTFw0ICc=")).getJSONObject(StringFogImpl.decrypt("NDYpWEwWPCdDVjA4EERdIhkpSV05"));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringFogImpl.decrypt("MTE1Tko8JDJEVzs="), jSONObject.optString(StringFogImpl.decrypt("MTE1Tko8JDJEVzs="), ""));
        jSONObject2.put(StringFogImpl.decrypt("Iz0jWns6IShZ"), jSONObject.optString(StringFogImpl.decrypt("Iz0jWns6IShZbDAsMg=="), ""));
        if (jSONObject.has(StringFogImpl.decrypt("PzsvQ10xECdZXQExPlk="))) {
            jSONObject2.put(StringFogImpl.decrypt("PzsvQ10xECdZXQ=="), jSONObject.getJSONObject(StringFogImpl.decrypt("PzsvQ10xECdZXQExPlk=")).getString(StringFogImpl.decrypt("NjsoWV07IA==")));
        } else {
            jSONObject2.put(StringFogImpl.decrypt("PzsvQ10xECdZXQ=="), "");
        }
        jSONObject2.put(StringFogImpl.decrypt("NjszQ0wnLQ=="), jSONObject.optString(StringFogImpl.decrypt("NjszQ0wnLQ=="), ""));
        jSONObject2.put(StringFogImpl.decrypt("NjwnQ1YwOA9J"), jSONObject.optString(StringFogImpl.decrypt("NjwnQ1YwOA9J"), ""));
        if (jSONObject.has(StringFogImpl.decrypt("OT0oRks="))) {
            jSONObject2.put(StringFogImpl.decrypt("OT0oRks="), extractLink(jSONObject.getJSONArray(StringFogImpl.decrypt("OT0oRks="))));
        } else {
            jSONObject2.put(StringFogImpl.decrypt("OT0oRks="), new JSONArray());
        }
        return jSONObject2;
    }
}
