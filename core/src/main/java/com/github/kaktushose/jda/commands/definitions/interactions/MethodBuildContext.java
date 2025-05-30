package com.github.kaktushose.jda.commands.definitions.interactions;

import com.github.kaktushose.jda.commands.annotations.interactions.Interaction;
import com.github.kaktushose.jda.commands.definitions.description.ClassDescription;
import com.github.kaktushose.jda.commands.definitions.description.MethodDescription;
import com.github.kaktushose.jda.commands.definitions.interactions.command.CommandDefinition;
import com.github.kaktushose.jda.commands.definitions.interactions.command.CommandDefinition.CommandConfig;
import com.github.kaktushose.jda.commands.definitions.interactions.command.SlashCommandDefinition.CooldownDefinition;
import com.github.kaktushose.jda.commands.dispatching.validation.internal.Validators;
import net.dv8tion.jda.api.interactions.commands.localization.LocalizationFunction;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Set;

/// Holds all objects needed to create an [InteractionDefinition].
@ApiStatus.Internal
public record MethodBuildContext(
        @NotNull Validators validators,
        @NotNull LocalizationFunction localizationFunction,
        @NotNull Interaction interaction,
        @NotNull Set<String> permissions,
        @Nullable CooldownDefinition cooldownDefinition,
        @NotNull ClassDescription clazz,
        @NotNull MethodDescription method,
        @NotNull Collection<AutoCompleteDefinition> autoCompleteDefinitions,
        @NotNull CommandConfig globalCommandConfig
        ) {}
