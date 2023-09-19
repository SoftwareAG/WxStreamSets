# WxStreamSets
WxStreamSets is a  webMethods Integration Server package designed to simplify the interaction with StreamSets. It provides a seamless way to configure, manage, and monitor pipelines related to StreamSets jobs.
For efficient StreamSets API interaction, the package includes an API credentials integration.

**Pre-requisites**
---
  - webMethods Integration Server: Developed and tested on Integration Server 10.11.

 **1. Features**
 ---
1.	StreamSets Integration: Seamlessly interact with StreamSets using webMethods Integration Server.
2.	API Credentials: Securely configure API credentials for authenticating with StreamSets APIs.
3.	Pipeline Monitoring: Easily monitor the status and progress of StreamSets pipelines.
4.	Flexible Configuration: Tailor the package to your specific StreamSets setup and requirements.
 
**2. Install WxStreamSets package**
---
1.	Download the latest release of WxStreamSets.zip from Releases section.
2.	Copy WxStreamSets.zip to /${SAG_HOME}/IntegrationServer/instances/${INSTANCE}/replicate/inbound directory.
3.	Login to Integration Server Admin Console http://${HOST_NAME}:5555.
4.	Go to Packages > Management in the left side menu and click Install Inbound Releases.
5.	Choose WxStreamSets.zip from dropdown and click Install.
   
**3. Configure Streamsets APIs Authorization**
---
1.	Navigate to the Streamsets UI and select the Manage Tab on the left to view the API Credentials to generate as authorization for the WxStreamSets Package.
2.	They are special fields that must be given in order to perform the Start,getCurrentStatus, and Stop APIs to pass the values generated in the StreamSets UI, which are Credentials ID and Token.

**4. Consume StreamSets API with WxStreamSets**
---
  To consume StreamSets API using the WxStreamSets package, follow these simple steps:
1.	Authentication: Ensure you have configured your StreamSets API credentials in the WxStreamSets package.
2.	Choose API Endpoint: Identify the specific API endpoint or URL for the StreamSets resource you want to access (e.g., pipelines, jobs).
3.  The package consists of two services: one that can startJob and  getCurrentStatus of the job. Once the job is completed, it becomes inactive.
   
     •	startJob flowservice 
  
          1. The "StartJob" Flow Service is essential for initiating StreamSets jobs.It relies on specific input parameters like the job ID, API Credentials, and StreamSets UI URL to properly start the service.
          2. Within this service, the logic is established to facilitate both synchronous and asynchronous API calls for commencing the StreamSets job.
          3. This includes creating the API request, determining the appropriate HTTP method  POST for creating resources, sending it to the StreamSets server, and managing the ensuing response.
          4. To ensure robust functionality, the service includes error-handling mechanisms capable of capturing and addressing any potential issues, such as problems with the API request,authentication, or server-related errors.
          5. Additionally, the Flow Service defines outputs, which may encompass response codes, job start statuses, or any data furnished by the StreamSets server, providing users with the necessary information for seamless job initiation.
          6. It also ensures that necessary request headers, such as content type and authorization headers, are included in the API request for proper communication.


     •	getCurrentStatus flowservice 
      
          1.	The "GetCurrentStatus" Flow Service is dedicated to obtaining the present status of a job.It relies on specific input parameters such as the job ID, API Credentials, and the StreamSets UI URL to accurately pinpoint the job's information.
          2.	Inside this Flow Service, we've implemented the logic for making API calls, both  synchronously and asynchronously, to retrieve the StreamSets job's current status.
          3.	We construct the API request, determine the appropriate HTTP method (e.g., GET for retrieving Status of the job), send it over to the StreamSets server, and then carefully handle the response that comes back.
          4.	We've also implemented error-handling measures to deal with potential issues that might crop up during the status retrieval process, encompassing concerns related to API requests, authentication, or server responses.
          5.	The Flow Service defines outputs that deliver the current job status information, which can include details like the job's ongoing state, progress, or any other relevant data fetched from the StreamSets server, ensuring that users have easy access to this valuable information.
          6.	Additionally, we make sure to include necessary request headers, such as content type and authorization headers, in the API request to facilitate proper communication with the StreamSets server.
          


