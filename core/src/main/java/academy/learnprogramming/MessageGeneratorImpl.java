package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageGeneratorImpl implements MessageGenerator{

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    // == fields ==
    @Autowired
    Game game;
    int guessCount = 10;

    // == init ==
    public void reset() {
        log.info("game value: {}", game);
    }

    // == public methods ==
    @Override
    public String getMainMessage() {
        return "good MainMessage";
    }

    @Override
    public String getResultMessage() {
        return "good ResultMessage";
    }
}
