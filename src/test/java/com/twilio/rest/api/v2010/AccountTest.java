/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class AccountTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Account.creator().create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"auth_token\": \"auth_token\",\"date_created\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"friendly_name\": \"friendly_name\",\"owner_account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"active\",\"subresource_uris\": {\"available_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AvailablePhoneNumbers.json\",\"calls\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls.json\",\"conferences\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json\",\"incoming_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers.json\",\"notifications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Notifications.json\",\"outgoing_caller_ids\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/OutgoingCallerIds.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\",\"transcriptions\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Transcriptions.json\",\"addresses\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Addresses.json\",\"signing_keys\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SigningKeys.json\",\"connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ConnectApps.json\",\"sip\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP.json\",\"authorized_connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AuthorizedConnectApps.json\",\"usage\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Usage.json\",\"keys\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Keys.json\",\"applications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json\",\"short_codes\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SMS/ShortCodes.json\",\"queues\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queues.json\",\"messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages.json\",\"balance\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Balance.json\"},\"type\": \"Full\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Account.creator().create();
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Account.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"auth_token\": \"auth_token\",\"date_created\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"friendly_name\": \"friendly_name\",\"owner_account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"active\",\"subresource_uris\": {\"available_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AvailablePhoneNumbers.json\",\"calls\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls.json\",\"conferences\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json\",\"incoming_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers.json\",\"notifications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Notifications.json\",\"outgoing_caller_ids\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/OutgoingCallerIds.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\",\"transcriptions\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Transcriptions.json\",\"addresses\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Addresses.json\",\"signing_keys\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SigningKeys.json\",\"connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ConnectApps.json\",\"sip\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP.json\",\"authorized_connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AuthorizedConnectApps.json\",\"usage\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Usage.json\",\"keys\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Keys.json\",\"applications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json\",\"short_codes\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SMS/ShortCodes.json\",\"queues\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queues.json\",\"messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages.json\",\"balance\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Balance.json\"},\"type\": \"Full\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Account.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Account.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"first_page_uri\": \"/2010-04-01/Accounts.json?FriendlyName=friendly_name&Status=active&PageSize=50&Page=0\",\"end\": 0,\"previous_page_uri\": null,\"accounts\": [],\"uri\": \"/2010-04-01/Accounts.json?FriendlyName=friendly_name&Status=active&PageSize=50&Page=0\",\"page_size\": 50,\"start\": 0,\"next_page_uri\": null,\"page\": 0}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Account.reader().read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"first_page_uri\": \"/2010-04-01/Accounts.json?FriendlyName=friendly_name&Status=active&PageSize=50&Page=0\",\"end\": 0,\"previous_page_uri\": null,\"accounts\": [{\"auth_token\": \"auth_token\",\"date_created\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"friendly_name\": \"friendly_name\",\"owner_account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"active\",\"subresource_uris\": {\"available_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AvailablePhoneNumbers.json\",\"calls\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls.json\",\"conferences\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json\",\"incoming_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers.json\",\"notifications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Notifications.json\",\"outgoing_caller_ids\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/OutgoingCallerIds.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\",\"transcriptions\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Transcriptions.json\",\"addresses\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Addresses.json\",\"signing_keys\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SigningKeys.json\",\"connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ConnectApps.json\",\"sip\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP.json\",\"authorized_connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AuthorizedConnectApps.json\",\"usage\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Usage.json\",\"keys\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Keys.json\",\"applications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json\",\"short_codes\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SMS/ShortCodes.json\",\"queues\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queues.json\",\"messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages.json\",\"balance\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Balance.json\"},\"type\": \"Full\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}],\"uri\": \"/2010-04-01/Accounts.json?FriendlyName=friendly_name&Status=active&PageSize=50&Page=0\",\"page_size\": 50,\"start\": 0,\"next_page_uri\": null,\"page\": 0}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Account.reader().read());
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Account.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"auth_token\": \"auth_token\",\"date_created\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"friendly_name\": \"friendly_name\",\"owner_account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"active\",\"subresource_uris\": {\"available_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AvailablePhoneNumbers.json\",\"calls\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls.json\",\"conferences\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json\",\"incoming_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers.json\",\"notifications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Notifications.json\",\"outgoing_caller_ids\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/OutgoingCallerIds.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\",\"transcriptions\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Transcriptions.json\",\"addresses\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Addresses.json\",\"signing_keys\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SigningKeys.json\",\"connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ConnectApps.json\",\"sip\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP.json\",\"authorized_connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AuthorizedConnectApps.json\",\"usage\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Usage.json\",\"keys\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Keys.json\",\"applications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json\",\"short_codes\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SMS/ShortCodes.json\",\"queues\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queues.json\",\"messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages.json\",\"balance\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Balance.json\"},\"type\": \"Full\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Account.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }
}