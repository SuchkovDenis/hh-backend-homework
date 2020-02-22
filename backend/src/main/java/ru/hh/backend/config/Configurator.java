package ru.hh.backend.config;

import io.sentry.logback.SentryAppender;
import org.slf4j.event.Level;
import ru.hh.nab.logging.HhMultiAppender;
import ru.hh.nab.starter.NabLogbackBaseConfigurator;

public class Configurator extends NabLogbackBaseConfigurator {
    @Override
    public void configure(LoggingContextWrapper context, HhMultiAppender service, HhMultiAppender libraries,
                          SentryAppender sentry) {
        getRootLogger(context).setLevel(Level.INFO);
    }
}
