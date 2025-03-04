// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWindowsFileSystemArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWindowsFileSystemArgs Empty = new GetWindowsFileSystemArgs();

    /**
     * Identifier of the file system (e.g. `fs-12345678`).
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Identifier of the file system (e.g. `fs-12345678`).
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The tags to associate with the file system.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags to associate with the file system.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetWindowsFileSystemArgs() {}

    private GetWindowsFileSystemArgs(GetWindowsFileSystemArgs $) {
        this.id = $.id;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWindowsFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWindowsFileSystemArgs $;

        public Builder() {
            $ = new GetWindowsFileSystemArgs();
        }

        public Builder(GetWindowsFileSystemArgs defaults) {
            $ = new GetWindowsFileSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Identifier of the file system (e.g. `fs-12345678`).
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier of the file system (e.g. `fs-12345678`).
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param tags The tags to associate with the file system.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags to associate with the file system.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetWindowsFileSystemArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetWindowsFileSystemArgs", "id");
            }
            return $;
        }
    }

}
