package com.botticelli.messagereceiver;

import com.botticelli.bot.Bot;
import com.botticelli.bot.request.methods.types.InlineQuery;
import com.botticelli.bot.request.methods.types.Message;
/**
 * This thread read the message values and passes them on to the appropriate method.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class HandleMessageThread implements Runnable
{
	private Message message;
	private Bot bot;
	private InlineQuery query;
	
	public HandleMessageThread(Bot bot, Message message) 
	{
		this.message = message;
		this.bot = bot;
	}
	
	public HandleMessageThread(Bot bot, InlineQuery query) 
	{
		this.query = query;
		this.bot = bot;
	}
	
	@Override
	public void run() 
	{
		if(message != null)
		    bot.manageMessage(message);
		else
			bot.inLineQuery(query);
	}

}
