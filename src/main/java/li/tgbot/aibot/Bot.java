package li.tgbot.aibot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Configuration
public class Bot extends TelegramLongPollingBot {

    @Value("${bot.token}")
    private String botToken;

    @Override
    public String getBotUsername() {
        return "aiBoter";
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
