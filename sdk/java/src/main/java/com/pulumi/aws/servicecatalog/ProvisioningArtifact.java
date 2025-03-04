// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.ProvisioningArtifactArgs;
import com.pulumi.aws.servicecatalog.inputs.ProvisioningArtifactState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Provisioning Artifact for a specified product.
 * 
 * &gt; A &#34;provisioning artifact&#34; is also referred to as a &#34;version.&#34;
 * 
 * &gt; **NOTE:** You cannot create a provisioning artifact for a product that was shared with you.
 * 
 * &gt; **NOTE:** The user or role that use this resource must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `template_physical_id` argument.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.servicecatalog.ProvisioningArtifact;
 * import com.pulumi.aws.servicecatalog.ProvisioningArtifactArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ProvisioningArtifact("example", ProvisioningArtifactArgs.builder()
 *             .name("example")
 *             .productId(exampleAwsServicecatalogProduct.id())
 *             .type("CLOUD_FORMATION_TEMPLATE")
 *             .templateUrl(String.format("https://%s/%s", exampleAwsS3Bucket.bucketRegionalDomainName(),exampleAwsS3Object.key()))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_servicecatalog_provisioning_artifact` using the provisioning artifact ID and product ID separated by a colon. For example:
 * 
 * ```sh
 * $ pulumi import aws:servicecatalog/provisioningArtifact:ProvisioningArtifact example pa-ij2b6lusy6dec:prod-el3an0rma3
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/provisioningArtifact:ProvisioningArtifact")
public class ProvisioningArtifact extends com.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
     * 
     */
    @Export(name="acceptLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
     * 
     */
    public Output<Optional<String>> acceptLanguage() {
        return Codegen.optional(this.acceptLanguage);
    }
    /**
     * Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * Time when the provisioning artifact was created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return Time when the provisioning artifact was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
     * 
     */
    @Export(name="disableTemplateValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableTemplateValidation;

    /**
     * @return Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
     * 
     */
    public Output<Optional<Boolean>> disableTemplateValidation() {
        return Codegen.optional(this.disableTemplateValidation);
    }
    /**
     * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
     * 
     */
    @Export(name="guidance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> guidance;

    /**
     * @return Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
     * 
     */
    public Output<Optional<String>> guidance() {
        return Codegen.optional(this.guidance);
    }
    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Identifier of the product.
     * 
     */
    @Export(name="productId", refs={String.class}, tree="[0]")
    private Output<String> productId;

    /**
     * @return Identifier of the product.
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }
    /**
     * Provisioning artifact identifier.
     * 
     */
    @Export(name="provisioningArtifactId", refs={String.class}, tree="[0]")
    private Output<String> provisioningArtifactId;

    /**
     * @return Provisioning artifact identifier.
     * 
     */
    public Output<String> provisioningArtifactId() {
        return this.provisioningArtifactId;
    }
    /**
     * Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
     * 
     */
    @Export(name="templatePhysicalId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> templatePhysicalId;

    /**
     * @return Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
     * 
     */
    public Output<Optional<String>> templatePhysicalId() {
        return Codegen.optional(this.templatePhysicalId);
    }
    /**
     * Template source as URL of the CloudFormation template in Amazon S3.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="templateUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> templateUrl;

    /**
     * @return Template source as URL of the CloudFormation template in Amazon S3.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Optional<String>> templateUrl() {
        return Codegen.optional(this.templateUrl);
    }
    /**
     * Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProvisioningArtifact(java.lang.String name) {
        this(name, ProvisioningArtifactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProvisioningArtifact(java.lang.String name, ProvisioningArtifactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProvisioningArtifact(java.lang.String name, ProvisioningArtifactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/provisioningArtifact:ProvisioningArtifact", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProvisioningArtifact(java.lang.String name, Output<java.lang.String> id, @Nullable ProvisioningArtifactState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/provisioningArtifact:ProvisioningArtifact", name, state, makeResourceOptions(options, id), false);
    }

    private static ProvisioningArtifactArgs makeArgs(ProvisioningArtifactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProvisioningArtifactArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ProvisioningArtifact get(java.lang.String name, Output<java.lang.String> id, @Nullable ProvisioningArtifactState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProvisioningArtifact(name, id, state, options);
    }
}
