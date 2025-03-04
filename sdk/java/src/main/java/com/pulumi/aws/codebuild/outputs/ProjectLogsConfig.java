// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.outputs;

import com.pulumi.aws.codebuild.outputs.ProjectLogsConfigCloudwatchLogs;
import com.pulumi.aws.codebuild.outputs.ProjectLogsConfigS3Logs;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectLogsConfig {
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    private @Nullable ProjectLogsConfigCloudwatchLogs cloudwatchLogs;
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    private @Nullable ProjectLogsConfigS3Logs s3Logs;

    private ProjectLogsConfig() {}
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<ProjectLogsConfigCloudwatchLogs> cloudwatchLogs() {
        return Optional.ofNullable(this.cloudwatchLogs);
    }
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<ProjectLogsConfigS3Logs> s3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLogsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ProjectLogsConfigCloudwatchLogs cloudwatchLogs;
        private @Nullable ProjectLogsConfigS3Logs s3Logs;
        public Builder() {}
        public Builder(ProjectLogsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.s3Logs = defaults.s3Logs;
        }

        @CustomType.Setter
        public Builder cloudwatchLogs(@Nullable ProjectLogsConfigCloudwatchLogs cloudwatchLogs) {

            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }
        @CustomType.Setter
        public Builder s3Logs(@Nullable ProjectLogsConfigS3Logs s3Logs) {

            this.s3Logs = s3Logs;
            return this;
        }
        public ProjectLogsConfig build() {
            final var _resultValue = new ProjectLogsConfig();
            _resultValue.cloudwatchLogs = cloudwatchLogs;
            _resultValue.s3Logs = s3Logs;
            return _resultValue;
        }
    }
}
