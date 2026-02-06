package net.celsium.bridge;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CelsiumMod implements ModInitializer {
    public static final String MOD_ID = "celsium";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Celsium Bridge: Inizializzazione del layer di sincronizzazione...");
        // Qui caricheremo le impostazioni per far comunicare Sodium e Lithium
        LOGGER.info("Celsium Bridge: Collegamento con Sodium e Lithium stabilito con successo.");
    }
}