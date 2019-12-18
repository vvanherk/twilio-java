/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.trustedComms.business.insights;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccessRate extends Resource {
    private static final long serialVersionUID = 217545107377998L;

    public enum Intervals {
        MINUTE("minute"),
        HOUR("hour"),
        DAY("day"),
        WEEK("week"),
        MONTH("month");

        private final String value;

        private Intervals(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Intervals from a string.
         * @param value string value
         * @return generated Intervals
         */
        @JsonCreator
        public static Intervals forValue(final String value) {
            return Promoter.enumFromString(value, Intervals.values());
        }
    }

    /**
     * Create a SuccessRateFetcher to execute fetch.
     *
     * @param pathBusinessSid Business Sid.
     * @return SuccessRateFetcher capable of executing the fetch
     */
    public static SuccessRateFetcher fetcher(final String pathBusinessSid) {
        return new SuccessRateFetcher(pathBusinessSid);
    }

    /**
     * Converts a JSON String into a SuccessRate object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return SuccessRate object represented by the provided JSON
     */
    public static SuccessRate fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SuccessRate.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a SuccessRate object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return SuccessRate object represented by the provided JSON
     */
    public static SuccessRate fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SuccessRate.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String businessSid;
    private final DateTime end;
    private final SuccessRate.Intervals interval;
    private final Map<String, Object> reports;
    private final DateTime start;
    private final URI url;

    @JsonCreator
    private SuccessRate(@JsonProperty("account_sid")
                        final String accountSid,
                        @JsonProperty("business_sid")
                        final String businessSid,
                        @JsonProperty("end")
                        final String end,
                        @JsonProperty("interval")
                        final SuccessRate.Intervals interval,
                        @JsonProperty("reports")
                        final Map<String, Object> reports,
                        @JsonProperty("start")
                        final String start,
                        @JsonProperty("url")
                        final URI url) {
        this.accountSid = accountSid;
        this.businessSid = businessSid;
        this.end = DateConverter.iso8601DateTimeFromString(end);
        this.interval = interval;
        this.reports = reports;
        this.start = DateConverter.iso8601DateTimeFromString(start);
        this.url = url;
    }

    /**
     * Returns The Account Sid..
     *
     * @return Account Sid.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The Business Sid..
     *
     * @return Business Sid.
     */
    public final String getBusinessSid() {
        return this.businessSid;
    }

    /**
     * Returns The The end date that for this Success Rate..
     *
     * @return The end date that for this Success Rate.
     */
    public final DateTime getEnd() {
        return this.end;
    }

    /**
     * Returns The The Interval of this Success Rate..
     *
     * @return The Interval of this Success Rate.
     */
    public final SuccessRate.Intervals getInterval() {
        return this.interval;
    }

    /**
     * Returns The Values of Success Rate per interval..
     *
     * @return Values of Success Rate per interval.
     */
    public final Map<String, Object> getReports() {
        return this.reports;
    }

    /**
     * Returns The The start date that for this Success Rate..
     *
     * @return The start date that for this Success Rate.
     */
    public final DateTime getStart() {
        return this.start;
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

        SuccessRate other = (SuccessRate) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(businessSid, other.businessSid) &&
               Objects.equals(end, other.end) &&
               Objects.equals(interval, other.interval) &&
               Objects.equals(reports, other.reports) &&
               Objects.equals(start, other.start) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            businessSid,
                            end,
                            interval,
                            reports,
                            start,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("businessSid", businessSid)
                          .add("end", end)
                          .add("interval", interval)
                          .add("reports", reports)
                          .add("start", start)
                          .add("url", url)
                          .toString();
    }
}