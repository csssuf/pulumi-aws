// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appfabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppAuthorizationTenant {
    /**
     * @return The display name of the tenant.
     * 
     */
    private String tenantDisplayName;
    /**
     * @return The ID of the application tenant.
     * 
     */
    private String tenantIdentifier;

    private AppAuthorizationTenant() {}
    /**
     * @return The display name of the tenant.
     * 
     */
    public String tenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * @return The ID of the application tenant.
     * 
     */
    public String tenantIdentifier() {
        return this.tenantIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppAuthorizationTenant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tenantDisplayName;
        private String tenantIdentifier;
        public Builder() {}
        public Builder(AppAuthorizationTenant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tenantDisplayName = defaults.tenantDisplayName;
    	      this.tenantIdentifier = defaults.tenantIdentifier;
        }

        @CustomType.Setter
        public Builder tenantDisplayName(String tenantDisplayName) {
            if (tenantDisplayName == null) {
              throw new MissingRequiredPropertyException("AppAuthorizationTenant", "tenantDisplayName");
            }
            this.tenantDisplayName = tenantDisplayName;
            return this;
        }
        @CustomType.Setter
        public Builder tenantIdentifier(String tenantIdentifier) {
            if (tenantIdentifier == null) {
              throw new MissingRequiredPropertyException("AppAuthorizationTenant", "tenantIdentifier");
            }
            this.tenantIdentifier = tenantIdentifier;
            return this;
        }
        public AppAuthorizationTenant build() {
            final var _resultValue = new AppAuthorizationTenant();
            _resultValue.tenantDisplayName = tenantDisplayName;
            _resultValue.tenantIdentifier = tenantIdentifier;
            return _resultValue;
        }
    }
}
