/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.stone.test;

import com.dropbox.core.DbxException;
import com.dropbox.core.util.LangUtil;
import com.dropbox.core.v2.DbxUploadStyleBuilder;

import java.util.Date;

/**
 * The request builder returned by {@link
 * DbxTestTestRequests#testUploadV3Builder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class DbxTestTestUploadV3Builder extends DbxUploadStyleBuilder<Void, ParentUnion, ParentUnionException> {
    private final DbxTestTestRequests _client;
    private final Dog.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue test
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    DbxTestTestUploadV3Builder(DbxTestTestRequests _client, Dog.Builder _builder) {
        if (_client == null) {
            throw new NullPointerException("_client");
        }
        this._client = _client;
        if (_builder == null) {
            throw new NullPointerException("_builder");
        }
        this._builder = _builder;
    }

    /**
     * Set value for optional field.
     *
     * @return this builder
     */
    public DbxTestTestUploadV3Builder withBorn(Date born) {
        this._builder.withBorn(born);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @return this builder
     */
    public DbxTestTestUploadV3Builder withSize(DogSize size) {
        this._builder.withSize(size);
        return this;
    }

    @Override
    public TestUploadV3Uploader start() throws ParentUnionException, DbxException {
        Dog arg_ = this._builder.build();
        return _client.testUploadV3(arg_);
    }
}