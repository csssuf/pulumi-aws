// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPolicyAttachmentsExclusiveState extends com.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAttachmentsExclusiveState Empty = new GroupPolicyAttachmentsExclusiveState();

    /**
     * IAM group name.
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return IAM group name.
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * A list of customer managed policy ARNs to be attached to the group. Policies attached to this group but not configured in this argument will be removed.
     * 
     */
    @Import(name="policyArns")
    private @Nullable Output<List<String>> policyArns;

    /**
     * @return A list of customer managed policy ARNs to be attached to the group. Policies attached to this group but not configured in this argument will be removed.
     * 
     */
    public Optional<Output<List<String>>> policyArns() {
        return Optional.ofNullable(this.policyArns);
    }

    private GroupPolicyAttachmentsExclusiveState() {}

    private GroupPolicyAttachmentsExclusiveState(GroupPolicyAttachmentsExclusiveState $) {
        this.groupName = $.groupName;
        this.policyArns = $.policyArns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPolicyAttachmentsExclusiveState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPolicyAttachmentsExclusiveState $;

        public Builder() {
            $ = new GroupPolicyAttachmentsExclusiveState();
        }

        public Builder(GroupPolicyAttachmentsExclusiveState defaults) {
            $ = new GroupPolicyAttachmentsExclusiveState(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupName IAM group name.
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName IAM group name.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param policyArns A list of customer managed policy ARNs to be attached to the group. Policies attached to this group but not configured in this argument will be removed.
         * 
         * @return builder
         * 
         */
        public Builder policyArns(@Nullable Output<List<String>> policyArns) {
            $.policyArns = policyArns;
            return this;
        }

        /**
         * @param policyArns A list of customer managed policy ARNs to be attached to the group. Policies attached to this group but not configured in this argument will be removed.
         * 
         * @return builder
         * 
         */
        public Builder policyArns(List<String> policyArns) {
            return policyArns(Output.of(policyArns));
        }

        /**
         * @param policyArns A list of customer managed policy ARNs to be attached to the group. Policies attached to this group but not configured in this argument will be removed.
         * 
         * @return builder
         * 
         */
        public Builder policyArns(String... policyArns) {
            return policyArns(List.of(policyArns));
        }

        public GroupPolicyAttachmentsExclusiveState build() {
            return $;
        }
    }

}
