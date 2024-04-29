/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.openid;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link UserInfoError} error.
 *
 * <p> This exception is raised by {@link DbxUserOpenidRequests#userinfo}. </p>
 */
public class UserInfoErrorException extends DbxApiException {
    // exception for routes:
    //     2/openid/userinfo

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link DbxUserOpenidRequests#userinfo}.
     */
    public final UserInfoError errorValue;

    public UserInfoErrorException(String routeName, String requestId, LocalizedText userMessage, UserInfoError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}