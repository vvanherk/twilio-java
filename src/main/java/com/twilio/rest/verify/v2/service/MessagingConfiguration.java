/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessagingConfiguration extends Resource {
    private static final long serialVersionUID = 147387662050188L;

    /**
     * Create a MessagingConfigurationCreator to execute create.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @param country The ISO-3166-1 country code of the country or `all`.
     * @param messagingServiceSid The SID of the Messaging Service used for this
     *                            configuration.
     * @return MessagingConfigurationCreator capable of executing the create
     */
    public static MessagingConfigurationCreator creator(final String pathServiceSid,
                                                        final String country,
                                                        final String messagingServiceSid) {
        return new MessagingConfigurationCreator(pathServiceSid, country, messagingServiceSid);
    }

    /**
     * Create a MessagingConfigurationUpdater to execute update.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @param pathCountry The ISO-3166-1 country code of the country or `all`.
     * @param messagingServiceSid The SID of the Messaging Service used for this
     *                            configuration.
     * @return MessagingConfigurationUpdater capable of executing the update
     */
    public static MessagingConfigurationUpdater updater(final String pathServiceSid,
                                                        final String pathCountry,
                                                        final String messagingServiceSid) {
        return new MessagingConfigurationUpdater(pathServiceSid, pathCountry, messagingServiceSid);
    }

    /**
     * Create a MessagingConfigurationFetcher to execute fetch.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @param pathCountry The ISO-3166-1 country code of the country or `all`.
     * @return MessagingConfigurationFetcher capable of executing the fetch
     */
    public static MessagingConfigurationFetcher fetcher(final String pathServiceSid,
                                                        final String pathCountry) {
        return new MessagingConfigurationFetcher(pathServiceSid, pathCountry);
    }

    /**
     * Create a MessagingConfigurationReader to execute read.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @return MessagingConfigurationReader capable of executing the read
     */
    public static MessagingConfigurationReader reader(final String pathServiceSid) {
        return new MessagingConfigurationReader(pathServiceSid);
    }

    /**
     * Create a MessagingConfigurationDeleter to execute delete.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @param pathCountry The ISO-3166-1 country code of the country or `all`.
     * @return MessagingConfigurationDeleter capable of executing the delete
     */
    public static MessagingConfigurationDeleter deleter(final String pathServiceSid,
                                                        final String pathCountry) {
        return new MessagingConfigurationDeleter(pathServiceSid, pathCountry);
    }

    /**
     * Converts a JSON String into a MessagingConfiguration object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return MessagingConfiguration object represented by the provided JSON
     */
    public static MessagingConfiguration fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, MessagingConfiguration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a MessagingConfiguration object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return MessagingConfiguration object represented by the provided JSON
     */
    public static MessagingConfiguration fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, MessagingConfiguration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String serviceSid;
    private final String country;
    private final String messagingServiceSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private MessagingConfiguration(@JsonProperty("account_sid")
                                   final String accountSid,
                                   @JsonProperty("service_sid")
                                   final String serviceSid,
                                   @JsonProperty("country")
                                   final String country,
                                   @JsonProperty("messaging_service_sid")
                                   final String messagingServiceSid,
                                   @JsonProperty("date_created")
                                   final String dateCreated,
                                   @JsonProperty("date_updated")
                                   final String dateUpdated,
                                   @JsonProperty("url")
                                   final URI url) {
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.country = country;
        this.messagingServiceSid = messagingServiceSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

    /**
     * Returns The The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The SID of the Service that the resource is associated with.
     *
     * @return The SID of the Service that the resource is associated with
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The The ISO-3166-1 country code of the country or `all`..
     *
     * @return The ISO-3166-1 country code of the country or `all`.
     */
    public final String getCountry() {
        return this.country;
    }

    /**
     * Returns The The SID of the Messaging Service used for this configuration..
     *
     * @return The SID of the Messaging Service used for this configuration.
     */
    public final String getMessagingServiceSid() {
        return this.messagingServiceSid;
    }

    /**
     * Returns The The RFC 2822 date and time in GMT when the resource was created.
     *
     * @return The RFC 2822 date and time in GMT when the resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The RFC 2822 date and time in GMT when the resource was last
     * updated.
     *
     * @return The RFC 2822 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The URL of this resource..
     *
     * @return The URL of this resource.
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MessagingConfiguration other = (MessagingConfiguration) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(country, other.country) &&
               Objects.equals(messagingServiceSid, other.messagingServiceSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            serviceSid,
                            country,
                            messagingServiceSid,
                            dateCreated,
                            dateUpdated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("country", country)
                          .add("messagingServiceSid", messagingServiceSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .toString();
    }
}