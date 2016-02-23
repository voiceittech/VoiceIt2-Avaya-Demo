# A Demo using the VoiceIt Avaya Orchestration Designer Plugin

A sample Avaya Orchestration Designer 7.x application that does demonstrate the functionality of voice biometric authentication by
using the VoiceIt&trade; Plug-in for Orchestration Designer.

The application will create a user based on the callers *session:ani* value and allow the caller to enroll in voice authentication.
Enrollment is the process of saying a phrase 3 times. Once enrollment is complete, the caller can then authenticate by speaking the
same phrase. If authentication is successful, the caller will have the option to remove their enrollments and re-enroll, or remove
their user account from the system.

## Pre-Requisites

- VoiceIt Account -- [VoiceIt Developer Registration](https://siv.voiceprintportal.com/getDeveloperID.jsp)
- Avaya&reg; Orchestration Designer 7.x configured with Java 7 or greater

## Installing the plugin

1. [Installing the VoiceIt&trade; Plug-in for Orchestration Designer](http://voiceit.tech/avayainstall/)
2. Import the [VoiceItDemo](https://github.com/voiceittech/voiceit-avaya-demo/archive/master.zip) into your workspace.

## Configure

1. Right-click the *VoiceItDemo* application and select **Properties**.
2. Select the type **Orchestration Designer** from the list on the left.
3. Select the **Pluggable Connectors** tab in the *Orchestration Designer* properties pane on the right.
4. In the list of available connectors, select the **VoiceIt&trade; API Functionality** plugin.
5. In the *VoiceIt&trade; API Functionality Configuration*, replace the developer id value with your own VoiceIt developer id.
6. If necessary, change the default VoiceIt language to use. 
6. Click the **OK** button to save your changes.

## Help

Refer to **Voice Plug-in for Orchestration Designer** topic in the Eclipse built-in help contents.

## Implemented functions:

- Get User -- Retrieves an existing user profile within the Voiceprint Developer Portal (VPDP) service.
- Create User -- Registers a new user profile within the Voiceprint Developer Portal (VPDP) service.
- Delete User -- Delete an existing user profile within the Voiceprint Developer Portal (VPDP) service.
- Get Enrollments -- Retrieves the existing enrollment template(s) for the specified user profile within the Voiceprint Developer Portal (VPDP) service.
- Create Enrollment -- Creates a new enrollment template for the specified user profile within the Voiceprint Developer Portal (VPDP) service.
- Delete Enrollment -- Delete an existing enrollment template for the specified user profile within the Voiceprint Developer Portal (VPDP) service.
- Authenticate -- Authenticate the specified user profile within the Voiceprint Developer Portal (VPDP) service.
- Set Language -- Sets the VoiceIt specific language to use for a previously mentioned function.
