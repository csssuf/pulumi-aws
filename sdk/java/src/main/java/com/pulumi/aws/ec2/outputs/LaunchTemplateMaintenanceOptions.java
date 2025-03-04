// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateMaintenanceOptions {
    /**
     * @return Disables the automatic recovery behavior of your instance or sets it to default. Can be `&#34;default&#34;` or `&#34;disabled&#34;`. See [Recover your instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-recover.html) for more details.
     * 
     */
    private @Nullable String autoRecovery;

    private LaunchTemplateMaintenanceOptions() {}
    /**
     * @return Disables the automatic recovery behavior of your instance or sets it to default. Can be `&#34;default&#34;` or `&#34;disabled&#34;`. See [Recover your instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-recover.html) for more details.
     * 
     */
    public Optional<String> autoRecovery() {
        return Optional.ofNullable(this.autoRecovery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateMaintenanceOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String autoRecovery;
        public Builder() {}
        public Builder(LaunchTemplateMaintenanceOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRecovery = defaults.autoRecovery;
        }

        @CustomType.Setter
        public Builder autoRecovery(@Nullable String autoRecovery) {

            this.autoRecovery = autoRecovery;
            return this;
        }
        public LaunchTemplateMaintenanceOptions build() {
            final var _resultValue = new LaunchTemplateMaintenanceOptions();
            _resultValue.autoRecovery = autoRecovery;
            return _resultValue;
        }
    }
}
