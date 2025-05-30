package com.github.kaktushose.jda.commands.dispatching.adapter.impl;

import com.github.kaktushose.jda.commands.dispatching.adapter.TypeAdapter;
import net.dv8tion.jda.api.events.interaction.GenericInteractionCreateEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

/// Type adapter for short values.
public class ShortAdapter implements TypeAdapter<Short> {

    /// Attempts to parse a String to a Short.
    ///
    /// @param raw   the String to parse
    /// @param event the [GenericInteractionCreateEvent]
    /// @return the parsed Short or an empty Optional if the parsing fails
    @NotNull
    @Override
    public Optional<Short> apply(@NotNull String raw, @NotNull GenericInteractionCreateEvent event) {
        try {
            return Optional.of(Short.valueOf(raw));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }
}
