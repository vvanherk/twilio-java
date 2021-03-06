/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class CompositionSettingsFetcher extends Fetcher<CompositionSettings> {
    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched CompositionSettings
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public CompositionSettings fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.VIDEO.toString(),
            "/v1/CompositionSettings/Default"
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("CompositionSettings fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return CompositionSettings.fromJson(response.getStream(), client.getObjectMapper());
    }
}