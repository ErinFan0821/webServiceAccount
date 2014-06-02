package com.erinfan.endpoint;

import com.erinfan.webservice.Account;
import com.erinfan.webservice.AccountDetailsRequest;
import com.erinfan.webservice.AccountDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AccountServiceEndpoint {
    private static final String TARGET_NAMESPACE = "http://erinfan.webservices.com";

    @PayloadRoot(localPart = "AccountDetailsRequest", namespace = TARGET_NAMESPACE)
    public
    @ResponsePayload
    AccountDetailsResponse getAccountDetails(@RequestPayload AccountDetailsRequest request) {
        AccountDetailsResponse response = new AccountDetailsResponse();
        Account account = new Account();
        account.setAccountName("ErinFan");
        account.setAccountNumber("12345");
        response.setAccountDetails(account);
        return response;
    }
}
