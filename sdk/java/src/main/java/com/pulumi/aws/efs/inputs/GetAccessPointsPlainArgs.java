// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPointsPlainArgs Empty = new GetAccessPointsPlainArgs();

    /**
     * EFS File System identifier.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private String fileSystemId;

    /**
     * @return EFS File System identifier.
     * 
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    private GetAccessPointsPlainArgs() {}

    private GetAccessPointsPlainArgs(GetAccessPointsPlainArgs $) {
        this.fileSystemId = $.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPointsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPointsPlainArgs $;

        public Builder() {
            $ = new GetAccessPointsPlainArgs();
        }

        public Builder(GetAccessPointsPlainArgs defaults) {
            $ = new GetAccessPointsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileSystemId EFS File System identifier.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        public GetAccessPointsPlainArgs build() {
            if ($.fileSystemId == null) {
                throw new MissingRequiredPropertyException("GetAccessPointsPlainArgs", "fileSystemId");
            }
            return $;
        }
    }

}
