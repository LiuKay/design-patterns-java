package com.kay.practice.auth;

class DefaultApiAuthenticator implements ApiAuthenticator {

    private CredentialStorage credentialStorage;

    public DefaultApiAuthenticator() {
        // Default implementation: Mysql
        this.credentialStorage = new MysqlCredentialStorage();
    }

    /**
     * Inject a CredentialStorage implementation
     * @param credentialStorage
     */
    public DefaultApiAuthenticator(CredentialStorage credentialStorage) {
        this.credentialStorage = credentialStorage;
    }

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.createFromFullUrl(url);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String token = apiRequest.getToken();
        long timestamp = apiRequest.getTimestamp();
        String baseUrl = apiRequest.getBaseUrl();

        AuthToken authToken = new AuthToken(token, timestamp);
        if (authToken.isExpired()) {
            throw new RuntimeException("Token is expired.");
        }

        String passwordByAppId = this.credentialStorage.getPasswordByAppId(appId);
        AuthToken serverAuthToken = AuthToken.generate(baseUrl, timestamp, passwordByAppId, appId);
        if (!serverAuthToken.match(authToken)) {
            throw new RuntimeException("Token verification failed.");
        }
    }
}
