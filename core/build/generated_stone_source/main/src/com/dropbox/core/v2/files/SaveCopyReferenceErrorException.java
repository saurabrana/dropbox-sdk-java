/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * SaveCopyReferenceError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilesRequests#copyReferenceSave(String,String)}. </p>
 */
public class SaveCopyReferenceErrorException extends DbxApiException {
    // exception for routes:
    //     2/files/copy_reference/save

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserFilesRequests#copyReferenceSave(String,String)}.
     */
    public final SaveCopyReferenceError errorValue;

    public SaveCopyReferenceErrorException(String routeName, String requestId, LocalizedText userMessage, SaveCopyReferenceError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}