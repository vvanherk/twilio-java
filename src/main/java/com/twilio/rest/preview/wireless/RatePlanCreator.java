/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.wireless;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.List;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class RatePlanCreator extends Creator<RatePlan> {
    private String uniqueName;
    private String friendlyName;
    private Boolean dataEnabled;
    private Integer dataLimit;
    private String dataMetering;
    private Boolean messagingEnabled;
    private Boolean voiceEnabled;
    private Boolean commandsEnabled;
    private Boolean nationalRoamingEnabled;
    private List<String> internationalRoaming;

    /**
     * The unique_name.
     *
     * @param uniqueName The unique_name
     * @return this
     */
    public RatePlanCreator setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * The friendly_name.
     *
     * @param friendlyName The friendly_name
     * @return this
     */
    public RatePlanCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * The data_enabled.
     *
     * @param dataEnabled The data_enabled
     * @return this
     */
    public RatePlanCreator setDataEnabled(final Boolean dataEnabled) {
        this.dataEnabled = dataEnabled;
        return this;
    }

    /**
     * The data_limit.
     *
     * @param dataLimit The data_limit
     * @return this
     */
    public RatePlanCreator setDataLimit(final Integer dataLimit) {
        this.dataLimit = dataLimit;
        return this;
    }

    /**
     * The data_metering.
     *
     * @param dataMetering The data_metering
     * @return this
     */
    public RatePlanCreator setDataMetering(final String dataMetering) {
        this.dataMetering = dataMetering;
        return this;
    }

    /**
     * The messaging_enabled.
     *
     * @param messagingEnabled The messaging_enabled
     * @return this
     */
    public RatePlanCreator setMessagingEnabled(final Boolean messagingEnabled) {
        this.messagingEnabled = messagingEnabled;
        return this;
    }

    /**
     * The voice_enabled.
     *
     * @param voiceEnabled The voice_enabled
     * @return this
     */
    public RatePlanCreator setVoiceEnabled(final Boolean voiceEnabled) {
        this.voiceEnabled = voiceEnabled;
        return this;
    }

    /**
     * The commands_enabled.
     *
     * @param commandsEnabled The commands_enabled
     * @return this
     */
    public RatePlanCreator setCommandsEnabled(final Boolean commandsEnabled) {
        this.commandsEnabled = commandsEnabled;
        return this;
    }

    /**
     * The national_roaming_enabled.
     *
     * @param nationalRoamingEnabled The national_roaming_enabled
     * @return this
     */
    public RatePlanCreator setNationalRoamingEnabled(final Boolean nationalRoamingEnabled) {
        this.nationalRoamingEnabled = nationalRoamingEnabled;
        return this;
    }

    /**
     * The international_roaming.
     *
     * @param internationalRoaming The international_roaming
     * @return this
     */
    public RatePlanCreator setInternationalRoaming(final List<String> internationalRoaming) {
        this.internationalRoaming = internationalRoaming;
        return this;
    }

    /**
     * The international_roaming.
     *
     * @param internationalRoaming The international_roaming
     * @return this
     */
    public RatePlanCreator setInternationalRoaming(final String internationalRoaming) {
        return setInternationalRoaming(Promoter.listOfOne(internationalRoaming));
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created RatePlan
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public RatePlan create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            "/wireless/RatePlans"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("RatePlan creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return RatePlan.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (dataEnabled != null) {
            request.addPostParam("DataEnabled", dataEnabled.toString());
        }

        if (dataLimit != null) {
            request.addPostParam("DataLimit", dataLimit.toString());
        }

        if (dataMetering != null) {
            request.addPostParam("DataMetering", dataMetering);
        }

        if (messagingEnabled != null) {
            request.addPostParam("MessagingEnabled", messagingEnabled.toString());
        }

        if (voiceEnabled != null) {
            request.addPostParam("VoiceEnabled", voiceEnabled.toString());
        }

        if (commandsEnabled != null) {
            request.addPostParam("CommandsEnabled", commandsEnabled.toString());
        }

        if (nationalRoamingEnabled != null) {
            request.addPostParam("NationalRoamingEnabled", nationalRoamingEnabled.toString());
        }

        if (internationalRoaming != null) {
            for (String prop : internationalRoaming) {
                request.addPostParam("InternationalRoaming", prop);
            }
        }
    }
}