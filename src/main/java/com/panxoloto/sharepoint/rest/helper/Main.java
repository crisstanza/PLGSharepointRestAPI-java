package com.panxoloto.sharepoint.rest.helper;

import com.panxoloto.sharepoint.rest.PLGSharepointClientOnline;

public class Main {

    public static final void main(final String[] args) throws Exception {
        boolean useClienId = false; // to use email and password.
        // see: com.panxoloto.sharepoint.rest.helper.AuthenticationResponseParser.parseAuthenticationResponse
        PLGSharepointClientOnline client = new PLGSharepointClientOnline("email or client_id", "password or secret", "CLIENTE_NAME.sharepoint.com", "/sites/SITE_NAME", useClienId);
        System.out.println(client);
    }
}