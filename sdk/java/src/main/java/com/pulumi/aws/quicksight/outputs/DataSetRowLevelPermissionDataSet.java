// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSetRowLevelPermissionDataSet {
    /**
     * @return ARN of the dataset that contains permissions for RLS.
     * 
     */
    private String arn;
    /**
     * @return User or group rules associated with the dataset that contains permissions for RLS.
     * 
     */
    private @Nullable String formatVersion;
    /**
     * @return Namespace associated with the dataset that contains permissions for RLS.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return Type of permissions to use when interpreting the permissions for RLS. Valid values are `GRANT_ACCESS` and `DENY_ACCESS`.
     * 
     */
    private String permissionPolicy;
    /**
     * @return Status of the row-level security permission dataset. If enabled, the status is `ENABLED`. If disabled, the status is `DISABLED`.
     * 
     */
    private @Nullable String status;

    private DataSetRowLevelPermissionDataSet() {}
    /**
     * @return ARN of the dataset that contains permissions for RLS.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return User or group rules associated with the dataset that contains permissions for RLS.
     * 
     */
    public Optional<String> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }
    /**
     * @return Namespace associated with the dataset that contains permissions for RLS.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return Type of permissions to use when interpreting the permissions for RLS. Valid values are `GRANT_ACCESS` and `DENY_ACCESS`.
     * 
     */
    public String permissionPolicy() {
        return this.permissionPolicy;
    }
    /**
     * @return Status of the row-level security permission dataset. If enabled, the status is `ENABLED`. If disabled, the status is `DISABLED`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetRowLevelPermissionDataSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private @Nullable String formatVersion;
        private @Nullable String namespace;
        private String permissionPolicy;
        private @Nullable String status;
        public Builder() {}
        public Builder(DataSetRowLevelPermissionDataSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.formatVersion = defaults.formatVersion;
    	      this.namespace = defaults.namespace;
    	      this.permissionPolicy = defaults.permissionPolicy;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("DataSetRowLevelPermissionDataSet", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder formatVersion(@Nullable String formatVersion) {

            this.formatVersion = formatVersion;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder permissionPolicy(String permissionPolicy) {
            if (permissionPolicy == null) {
              throw new MissingRequiredPropertyException("DataSetRowLevelPermissionDataSet", "permissionPolicy");
            }
            this.permissionPolicy = permissionPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public DataSetRowLevelPermissionDataSet build() {
            final var _resultValue = new DataSetRowLevelPermissionDataSet();
            _resultValue.arn = arn;
            _resultValue.formatVersion = formatVersion;
            _resultValue.namespace = namespace;
            _resultValue.permissionPolicy = permissionPolicy;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
