package com.panxoloto.sharepoint.rest.helper;

import com.panxoloto.sharepoint.rest.PLGSharepointClientOnline;

public class Main {

    public static final void main(final String[] args) throws Exception {
        String email = "nba@opsecsecurityonline.com";
		String pass = "-pjNb\"3x"; // -pjNb"3x

		String domain = "opsecsecurity.sharepoint.com";
		String site = "/sites/dreamers";

		boolean useClienId = false;
//		String domain = "nba1.sharepoint.com";
//		String site = "/sites/NBADP-External";
		PLGSharepointClientOnline client = new PLGSharepointClientOnline(email, pass, domain, site, useClienId);

        System.out.println(client);
    }
}