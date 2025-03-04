// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs Empty = new ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs();

    /**
     * Average bitrate in bits/second.
     * 
     */
    @Import(name="bitrate")
    private @Nullable Output<Double> bitrate;

    /**
     * @return Average bitrate in bits/second.
     * 
     */
    public Optional<Output<Double>> bitrate() {
        return Optional.ofNullable(this.bitrate);
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
     * 
     */
    @Import(name="bitstreamMode")
    private @Nullable Output<String> bitstreamMode;

    /**
     * @return Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
     * 
     */
    public Optional<Output<String>> bitstreamMode() {
        return Optional.ofNullable(this.bitstreamMode);
    }

    /**
     * Dolby Digital coding mode.
     * 
     */
    @Import(name="codingMode")
    private @Nullable Output<String> codingMode;

    /**
     * @return Dolby Digital coding mode.
     * 
     */
    public Optional<Output<String>> codingMode() {
        return Optional.ofNullable(this.codingMode);
    }

    /**
     * Sets the dialnorm of the output.
     * 
     */
    @Import(name="dialnorm")
    private @Nullable Output<Integer> dialnorm;

    /**
     * @return Sets the dialnorm of the output.
     * 
     */
    public Optional<Output<Integer>> dialnorm() {
        return Optional.ofNullable(this.dialnorm);
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
     * 
     */
    @Import(name="drcProfile")
    private @Nullable Output<String> drcProfile;

    /**
     * @return If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
     * 
     */
    public Optional<Output<String>> drcProfile() {
        return Optional.ofNullable(this.drcProfile);
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding.
     * 
     */
    @Import(name="lfeFilter")
    private @Nullable Output<String> lfeFilter;

    /**
     * @return When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding.
     * 
     */
    public Optional<Output<String>> lfeFilter() {
        return Optional.ofNullable(this.lfeFilter);
    }

    /**
     * Metadata control.
     * 
     */
    @Import(name="metadataControl")
    private @Nullable Output<String> metadataControl;

    /**
     * @return Metadata control.
     * 
     */
    public Optional<Output<String>> metadataControl() {
        return Optional.ofNullable(this.metadataControl);
    }

    private ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs() {}

    private ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs(ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs $) {
        this.bitrate = $.bitrate;
        this.bitstreamMode = $.bitstreamMode;
        this.codingMode = $.codingMode;
        this.dialnorm = $.dialnorm;
        this.drcProfile = $.drcProfile;
        this.lfeFilter = $.lfeFilter;
        this.metadataControl = $.metadataControl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs();
        }

        public Builder(ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs defaults) {
            $ = new ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bitrate Average bitrate in bits/second.
         * 
         * @return builder
         * 
         */
        public Builder bitrate(@Nullable Output<Double> bitrate) {
            $.bitrate = bitrate;
            return this;
        }

        /**
         * @param bitrate Average bitrate in bits/second.
         * 
         * @return builder
         * 
         */
        public Builder bitrate(Double bitrate) {
            return bitrate(Output.of(bitrate));
        }

        /**
         * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
         * 
         * @return builder
         * 
         */
        public Builder bitstreamMode(@Nullable Output<String> bitstreamMode) {
            $.bitstreamMode = bitstreamMode;
            return this;
        }

        /**
         * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
         * 
         * @return builder
         * 
         */
        public Builder bitstreamMode(String bitstreamMode) {
            return bitstreamMode(Output.of(bitstreamMode));
        }

        /**
         * @param codingMode Dolby Digital coding mode.
         * 
         * @return builder
         * 
         */
        public Builder codingMode(@Nullable Output<String> codingMode) {
            $.codingMode = codingMode;
            return this;
        }

        /**
         * @param codingMode Dolby Digital coding mode.
         * 
         * @return builder
         * 
         */
        public Builder codingMode(String codingMode) {
            return codingMode(Output.of(codingMode));
        }

        /**
         * @param dialnorm Sets the dialnorm of the output.
         * 
         * @return builder
         * 
         */
        public Builder dialnorm(@Nullable Output<Integer> dialnorm) {
            $.dialnorm = dialnorm;
            return this;
        }

        /**
         * @param dialnorm Sets the dialnorm of the output.
         * 
         * @return builder
         * 
         */
        public Builder dialnorm(Integer dialnorm) {
            return dialnorm(Output.of(dialnorm));
        }

        /**
         * @param drcProfile If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
         * 
         * @return builder
         * 
         */
        public Builder drcProfile(@Nullable Output<String> drcProfile) {
            $.drcProfile = drcProfile;
            return this;
        }

        /**
         * @param drcProfile If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
         * 
         * @return builder
         * 
         */
        public Builder drcProfile(String drcProfile) {
            return drcProfile(Output.of(drcProfile));
        }

        /**
         * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding.
         * 
         * @return builder
         * 
         */
        public Builder lfeFilter(@Nullable Output<String> lfeFilter) {
            $.lfeFilter = lfeFilter;
            return this;
        }

        /**
         * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding.
         * 
         * @return builder
         * 
         */
        public Builder lfeFilter(String lfeFilter) {
            return lfeFilter(Output.of(lfeFilter));
        }

        /**
         * @param metadataControl Metadata control.
         * 
         * @return builder
         * 
         */
        public Builder metadataControl(@Nullable Output<String> metadataControl) {
            $.metadataControl = metadataControl;
            return this;
        }

        /**
         * @param metadataControl Metadata control.
         * 
         * @return builder
         * 
         */
        public Builder metadataControl(String metadataControl) {
            return metadataControl(Output.of(metadataControl));
        }

        public ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs build() {
            return $;
        }
    }

}
