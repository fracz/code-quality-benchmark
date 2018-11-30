// original filename: 00047974.txt
// before
public class Class00000570Better {
    /**
     * {@inheritDoc}
     */
    @Override
    public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
        String authUrl = String.format(AUTHORIZE_URL, requestToken.getToken());
        if (permString != null) {
            authUrl += "&perms=" + permString;
        }
        return authUrl;
    }
}
