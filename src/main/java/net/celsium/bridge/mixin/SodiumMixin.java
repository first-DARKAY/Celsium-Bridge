package net.celsium.bridge.mixin;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class SodiumMixin {
    @Inject(method = "setupTerrain", at = @At("HEAD"))
    private void onSetupTerrain(CallbackInfo ci) {
        // Questo iniettore forza una priorità maggiore alla sincronizzazione dei chunk
        // quando sono presenti mod come Lithium e C2ME.
    }
}