package org.jsoup.examples;

import org.jsoup.Jsoup;

public class DisplayErrMsg {

	public static void main(String[] args) {
		String html = "<a href='www.google.com'>Link<p>Error link</a>";
		org.jsoup.nodes.Document doc = Jsoup.parse(html);
		System.out.println(doc);
	}

}
