package com.botticelli.bot.request.methods;

import java.util.Map;

import com.botticelli.bot.request.methods.types.ReplyKeyboard;
/**
 * Represent a common request with parameters to manage if your message is a reply to an other message
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public abstract class AbstractReplyManageToSend extends AbstractToSend{

	private Integer reply_to_message_id;
	private ReplyKeyboard reply_markup;
	
	public AbstractReplyManageToSend(int chat_id) 
	{
		super(chat_id);
	}
	
	public AbstractReplyManageToSend(String channelusername) 
	{
		super(channelusername);
	}
	
	/**
	 * Set the ID of the original message
	 * @param reply_to_message_id
	 */
	public void setReplyToMessageID(Integer reply_to_message_id) 
	{
		this.reply_to_message_id = reply_to_message_id;
	}
	
	/**
	 * Set the additional interface options. A ReplyKeyboard object for a custom reply keyboard, 
	 * instructions to hide keyboard or to force a reply from the user.
	 * @param reply_markup
	 */
	public void setReplyMarkup(ReplyKeyboard reply_markup)
	{
		this.reply_markup = reply_markup;
	}
	
	/**
	 * ID of the original message
	 * @return
	 */
	public Integer getReplytoMessageID()
	{
		return reply_to_message_id;
	}
	
	/**
	 * Additional interface options. A ReplyKeyboard object for a custom reply keyboard, 
	 * instructions to hide keyboard or to force a reply from the user.
	 * @return
	 */
	public ReplyKeyboard getReplyMarkup()
	{
		return reply_markup;
	}
	
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("reply_to_message_id", reply_to_message_id);
		map.put("reply_markup", reply_markup);
		return map;
	}
}
