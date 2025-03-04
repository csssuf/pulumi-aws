// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo {
    private @Nullable String accessToken;
    private String clientId;
    private String clientSecret;
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest oauthRequest;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo() {}
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    public String clientId() {
        return this.clientId;
    }
    public String clientSecret() {
        return this.clientSecret;
    }
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessToken;
        private String clientId;
        private String clientSecret;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest oauthRequest;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.oauthRequest = defaults.oauthRequest;
        }

        @CustomType.Setter
        public Builder accessToken(@Nullable String accessToken) {

            this.accessToken = accessToken;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            if (clientSecret == null) {
              throw new MissingRequiredPropertyException("ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo", "clientSecret");
            }
            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest oauthRequest) {

            this.oauthRequest = oauthRequest;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo build() {
            final var _resultValue = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketo();
            _resultValue.accessToken = accessToken;
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.oauthRequest = oauthRequest;
            return _resultValue;
        }
    }
}
