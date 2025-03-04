// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetRouteSpecTcpRouteAction;
import com.pulumi.aws.appmesh.outputs.GetRouteSpecTcpRouteMatch;
import com.pulumi.aws.appmesh.outputs.GetRouteSpecTcpRouteTimeout;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteSpecTcpRoute {
    private List<GetRouteSpecTcpRouteAction> actions;
    private List<GetRouteSpecTcpRouteMatch> matches;
    private List<GetRouteSpecTcpRouteTimeout> timeouts;

    private GetRouteSpecTcpRoute() {}
    public List<GetRouteSpecTcpRouteAction> actions() {
        return this.actions;
    }
    public List<GetRouteSpecTcpRouteMatch> matches() {
        return this.matches;
    }
    public List<GetRouteSpecTcpRouteTimeout> timeouts() {
        return this.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteSpecTcpRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRouteSpecTcpRouteAction> actions;
        private List<GetRouteSpecTcpRouteMatch> matches;
        private List<GetRouteSpecTcpRouteTimeout> timeouts;
        public Builder() {}
        public Builder(GetRouteSpecTcpRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.matches = defaults.matches;
    	      this.timeouts = defaults.timeouts;
        }

        @CustomType.Setter
        public Builder actions(List<GetRouteSpecTcpRouteAction> actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("GetRouteSpecTcpRoute", "actions");
            }
            this.actions = actions;
            return this;
        }
        public Builder actions(GetRouteSpecTcpRouteAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder matches(List<GetRouteSpecTcpRouteMatch> matches) {
            if (matches == null) {
              throw new MissingRequiredPropertyException("GetRouteSpecTcpRoute", "matches");
            }
            this.matches = matches;
            return this;
        }
        public Builder matches(GetRouteSpecTcpRouteMatch... matches) {
            return matches(List.of(matches));
        }
        @CustomType.Setter
        public Builder timeouts(List<GetRouteSpecTcpRouteTimeout> timeouts) {
            if (timeouts == null) {
              throw new MissingRequiredPropertyException("GetRouteSpecTcpRoute", "timeouts");
            }
            this.timeouts = timeouts;
            return this;
        }
        public Builder timeouts(GetRouteSpecTcpRouteTimeout... timeouts) {
            return timeouts(List.of(timeouts));
        }
        public GetRouteSpecTcpRoute build() {
            final var _resultValue = new GetRouteSpecTcpRoute();
            _resultValue.actions = actions;
            _resultValue.matches = matches;
            _resultValue.timeouts = timeouts;
            return _resultValue;
        }
    }
}
