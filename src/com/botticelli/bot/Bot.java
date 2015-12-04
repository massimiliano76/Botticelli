package com.botticelli.bot;

import java.util.List;
import java.util.logging.Logger;

import com.botticelli.bot.request.RequestMaker;
import com.botticelli.bot.request.methods.AudioFileToSend;
import com.botticelli.bot.request.methods.AudioReferenceToSend;
import com.botticelli.bot.request.methods.ChatActionToSend;
import com.botticelli.bot.request.methods.DocumentFileToSend;
import com.botticelli.bot.request.methods.DocumentReferenceToSend;
import com.botticelli.bot.request.methods.ForwardMessageToSend;
import com.botticelli.bot.request.methods.LocationToSend;
import com.botticelli.bot.request.methods.MessageToSend;
import com.botticelli.bot.request.methods.PhotoFileToSend;
import com.botticelli.bot.request.methods.PhotoReferenceToSend;
import com.botticelli.bot.request.methods.StickerFileToSend;
import com.botticelli.bot.request.methods.StickerReferenceToSend;
import com.botticelli.bot.request.methods.UpdateRequest;
import com.botticelli.bot.request.methods.UserProfilePhotosRequest;
import com.botticelli.bot.request.methods.VideoFileToSend;
import com.botticelli.bot.request.methods.VideoReferenceToSend;
import com.botticelli.bot.request.methods.VoiceFileToSend;
import com.botticelli.bot.request.methods.VoiceReferenceToSend;
import com.botticelli.bot.request.methods.types.Message;
import com.botticelli.bot.request.methods.types.Update;
import com.botticelli.bot.request.methods.types.UserProfilePhotos;

public abstract class Bot {

	private RequestMaker rm;
	
	public Bot(String token)
	{
		if(token == null)
			throw new IllegalArgumentException("Token was null");
		rm = new RequestMaker(token);
	}
	
	/**
	 * Return the error logger (use to log exception or others strange things).
	 * @return
	 */
	public static Logger getErrorLogger()
	{
		return RequestMaker.getErrorLogger();
	}
	
	
	/**
	 * Use this method to receive incoming updates using long polling. 
	 * An Array of Update objects is returned. 
	 * @param upr
	 * @return
	 */
	public final List<Update> getUpdates(UpdateRequest upr)
	{
		if(upr == null)
			return null;
		return rm.getUpdates(upr);
	}
	
	/**
	 * Use this method to send text messages. On success, the sent Message is returned.
	 * @param mts
	 * @return
	 */
	public final Message sendMessage(MessageToSend mts)
	{
		if(mts == null)
			return null;
		return rm.sendMessage(mts);
	}
	
	/**
	 * Use this method to forward messages of any kind. On success, the sent Message is returned.
	 * @param fts
	 * @return
	 */
	public final Message forwardMessage(ForwardMessageToSend fts)
	{
		if(fts == null)
			return null;
		return rm.forwardMessage(fts);
	}
	
	/**
	 * Use this method to send Photos by file_id, On success, the sent Message is returned.
	 * @param prs
	 * @return
	 */
	public final Message sendPhotobyReference(PhotoReferenceToSend prs)
	{
		if(prs == null)
			return null;
		return rm.sendPhotobyReference(prs);
	}
	
	/**
	 * Use this method to send photos by file. On success, the sent Message is returned.
	 * @param pfs
	 * @return
	 */
	public final Message sendPhotoFile(PhotoFileToSend pfs)
	{
		if(pfs == null)
			return null;
		return rm.sendPhotoFile(pfs);
	}
	
	/**
	 * Use this method to send Audio by file_id, On success, the sent Message is returned.
	 * @param ars
	 * @return
	 */
	public final Message sendAudiobyReference(AudioReferenceToSend ars)
	{
		if(ars == null)
			return null;
		return rm.sendAudiobyReference(ars);
	}
	
	/**
	 * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
	 * For this to work, your audio must be in an .ogg file encoded with OPUS 
	 * (other formats may be sent as Document). 
	 * On success, the sent Message is returned. 
	 * Bots can currently send audio files of up to 50 MB in size, 
	 * this limit may be changed in the future.
	 * @param afs
	 * @return
	 */
	public final Message sendAudioFile(AudioFileToSend afs)
	{
		if(afs == null)
			return null;
		return rm.sendAudioFile(afs);
	}
	
	/**
	 * Use this method to send general files. 
	 * On success, the sent Message is returned. 
	 * Bots can currently send files of any type of up to 50 MB in size, 
	 * this limit may be changed in the future.
	 * @param dfs
	 * @return
	 */
	public Message sendDocumentFile(DocumentFileToSend dfs)
	{
		if(dfs == null)
			return null;
		return rm.sendDocumentFile(dfs);
	}
	
	/**
	 * Use this method to send files by file_id, On success, the sent Message is returned.
	 * @param drs
	 * @return
	 */
	public final Message sendDocumentbyReference(DocumentReferenceToSend drs)
	{
		if(drs == null)
			return null;
		return rm.sendDocumentbyReference(drs);
	}
	
	/**
	 * Use this method to send Stickers by file_id, On success, the sent Message is returned.
	 * @param srs
	 * @return
	 */
	public final Message sendStickerbyReference(StickerReferenceToSend srs)
	{
		if(srs == null)
			return null;
		return rm.sendStickerbyReference(srs);
	}
	
	/**
	 * Use this method to send .webp stickers. On success, the sent Message is returned.
	 * @param sfs
	 * @return
	 */
	public final Message sendStickerFile(StickerFileToSend sfs)
	{
		if(sfs == null)
			return null;
		return rm.sendStickerFile(sfs);
	}
	
	/**
	 * Use this method to send video files by file_id, On success, the sent Message is returned.
	 * @param vrs
	 * @return
	 */
	public final Message sendVideobyReference(VideoReferenceToSend vrs)
	{
		if(vrs == null)
			return null;
		return rm.sendVideobyReference(vrs);
	}
	

	public final Message sendVoiceFile(VoiceFileToSend vfs)
	{
		if(vfs == null)
			return null;
		return rm.sendVoiceFile(vfs);
	}
	
	public final Message sendVoicebyReference(VoiceReferenceToSend vrs)
	{
		if(vrs == null)
			return null;
		return rm.sendVoicebyReference(vrs);
	}
	
	/**
	 * Use this method to send video files, 
	 * Telegram clients support mp4 videos (other formats may be sent as Document). 
	 * On success, the sent Message is returned. 
	 * Bots can currently send video files of up to 50 MB in size, 
	 * this limit may be changed in the future.
	 * @param vfs
	 * @return
	 */
	public final Message sendVideoFile(VideoFileToSend vfs)
	{
		if(vfs == null)
			return null;
		return rm.sendVideoFile(vfs);
	}
	/**
	 * Use this method to send point on the map. On success, the sent Message is returned.
	 * @param lts
	 * @return
	 */
	public final Message sendLocation(LocationToSend lts)
	{
		if(lts == null)
			return null;
		return rm.sendLocation(lts);
	}
	
	/**
	 * Use this method when you need to tell the user that something is happening on the bot's side.
	 * The status is set for 5 seconds or less (when a message arrives from your bot, 
	 * Telegram clients clear its typing status).
	 * Example: 
	 * The ImageBot needs some time to process a request and upload the image. 
	 * Instead of sending a text message along the lines of �Retrieving image, please wait��, 
	 * the bot may use sendChatAction with action = upload_photo. 
	 * The user will see a �sending photo� status for the bot. 
	 * @param cts
	 * @return
	 */
	public final void sendChatAction(ChatActionToSend cts)
	{
		if(cts == null)
			return;
		rm.sendChatAction(cts);
	}

	/**
	 * Use this method to get a list of profile pictures for a user. 
	 * Returns a UserProfilePhotos object.
	 * @param upr
	 * @return
	 */
	public final UserProfilePhotos getUserProfilePhotos(UserProfilePhotosRequest upr)
	{
		if(upr == null)
			return null;
		return rm.getUserProfilePhotos(upr);
	}
	
	/**
	 * This method read the message values and pass the message on to the appropriate method.
	 * @param message
	 */
	public final void manageMessage(Message message)
	{
		if(message.getText() != null)
		{
			textMessage(message);
			return;
		}
		
		if(message.getAudio() != null)
		{
			audioMessage(message);
			return;
		}
		
		if(message.getDocument() != null)
		{
			documentMessage(message);
			return;
		}
		
		if(message.getPhoto() != null)
		{
			photoMessage(message);
			return;
		}
		
		if(message.getSticker() != null)
		{
			stickerMessage(message);
			return;
		}
		
		if(message.getVideo() != null)
		{
			videoMessage(message);
			return;
		}

		if(message.getVoice() != null)
		{
			voiceMessage(message);
		}
		if(message.getContact() != null)
		{
			contactMessage(message);
			return;
		}
		
		if(message.getLocation() != null)
		{
			locationMessage(message);
			return;
		}
		
		if(message.getNewChatParticipant() != null)
		{
			newChatParticipantMessage(message);
			return;
		}
		
		if(message.getLeftChatPartecipant() != null)
		{
			leftChatParticipantMessage(message);
			return;
		}
		
		if(message.getNewChatTitle() != null)
		{
			newChatTitleMessage(message);
			return;
		}
		
		if(message.getNewChatPhoto() != null)
		{
			newChatPhotoMessage(message);
			return;
		}
		
		if(message.GetDeleteChatPhoto())
		{
			groupChatPhotoDeleteMessage(message);
			return;
		}
		
		if(message.GetGroupChatCreated())
		{
			groupChatCreatedMessage(message);
			return;
		}
	}
	/**
	 * This method will be called when bot received a text message.
	 * @param m
	 */
	public abstract void textMessage(Message m);
	/**
	 * This method will be called when bot received an audio file (not voice).
	 * @param m
	 */
	public abstract void audioMessage(Message m);
	/**
	 * This method will be called when bot received a video.
	 * @param m
	 */
	public abstract void videoMessage(Message m);
	/**
	 * This method will be called when bot received a voice message
	 * @param m
	 */
	public abstract void voiceMessage(Message m);
	/**
	 * This method will be called when bot received a sticker.
	 * @param m
	 */
    public abstract void stickerMessage(Message m);
	/**
	 * This method will be called when bot received a File
	 * @param m
	 */
    public abstract void documentMessage(Message m);
    /**
     * This method will be called when bot received a photo
     * @param m
     */
    public abstract void photoMessage(Message m);
    /**
     * This method will be called when bot received a contact
     * @param m
     */
    public abstract void contactMessage(Message m);
    /**
     * This method will be called when bot received a location
     * @param m
     */
    public abstract void locationMessage(Message m);
    /**
     * This method will be called when a new participant join the Chat.
     * @param m
     */
    public abstract void newChatParticipantMessage(Message m);
    /**
     * This method will be called when a participant left the chat
     * @param m
     */
    public abstract void leftChatParticipantMessage(Message m);
    /**
     * This method will be called when the chat title is changed
     * @param m
     */
    public abstract void newChatTitleMessage(Message m);
    /**
     * This method will be called when the photo chat is changed
     * @param m
     */
    public abstract void newChatPhotoMessage(Message m);
    /**
     * This method will be called when the photo chat is deleted
     * @param m
     */
    public abstract void groupChatPhotoDeleteMessage(Message m);
    /**
     * This method will be called when the group chat is created
     * @param m
     */
    public abstract void groupChatCreatedMessage(Message m);
	
}