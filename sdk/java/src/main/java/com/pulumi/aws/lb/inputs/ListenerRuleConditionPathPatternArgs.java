// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleConditionPathPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionPathPatternArgs Empty = new ListenerRuleConditionPathPatternArgs();

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private ListenerRuleConditionPathPatternArgs() {}

    private ListenerRuleConditionPathPatternArgs(ListenerRuleConditionPathPatternArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleConditionPathPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleConditionPathPatternArgs $;

        public Builder() {
            $ = new ListenerRuleConditionPathPatternArgs();
        }

        public Builder(ListenerRuleConditionPathPatternArgs defaults) {
            $ = new ListenerRuleConditionPathPatternArgs(Objects.requireNonNull(defaults));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ListenerRuleConditionPathPatternArgs build() {
            if ($.values == null) {
                throw new MissingRequiredPropertyException("ListenerRuleConditionPathPatternArgs", "values");
            }
            return $;
        }
    }

}
