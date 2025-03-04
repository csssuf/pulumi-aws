// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayRouteSpecHttp2RouteActionRewriteHostname {
    private String defaultTargetHostname;

    private GetGatewayRouteSpecHttp2RouteActionRewriteHostname() {}
    public String defaultTargetHostname() {
        return this.defaultTargetHostname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteSpecHttp2RouteActionRewriteHostname defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultTargetHostname;
        public Builder() {}
        public Builder(GetGatewayRouteSpecHttp2RouteActionRewriteHostname defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTargetHostname = defaults.defaultTargetHostname;
        }

        @CustomType.Setter
        public Builder defaultTargetHostname(String defaultTargetHostname) {
            if (defaultTargetHostname == null) {
              throw new MissingRequiredPropertyException("GetGatewayRouteSpecHttp2RouteActionRewriteHostname", "defaultTargetHostname");
            }
            this.defaultTargetHostname = defaultTargetHostname;
            return this;
        }
        public GetGatewayRouteSpecHttp2RouteActionRewriteHostname build() {
            final var _resultValue = new GetGatewayRouteSpecHttp2RouteActionRewriteHostname();
            _resultValue.defaultTargetHostname = defaultTargetHostname;
            return _resultValue;
        }
    }
}
