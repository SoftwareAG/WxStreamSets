# WxStreamSets
WxStreamSets is a  webMethods Integration Server package designed to simplify the integration with StreamSets.

## Pre-requisites
  - webMethods Integration Server
  - StreamSets

## Features
1.	Ready to use flow-services to call StreamSets APIs.
2.	Start StreamSets Job synchronously.
 
## Installation
1.	Download the latest release of WxStreamSets.zip from Releases section.
2.	Copy WxStreamSets.zip to /${SAG_HOME}/IntegrationServer/instances/${INSTANCE}/replicate/inbound directory.
3.	Login to Integration Server Admin Console http://${HOST_NAME}:${PORT}.
4.	Go to Packages > Management in the left side menu and click Install Inbound Releases.
5.	Choose WxStreamSets.zip from dropdown and click Install.
   
## Generate StreamSets API Credentials
1. Login to StreamSets Control Hub.
2. Expand **Manage** option in the left-hand side naviagtion and choose **API Credentials**.
3. Click on **Add** button.
4. Provide the **Name** for credentials and click **Save & Generate**.
5. Copy the **Credential ID** and **Token**.

## Usage
Following APIs in terms of flow-services are supported:
1. wx.streamsets.v1.jobRunner.services.startJobById - To start a specific job.
2. wx.streamsets.v1.jobRunner.services.getJobCurrentStatusById - To get the status of a specific job.
3. wx.streamsets.v1.jobRunner.services.custom.startJobByIdSync - To start a specific job and wait for it to finish.

All services require three inputs for authentication:
1. auth.baseUrl - Hostname of StreamSets Control Hub. Example: https://test.hub.streamsets.com
2. auth.componentId - Credential ID generated as part of API Credentials
3. auth.token - Token generated as part of API Credentials

______________________
These tools are provided as-is and without warranty or support. They do not constitute part of the Software AG product suite. Users are free to use, fork and modify them, subject to the license agreement. While Software AG welcomes contributions, we cannot guarantee to include every contribution in the master project.
