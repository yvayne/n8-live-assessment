package com.n8.config;

import java.util.Objects;

/**
 * It is in charge to read the environment variables.
 */
public final class EnvironmentConfig {

    private static final String PROP_FILE = "gradle.properties";
    private static final String USERNAME = "username";
    private static final String PASS = "password";
    private static final String TOKEN = "token";
    private static final String DB_HOST = "dbHost";
    private static final String DB_PORT = "dbPort";
    private static final String DB_NAME = "dbName";
    private static final String DB_USER = "dbUser";
    private static final String DB_PASS = "dbPassword";
    private static final String BROWSER = "browser";
    private static final String BASE_URL = "baseUrl";
    private static final String API_BASE_URL = "apiBaseUrl";
    private static final String IMPLICIT_TIME_WAIT = "implicitTimeWait";
    private static final String EXPLICIT_TIME_WAIT = "explicitTimeWait";
    private static EnvironmentConfig instance;

    private PropertiesReader propertiesReader;

    /**
     * Initializes an instance of {@link EnvironmentConfig}.
     */
    private EnvironmentConfig() {
        propertiesReader = new PropertiesReader(PROP_FILE);
    }

    /**
     * Initializes the Singleton {@link EnvironmentConfig} instance.
     *
     * @return singleton instance.
     */
    public static synchronized EnvironmentConfig getInstance() {
        if (Objects.isNull(instance)) {
            instance = new EnvironmentConfig();
        }
        return instance;
    }

    /**
     * Gets username.
     *
     * @return username value.
     */
    public String getUsername() {
        return propertiesReader.getEnv(USERNAME);
    }

    /**
     * Gets password.
     *
     * @return password value.
     */
    public String getPassword() {
        return propertiesReader.getEnv(PASS);
    }

    /**
     * Gets API token.
     *
     * @return API token value.
     */
    public String getToken() {
        return propertiesReader.getEnv(TOKEN);
    }

    /**
     * Gets DB host.
     *
     * @return DB host value.
     */
    public String getDbHost() {
        return propertiesReader.getEnv(DB_HOST);
    }

    /**
     * Gets DB port.
     *
     * @return DB port value.
     */
    public String getDbPort() {
        return propertiesReader.getEnv(DB_PORT);
    }

    /**
     * Gets DB name.
     *
     * @return DB name value.
     */
    public String getDbName() {
        return propertiesReader.getEnv(DB_NAME);
    }

    /**
     * Gets DB user.
     *
     * @return DB user value.
     */
    public String getDbUser() {
        return propertiesReader.getEnv(DB_USER);
    }

    /**
     * Gets DB password.
     *
     * @return DB password value.
     */
    public String getDbPass() {
        return propertiesReader.getEnv(DB_PASS);
    }

    /**
     * Gets browser.
     *
     * @return browser value.
     */
    public String getBrowser() {
        return propertiesReader.getEnv(BROWSER);
    }

    /**
     * Gets base URL.
     *
     * @return base URL value.
     */
    public String getBaseUrl() {
        return propertiesReader.getEnv(BASE_URL);
    }

    /**
     * Gets API base URL.
     *
     * @return API base URL value.
     */
    public String getApiBaseUrl() {
        return propertiesReader.getEnv(API_BASE_URL);
    }

    /**
     * Gets implicit time wait.
     *
     * @return implicit time wait value.
     */
    public int getImplicitTime() {
        return Integer.parseInt(propertiesReader.getEnv(IMPLICIT_TIME_WAIT));
    }

    /**
     * Gets explicit time wait.
     *
     * @return explicit time wait.
     */
    public int getExplicitTime() {
        return Integer.parseInt(propertiesReader.getEnv(EXPLICIT_TIME_WAIT));
    }
}
