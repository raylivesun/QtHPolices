# QTH Polices

Power Up Your Jakarta EE
Applications with Telegram
Chatbots

value proposition and overall user experience.
The Value Proposition
• Accessibility: Telegram has a user base of over 800 million across different platforms.
Chatbots meet users where they already are, eliminating the need to download separate
applications and removing potential barriers to access.
• Reach: Telegram's global presence lets you connect with users internationally, using its
multilingual capabilities to expand your application's potential users.
• User-friendly Interaction: Chatbots allow natural conversation, providing an easy and
low-friction way for users to interact with your application's services.
• Automation: Simplify routine tasks and customer support inquiries with chatbots. Reduce
manual workloads, improve response times, and provide 24/7 availability.
Target Audience
This guide assumes you have a foundational understanding of Jakarta EE concepts and development
practices. Head over to the Payara Learn centre for in-depth resources on Jakarta EE development
if you are new to the platform.
Prerequisites
• A Telegram Account: You'll need a Telegram account to interact with the Bot API.
• Telegram Bot: Use @BotFather on Telegram to create a new bot and obtain its unique
API token.
• Basic Jakarta EE Setup: Ensure you have a working Jakarta EE development environ-
ment and application server. Head over to Payara Starter to scaffold a new Jakarta EE app.
Depending on what you chose for the scaffolding, you can also click here to download
Payara Community as your Jakarta EE runtime.
Power Up Your Jakarta EE Applications with Telegram Chatbots2
Telegram Bot Basics
Setup
• Understanding the Telegram Bot API: At its core, the Telegram Bot API is a set of
instructions (like a blueprint) that allows your application to communicate and interact
with the Telegram messaging platform. Think of it as a bridge between your code and
Telegram's servers.
• Creating Your Bot with BotFather: Telegram has an official bot called "BotFather" that's
specifically designed to help you create and manage other bots. To create your own bot:
• Find BotFather: Open Telegram and search for "BotFather". Look for the bot with a blue
checkmark for verification. Or click this link.
• Start a Conversation: Type /start and send the message to begin interacting
with BotFather.
• Issue the Command: Type /newbot and press send. BotFather will guide you through a
couple of simple steps:
• Name: Choose a display name for your bot (this is what your users will see).
• Username: Create a unique username for your bot that must end in "bot" (this is for
searching and tagging).
• Claim Your Token: After setting up your bot, BotFather will provide you with a unique API
token. It looks like this: 123456789:AAFhHHHyYYYYY1234567ZZZ. Keep this token safe
and secret! Anyone with access to your token can fully control your bot. For this guide, we
will create the PayaraFishBot. You should be able to interact with this bot on Telegram after
reading this guide.
The Bot API
The Telegram bot API allows you to create an easy to use interface into your application through
bots. A bot acts as a “middleman” between your application and the end user. You set up your bot to
be able to respond to specific instructions and then carry out some function within your application
based on user interaction, return some kind of data to the user from your application or update some
information based on the user input. A user interacts with your bot, the Telegram Bot API calls your
bot backend code in your application to respond to the user. This way, you get a simplified UI into
your app without needing to make a lot of upfront investment in the underlying technology.
Power Up Your Jakarta EE Applications with Telegram Chatbots3
From the above image, a user interacts with the bot, the Telegram Bot API calls your backend imple-
mentation which can carry out any number of functions like storing some data, calling some other
cloud service provider or triggering some process. Note that all the interactions are bidirectional,
meaning both users and your backend can send information to each other. This allows for seamless
communication between your application and users through a simplified channel that users already
have, or easy to install from their app stores.
Power Up Your Jakarta EE Applications with Telegram Chatbots4
Real-World Use Cases for a Telegram Bot
Telegram bots can significantly enhance the functionality and user experience of your Jakarta EE
applications by providing a familiar and convenient communication channel. Here are some example
use cases:
• Customer Support Automation:
• FAQ Answering: Imagine a 24/7 virtual assistant powered by your Jakarta EE applica-
tion. Users can interact with the bot to get instant answers to frequently asked ques-
tions (FAQs). This frees up human customer support agents to handle more complex
issues while providing immediate assistance to users.
• Ticketing System Integration: The bot can seamlessly integrate with your Jakarta EE
ticketing system. Users can submit tickets directly through the Telegram chat, detailing
their issues. The bot can capture essential information and create tickets within the
system, streamlining the support process.
• Notifications and Alerts:
• Proactive Order Status Updates: Your Jakarta EE application can leverage the bot to
send proactive notifications to customers about their orders. For instance, the bot can
notify them when an order is shipped, delayed, or delivered. This improves customer
satisfaction by keeping them informed and managing expectations.
• Real-Time System Monitoring: The bot can be integrated with your application's
monitoring tools. If critical issues arise (e.g., server overload, service outage), the bot
can instantly notify IT staff through a dedicated Telegram group chat, enabling them to
take swift action and minimise downtime. Payara Server Enterprise has the notification
feature that supports Telegram alerts
• Data Collection and Feedback:
• Customer Satisfaction Surveys: Following interactions or transactions, the bot can
initiate brief customer satisfaction surveys via Telegram chats. This allows you to gather
valuable feedback in real-time, identify areas for improvement, and demonstrate your
commitment to customer satisfaction.
• Employee Onboarding Surveys: During the employee onboarding process, your
Jakarta EE application can utilise the bot to deliver surveys or quizzes through
Telegram. This can streamline information gathering, gauge knowledge retention, and
personalise the onboarding experience.
Power Up Your Jakarta EE Applications with Telegram Chatbots5
Building the Bot Backend
WIth your bot created and auth key generated, you are ready to build the backend of your bot. A
Telegram bot backend is some code that listens for updates to the bot and reacts based on the update.
The user initiates a chat with your bot through some custom commands, then your bot responds
with whatever your backend is programmed to respond with based on the given commands. Your
bot backend then acts as a sort of API that gets called by the Telegram Bot API based user requests
to your bot in the form of chats.
Adding The Library
The Telegram Bot API is a set of HTTP REST endpoints that you can make requests to from your
backend stack. Of course on the Jakarta EE Platform, we have excellent REST clients like the Jakarta
REST and MicroProfile REST clients. However, as is typical of the Java ecosystem, there are pre-
made Java libraries that make it even easier. There are two popular Java libraries for consuming
the Telegram API in your Java applications. These are the Java Telegram Bot and the Telegram Bots
Java library. Both libraries offer comparable functionality. For this guide, we will use the former. So
let’s add it to our project dependencies.
```xml
<dependency>
<groupId>com.github.pengrad</groupId>
<artifactId>java-telegram-bot-api</artifactId>
<version>7.2.1</version>
</dependency>
```
With the dependency added to our project, we are ready to build the backend of the bot. Let’s start
with a basic listener.
Listening To Bot Chats
The easiest way to get started building your bot backend is to have a polling listener implementation
that listens for updates. An update is any interaction with your bot by a user. The Telegram Bot API
pushes these updates to your listener, and then you can react to these messages, send responses,
or do whatever it is the user is requesting for. Let’s implement a listener that reacts to messages
sent to our bot. First let’s create the shell class.
Power Up Your Jakarta EE Applications with Telegram Chatbots6
```java
@Startup
@Singleton
public class PayaraBotBackend {
@Inject
@ConfigProperty(name = "TELEGRAM_BOT_KEY")
String telegramBotKey;
TelegramBot bot;
@PostConstruct
void init() {
bot = new TelegramBot(telegramBotKey);
bot.setUpdatesListener(updates -> {
for (Update update : updates) {
}
return UpdatesListener.CONFIRMED_UPDATES_ALL;
});
}
```
The PayaraBotBackend is a singleton class that will be instantiated during application startup. We
create a postconstruct method to initialise the Telegram bot object. The class injects the TelegramBot
key as a configuration property through the MIcroProfile Config Property API. Because the bot key
is an access key, it should NOT be part of the application code, as the code can and will be checked
into source control. The key should be externalised and only injected into the application in each
environment the application is run. The standard way to do this on the Jakarta EE Platform is through
the use of the MicroProfile Config API. If you are new to that API, check out this quick guide for an
introduction to it. The class uses the injected key to initialise the TelegramBot object.
With the TelegramBot object initialised, we can register an updates listener. The
setUpdatesListener method takes an UpdatesListener interface implementation. The
UpdatesListener has a single method, process.

```java
public interface UpdatesListener {
int process(List<Update> updates);
}
```

Power Up Your Jakarta EE Applications with Telegram Chatbots7
The UpdatesListener, as the name implies, listens for updates on your bot, gets a list of the updates
passed to the process method, and returns the ID of the last processed update from the passed
list. An update is any interaction with your bot. An UpdateListener implementation allows you to
implement custom responses based on whatever interaction a user is having with your bot. With
our class outline in place, let’s implement our first response to an update.

```
@Startup
@Singleton
public class PayaraBotBackend {
@Inject
@ConfigProperty(name = "TELEGRAM_BOT_KEY")
String telegramBotKey;
TelegramBot bot;
@PostConstruct
void init() {
bot = new TelegramBot(telegramBotKey);
bot.setUpdatesListener(updates -> {
for (Update update : updates) {
updateAction(update);
}
return UpdatesListener.CONFIRMED_UPDATES_ALL;
});
}
```
```java
private void updateAction(Update update) {
if (update.message() != null && update.message().text() != null) {
if ("Hi".equalsIgnoreCase(update.message().text())) {
InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup(
new InlineKeyboardButton("Products").
callbackData("products"),
new InlineKeyboardButton("Company").
callbackData("company"),
Power Up Your Jakarta EE Applications with Telegram Chatbots8
new InlineKeyboardButton("Contact").
callbackData("contact"));
SendMessage request = new SendMessage(update.message().chat().
id(), "Hello there. Welcome to Payara. What can I do for you today?")
.parseMode(ParseMode.HTML)
.disableWebPagePreview(true)
.disableNotification(true)
.replyMarkup(inlineKeyboard);
sendMessage(request);
}
}
}
private void sendMessage(SendMessage sendMessage) {
bot.execute(sendMessage, new Callback<SendMessage, SendResponse>() {
@Override
public void onResponse(SendMessage request, SendResponse response)
{
}
@Override
public void onFailure(SendMessage request, IOException e) {
}
});
}
```
The UpdateListener implementation calls the updateAction method for each Update in the passed
Updates list. For each Update, we call the updateAction method, passing it the Update. Within the
updateAction method, we check if the Message object is not null, then get the text object from the
Message instance. A Message is an encapsulation of a message from the user. A user can interact
with your bot through sending messages they type with their keyboard, or pick from options that
you provide. More on the latter in a bit. If the text of the message, which is represented as a simple
String type, is equal to the literal “Hi” irrespective of the casing, then we send back a predefined
response in the form of an inline keyboard.
Power Up Your Jakarta EE Applications with Telegram Chatbots9
Keyboards
You can send predefined messages to the user for them to make a choice using the concept of
Keyboards. A keyboard in Telegram bot terms, is a custom interface that appears below the chat input
field when the user interacts with your bot. Keyboards offer a structured way for users to interact
with your bot by providing buttons with predefined options or actions.
Types of Keyboards:
Reply Keyboards: These appear directly below the chat input and offer a set of text-based buttons.
When the user taps a button, the text of that button is sent as a message to the bot. Reply keyboards
streamline input and guide user choices.
Inline Keyboards: These are integrated with specific messages sent by the bot. Buttons can perform
various actions:
Callback Buttons: Trigger a callback function within your bot's code, allowing for complex interac-
tions without the user needing to type.
URL Buttons: Open a website or external link.
Switch to Inline Buttons: Transition the user into Telegram's "inline query" mode for interacting
with the bot within another chat.
Benefits of Using Keyboards
Improved User Experience: Keyboards provide a guided and intuitive way for users to interact,
reducing the need to type and minimising potential errors.
Structured Input: Keyboards help you collect specific information from the user in a struc-
tured manner.
Bot Functionality: Keyboards enable you to design more complex bot interactions, allowing users
to make selections, navigate menus, and trigger specific actions.
Responding To User Input
For our “Hi” greeting from the user, we respond with a set of options for the user to pick from. In
effect, saying “Hi” is how a user initiates a chat, or conversation with our bot. When the user says
“Hi,” the bot responds with the message “Hello there. Welcome to Payara. What can I do for you
today?” and then offers the user three menu options through the inline keyboard - Products, Company,
Contact. Each of the buttons on the keyboard has a callback data that we set. Using this callback
data, we are able to listen for which option the user selects. The screenshot below shows the first
user greeting, the bot’s response and the keyboard options.
Power Up Your Jakarta EE Applications with Telegram Chatbots10
Each of the InlineKeyboardButton has a callback data. In the code, we listen in if the incoming
Update has a Callback and a callback data corresponding to any of the three we are interested in. For
the above options, we set the callbacks for Product as product, Company as company and Contact
as contact. So if the Update contains a Callback whose data is any of the three, we respond with the
relevant information.
The code below shows responding to the user selecting the Company option.
```java
private void companyUpdateCallback(Update update) {
if (update.message() == null && update.callbackQuery() != null
&& "company".equalsIgnoreCase(update.callbackQuery().data())) {
System.out.println(update.callbackQuery().toString());
InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup(
new InlineKeyboardButton("More About Payara").url("https://www.payara.
fish/about/"),
new InlineKeyboardButton("Join Us").url("https://www.payara.fish/join-
us/"));
SendMessage request = new SendMessage(update.callbackQuery().
maybeInaccessibleMessage().chat().id(),
"Payara Services is the globally distributed company behind the open
source Payara Server Jakarta EE and MicroProfile Runtime. Payara deeply
believes enterprises building solutions on the Jakarta EE Platform deserve
a modern, highly optimised runtime that saves them money, time and helps
them delight their users. So we strive to deliver that to our users.")
.parseMode(ParseMode.HTML)
.disableWebPagePreview(true)
.disableNotification(true)
.replyMarkup(inlineKeyboard);
sendMessage(request);
}
}
```
Power Up Your Jakarta EE Applications with Telegram Chatbots11
The above method takes an Update and checks if the message is null and there is Callback on
the Update. Then it checks if the callback data equals to “company” then we respond with a brief
description of the company and then options that open to learn more about the company and info
on available roles. A sample screenshot is shown below.
As you can see, the bot responded with the company brief and then the links to the company
learn more and Join Us page. Also note that there is no visible response from the user. The
InlineKeyboardMarkup type gives your backend code callbacks to respond to user interactions.
If the user clicks on Products, the following code kicks in the shows the image below.

```java
private void productsUpdateCallback(Update update) {
if (update.message() == null && update.callbackQuery() != null
&& "products".equalsIgnoreCase(update.callbackQuery().data())) {
System.out.println(update.callbackQuery().toString());
InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup(
new InlineKeyboardButton("Payara Server Enterprise").callbackData("server"),
new InlineKeyboardButton("Payara Cloud").callbackData("cloud"),
new InlineKeyboardButton("Payara Server Community").
callbackData("community"));
SendMessage request = new SendMessage(update.callbackQuery().
maybeInaccessibleMessage().chat().id(),
"Which of these products would you be interested in??")
.parseMode(ParseMode.HTML)
Power Up Your Jakarta EE Applications with Telegram Chatbots12
.disableWebPagePreview(true)
.disableNotification(true)
.replyMarkup(inlineKeyboard);
sendMessage(request);
}
}
```
And if the user chooses Payara Server Enteprise, the following code kicks with the ensuing response
in the image below.
```java
private void serverUpdateCallback(Update update) {
if (update.message() == null && update.callbackQuery() != null
&& "server".equalsIgnoreCase(update.callbackQuery().data())) {
System.out.println(update.callbackQuery().toString());
InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup(
new InlineKeyboardButton("Read More").url("https://www.payara.fish/
products/payara-server/"),
new InlineKeyboardButton("Download A Trial")
.url("https://www.payara.fish/page/payara-enterprise-downloads/"),
new InlineKeyboardButton("Speak With Sales").url("https://www.payara.
fish/about/contact-us/"));
SendMessage request = new SendMessage(update.callbackQuery().
maybeInaccessibleMessage().chat().id(),
"Payara Server Enterprise is our fully supported, production ready
Jakarta EE and MicroProfile runtime for deploying modern applications.")
.parseMode(ParseMode.HTML)
.disableWebPagePreview(true)
.disableNotification(true)
.replyMarkup(inlineKeyboard);
sendMessage(request);
}
```
Power Up Your Jakarta EE Applications with Telegram Chatbots13
}
The above code snippet uses the inlineKeyButton with a url. The passed link passed to the url() on
the InlineKeyboardButton will open when the user selects that option. In the above image, if the
user clicks Read More, the the Payara Enterprise page will be opened. Clicking Download A Trial will
open the Payara Enterprise trial download.
Sending The Response
Our bot backend has been sending responses to the user through the SendMessage class. An instance
of this class contains all the information needed to send a message to a user. The snippet below
shows contructing the initial welcome message to send to the user.
SendMessage request = new SendMessage(update.message().chat().id(),
"Hello there. Welcome to Payara. What can I do for you today?")
.parseMode(ParseMode.HTML)
.disableWebPagePreview(true)
.disableNotification(true)
.replyMarkup(inlineKeyboard);
Notice that the first argument to the SendMessage constructor is the chatId. The chatId is used to
identify which chat to send the current message instance to. The second argument is the message to
show to the user. We use the builder pattern to customize the object by setting other properties on the
SendMessage object like the parseMode, disableNotificdation and the the means of replying,
in this case, an InlineKeyboard. The actual sending of the message to the user is done through
the execute method on the TelegramBot instance. The method below takes a SendMessage object
and sends the message async through the execute method on the TelegramBot instance.
Power Up Your Jakarta EE Applications with Telegram Chatbots14
```java
private void sendMessage(SendMessage sendMessage) {
bot.execute(sendMessage, new Callback<SendMessage, SendResponse>() {
@Override
public void onResponse(SendMessage request, SendResponse response) {
}
@Override
public void onFailure(SendMessage request, IOException e) {
}
});
}
```

You can listen for when there is a response sendign the message and when there is an error, and
then respond appropriately.
There’s More
So far in this guide, we have looked at a basic Telegram bot backend implemented in Jakarta EE. There
is so much more to Telegram bots that we cannot cover in this guide. There are many types of media
like files and videos that can be sent to and from your bots, message reactions and so much more.
Head over to the Telegram Bots docs for comprehensive information about all the possibilities they
offer. Once you are done, do consider the following points when implementing your own bot backend.
Power Up Your Jakarta EE Applications with Telegram Chatbots15
Security
Telegram bots provide convenient user interfaces for your applications but also introduce potential
security risks. The following are factors to consider when designing your bot backend:
• The Dangers of Unsanitized Input: Raw user input can come with malicious code designed
to exploit vulnerabilities in your bot or backend systems. Techniques like SQL injection or
cross-site scripting (XSS) can wreak havoc if you don't clean and check user-provided data.
• Importance of Predefined Options: As this guide highlights, relying on predefined options
like "Hi" and InlineKeyboards greatly reduces risk by limiting user inputs to controlled
choices. This proactive approach simplifies interactions and strengthens security.
• The Risks of Open Text Input: Keyboards allowing free text entry require the utmost cau-
tion. Here are some steps to protect your bot and systems:
• Sanitization: Strip out potentially harmful characters or code sequences. Validation:
Verify that input matches expected patterns (e.g., email format, phone numbers, etc.).
Use regular expressions or validation libraries for efficiency.
• Input Limitations: Set reasonable character limits and data type restrictions to prevent
buffer overflow attacks or unexpected inputs.
In essence, by default, distrust user input when it comes to your bot backend and user interactions.
The Telegram Bot API
You can host the Telegram Bot API on yoru own servers for comprehensive security and full con-
trol. In this case, rather than user messages to and from your backend going through the Telegram
hosted Bot API server, they’ll go through your own server. It’s important to note that even though
this option presents you with full control and flexibility, it does come with the added cost of needing
to keep the API server secure, patched and up to date. Whether or not you would want to host the
API server yourself should be a decision that is considered on both technical and business merits.
Summary
This guide provided an introduction to building Telegram bots using the Jakarta EE API constructs.
It highlighted the benefits of Telegram bots, such as automating tasks, providing engaging customer
service, and streamlining interactions within applications. The guide covered the setup procedures
for creating a Telegram bot and building a basic bot backend using Jakarta EE components. You can
check out the bot built in this guide by searching for @PayaraFishBot on Telegram.
Power Up Your Jakarta EE Applications with Telegram Chatbots16
sales@payara.fish UK: +44 800 538 5490
Intl: +1 888 239 8941 www.payara.fish  
Payara Services Ltd 2024 All Rights Reserved. Registered in England and Wales; Registration Number 09998946
Registered Office: Malvern Hills Science Park, Geraldine Road, Malvern, United Kingdom, WR14 3SZ
Key takeaways
• The power of Telegram bots in automating tasks and enhancing user experiences.
• The ease of integrating Telegram Bot API with Jakarta EE's intuitive constructs for rapid
bot development.
• How to create basic bot functionality using Jakarta EE to respond to commands and interact
with other components.
This guide however, just scratched the surface. Jakarta EE's versatility allows for more advanced
bot capabilities like integrating with databases, harnessing external services, and enhancing user
experiences with inline keyboards and rich media. Download Payara Server Community and start
building immersive Telegram bots on the Jakarta EE Platform. Happy Coding!
PAYARA SERVER
FREE TRIAL
PAYARA CLOUD
FREE TRIAL
Interested in Payara? Try Before You Buy
