package com.botticelli.bot.request;

public class Constants {

	public static final String APIURL = "https://api.telegram.org/bot";
	public static final String APIFILEURL = "https://api.telegram.org/file/bot";
	public static final String GETME = "/getMe";
	public static final String SENDMESSAGE = "/sendMessage";
	public static final String FORWARDMESSAGE = "/forwardMessage";
	public static final String SENDPHOTO = "/sendPhoto";
	public static final String SENDAUDIO = "/sendAudio";
	public static final String SENDDOCUMENT = "/sendDocument";
	public static final String SENDSTICKER = "/sendSticker";
	public static final String SENDVIDEO = "/sendVideo";
	public static final String SENDVOICE = "/sendVoice";
	public static final String SENDLOCATION = "/sendLocation";
	public static final String SENDCHATACTION = "/sendChatAction";
	public static final String GETUSERPROFILEPHOTOS = "/getUserProfilePhotos";
	public static final String GETUPDATES ="/getUpdates";
	public static final String SETWEBHOOK ="/setWebhook";
	public static final String GETFILE ="/getFile";
	public static final String GETCHAT ="/getChat";
	public static final String GETCHATADMINISTRATORS ="/getChatAdministrators"; 
	public static final String GETCHATMEMBERSCOUNT ="/getChatMembersCount";
	public static final String GETCHATMEMBER ="/getChatMember";
	public static final String LEAVECHAT ="/leaveChat";
	public static final String SENDVENUE ="/sendVenue";
	public static final String SENDGAME ="/sendGame";
	public static final String SETGAMESCORE ="/setGameScore";
	public static final String GETGAMEHIGHSCORES ="/getGameHighScores";
	public static final String GETWEBHOOKINFO ="/getWebhookInfo";
	public static final String SENDCONTACT ="/sendContact";
	public static final String KICKCHATMEMBER ="/kickChatMember";
	public static final String UNBANCHATMEMBER ="/unbanChatMember";
	public static final String EDITMESSAGETEXT ="/editMessageText";
	public static final String EDITMESSAGECAPTION ="/editMessageCaption";
	public static final String EDITMESSAGEREPLYMARKUP ="/editMessageReplyMarkup";
	public static final String ANSWERINLINEQUERY ="/answerInlineQuery";
	public static final String ANSWERCALLBACKQUERY ="/answerCallbackQuery";
	public static final String URLENCODEDCONTENTTYPE = "application/x-www-form-urlencoded";
	public static final String URLDATACONTENTTYPE = "multipart/form-data";
	public static final int SOCKETTIMEOUT = 5000;
	public static final int CONNECTTIMEOUT = 5000;
	public static final int CONNECTIONREQUESTTIMEOUT = 5000;
}
