package coda.oddorganisms.client.renders.render;

import coda.oddorganisms.OddOrganisms;
import coda.oddorganisms.client.models.render.EolactoriaRenderModel;
import com.peeko32213.unusualprehistory.common.entity.msc.render.BaseEntityRender;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class EolactoriaRenderRenderer extends MobRenderer<BaseEntityRender, EolactoriaRenderModel<BaseEntityRender>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(OddOrganisms.MOD_ID, "textures/entity/eolactoria.png");

    public EolactoriaRenderRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new EolactoriaRenderModel<>(renderManagerIn.bakeLayer(EolactoriaRenderModel.LAYER_LOCATION)), 0.3F);
    }

    public ResourceLocation getTextureLocation(BaseEntityRender entity) {
        return TEXTURE;
    }
}
