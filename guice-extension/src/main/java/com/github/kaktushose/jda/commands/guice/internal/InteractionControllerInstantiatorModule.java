package com.github.kaktushose.jda.commands.guice.internal;

import com.github.kaktushose.jda.commands.annotations.interactions.Interaction;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.dv8tion.jda.api.JDA;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class InteractionControllerInstantiatorModule extends AbstractModule {

    private final JDA jda;

    public InteractionControllerInstantiatorModule(JDA jda) {
        this.jda = jda;
    }

    @Override
    protected void configure() {
        bindScope(Interaction.class, new PerModuleScope());
    }

    @Provides
    public JDA jda() {
        return jda;
    }
}
