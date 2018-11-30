// original filename: 00047974.txt
// after
public class Class00000570Worse {
    /**
     * {@inheritDoc}
     */
    @Override
    public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
        final String authUrl = String.format(AUTHORIZE_URL, requestToken.getToken());
        return permString == null ? authUrl : authUrl + "&perms=" + permString;
    }
}
