package net.caffeinemc.sodium.mixin.core.pipeline;

import net.caffeinemc.gfx.api.buffer.BufferVertexFormat;
import net.minecraft.client.render.VertexFormat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(VertexFormat.class)
public abstract class MixinVertexFormat implements BufferVertexFormat {
    @Shadow
    public abstract int getVertexSize();

    @Override
    public int stride() {
        return this.getVertexSize();
    }
}
