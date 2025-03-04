// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.aws.lex.outputs.BotClarificationPromptMessage;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotClarificationPrompt {
    /**
     * @return The number of times to prompt the user for information.
     * 
     */
    private Integer maxAttempts;
    private List<BotClarificationPromptMessage> messages;
    private @Nullable String responseCard;

    private BotClarificationPrompt() {}
    /**
     * @return The number of times to prompt the user for information.
     * 
     */
    public Integer maxAttempts() {
        return this.maxAttempts;
    }
    public List<BotClarificationPromptMessage> messages() {
        return this.messages;
    }
    public Optional<String> responseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotClarificationPrompt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxAttempts;
        private List<BotClarificationPromptMessage> messages;
        private @Nullable String responseCard;
        public Builder() {}
        public Builder(BotClarificationPrompt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        @CustomType.Setter
        public Builder maxAttempts(Integer maxAttempts) {
            if (maxAttempts == null) {
              throw new MissingRequiredPropertyException("BotClarificationPrompt", "maxAttempts");
            }
            this.maxAttempts = maxAttempts;
            return this;
        }
        @CustomType.Setter
        public Builder messages(List<BotClarificationPromptMessage> messages) {
            if (messages == null) {
              throw new MissingRequiredPropertyException("BotClarificationPrompt", "messages");
            }
            this.messages = messages;
            return this;
        }
        public Builder messages(BotClarificationPromptMessage... messages) {
            return messages(List.of(messages));
        }
        @CustomType.Setter
        public Builder responseCard(@Nullable String responseCard) {

            this.responseCard = responseCard;
            return this;
        }
        public BotClarificationPrompt build() {
            final var _resultValue = new BotClarificationPrompt();
            _resultValue.maxAttempts = maxAttempts;
            _resultValue.messages = messages;
            _resultValue.responseCard = responseCard;
            return _resultValue;
        }
    }
}
