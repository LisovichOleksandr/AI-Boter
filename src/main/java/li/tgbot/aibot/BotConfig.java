package li.tgbot.aibot;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
@RequiredArgsConstructor
public class BotConfig {

    private final Bot bot;

    @Bean
    public TelegramBotsApi startBot() {

        try {
            DefaultBotSession session = new DefaultBotSession();
            session.setOptions(new DefaultBotOptions());

            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(session.getClass());

            telegramBotsApi.registerBot(bot);

            return telegramBotsApi;
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
