// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import * as pulumi from "@pulumi/pulumi";
import * as aws from "@pulumi/aws";

const cfg = new pulumi.Config();
const parameterName = cfg.require("parameterName");

const param = new aws.ssm.Parameter('regress-4011-test-secret', {
  name: parameterName,
  type: 'SecureString',
  value: "test",
});

const retrievedParam = aws.ssm.Parameter.get('retrieved-parameter', `${parameterName}:1`);

export const secret = pulumi.output(param).arn;
export const retrievedSecret = pulumi.output(retrievedParam).arn;
